package com.sangmin.emergencytreatment

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val emailEdt = findViewById<EditText>(R.id.idEdt)
        val passwordEdt = findViewById<EditText>(R.id.passwordEdt)
        val signUpBtn = findViewById<Button>(R.id.signupBtn)
        val loginBtn = findViewById<Button>(R.id.loginBtn)

        val email = emailEdt.text.toString()
        val password = passwordEdt.text.toString()




        //      로그인 페이지로 이동
        loginBtn.setOnClickListener {
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
            finish()
        }
        //      회원가입 페이지로 이동
        signUpBtn.setOnClickListener {
            val myIntent = Intent(this, SignUpActivity::class.java)
            startActivity(myIntent)
            finish()
        }


    }


}



