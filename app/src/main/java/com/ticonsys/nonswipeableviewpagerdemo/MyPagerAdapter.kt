package com.ticonsys.nonswipeableviewpagerdemo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class MyPagerAdapter(
        fm: FragmentManager
): FragmentStatePagerAdapter(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> ProductFragment()
            else -> PaymentFragment()
        }
    }
    override fun getCount() = 2
}