
package com.example.akportfolio.liquidswipe

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.akportfolio.fragments.FragmentA
import com.example.akportfolio.fragments.FragmentB
import com.example.akportfolio.fragments.FragmentC

class Adapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FragmentA()
            1 -> FragmentB()
            else -> FragmentC()
        }


    }
}