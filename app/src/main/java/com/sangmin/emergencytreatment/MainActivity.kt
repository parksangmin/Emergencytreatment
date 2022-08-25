package com.sangmin.emergencytreatment


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.sangmin.emergencytreatment.adapters.MainViewPagerAdapter

class MainActivity : AppCompatActivity() {

    lateinit var auth: FirebaseAuth

    lateinit var mPagerAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        auth = FirebaseAuth.getInstance()

        mPagerAdapter = MainViewPagerAdapter(this)








    }


}