package com.sangmin.emergencytreatment


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.firebase.auth.FirebaseAuth
import com.sangmin.emergencytreatment.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var auth: FirebaseAuth

    lateinit var mPagerAdapter : MainViewPagerAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        auth = FirebaseAuth.getInstance()


        mPagerAdapter = MainViewPagerAdapter(this)
        mainViewPager.adapter = mPagerAdapter

//        바텀 네비게이션 클릭 이벤트 처리
        bottomNav.setOnItemSelectedListener {
            when (it.itemId){
                R.id.search -> mainViewPager.currentItem = 0
                R.id.board -> mainViewPager.currentItem = 1
                R.id.map -> mainViewPager.currentItem = 2
                R.id.setting -> mainViewPager.currentItem = 3
            }
            return@setOnItemSelectedListener true
        }


//       뷰 페이저 연결
        mainViewPager.registerOnPageChangeCallback(
            object : ViewPager2.OnPageChangeCallback(){
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    bottomNav.menu.getItem(position).isChecked = true
                }
            }
        )








    }


}