package com.sangmin.emergencytreatment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.firebase.auth.FirebaseAuth
import androidx.appcompat.widget.Toolbar;
import java.util.zip.Inflater

class SignUpActivity : AppCompatActivity() {

//    파이어 베이스 연동
   lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        auth = FirebaseAuth.getInstance()

        val emailEdt = findViewById<EditText>(R.id.idEdt)
        val passwordEdt = findViewById<EditText>(R.id.passwordEdt)
        val signUpBtn = findViewById<Button>(R.id.signupBtn)




//        회원가입 버튼 구현
        signUpBtn.setOnClickListener {
            val email = emailEdt.text.toString()
            val password = passwordEdt.text.toString()


//            회원가입 버튼 누를 시 일어나는 동작
            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if(task.isSuccessful){
                        Toast.makeText(this,"회원가입에 성공했습니다!",Toast.LENGTH_SHORT).show()
                        SignUpFromLogin()
                    } else{
                        Toast.makeText(this,"이미 존재하는 계정이거나, 회원가입에 실패했습니다.",Toast.LENGTH_SHORT).show()
                    }
                }



        }
    }

    fun SignUpFromLogin(){
        val myIntnet = Intent(this, LoginActivity::class.java )
        startActivity(myIntnet)
        finish()
    }




    }
