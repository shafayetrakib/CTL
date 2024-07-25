package com.cellstechlimited.ctl.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.cellstechlimited.ctl.view.fragment.SignUpAdmin
import com.cellstechlimited.ctl.view.fragment.SignUpEmployee

class SignUpPagerAdapter(fragmentManager:FragmentManager,
    lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager,lifecycle){
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
       return if(position==0){
            SignUpAdmin()
        }else{
            SignUpEmployee()
        }
    }
}