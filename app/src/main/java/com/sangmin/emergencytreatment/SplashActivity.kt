package com.sangmin.emergencytreatment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        메인 쓰레드와 통신하는 핸드러를 생성
        val myHandler = Handler(Looper.getMainLooper())


        myHandler.postDelayed(
            {

                //                              1500밀리초 이후에 실행될 코드
//                              예시 : 서버에 자동 로그인 기능(뭔가 서버와 통신할때 작업하는 부분)


//                               인텐트로 이동(분기처리 - 로그인 성공 : MainActivity / 로그인 실패 - LoginActivity)


                val myIntent = Intent(this, MainActivity::class.java)
                startActivity(myIntent)
                finish()
            },
            //            지연시킬 시간 - ms 단위로
            3000
        )
    }
}