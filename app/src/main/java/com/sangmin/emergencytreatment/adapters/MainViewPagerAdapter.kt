package com.sangmin.emergencytreatment.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.sangmin.emergencytreatment.fragments.BoardFragment
import com.sangmin.emergencytreatment.fragments.MapFragement
import com.sangmin.emergencytreatment.fragments.SearchFragment
import com.sangmin.emergencytreatment.fragments.SettingFragment

class MainViewPagerAdapter(fa : FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> SearchFragment()
            1 -> BoardFragment()
            2 -> MapFragement()
            else -> SettingFragment()

        }
    }
}