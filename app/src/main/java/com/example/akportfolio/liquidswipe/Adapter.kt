
package com.example.akportfolio.liquidswipe

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class Adapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {
    private val total: Int = 3
    private val data : ArrayList<PageFragment> = ArrayList(total)

    init {
        for (i in 0 until total) {
            val fragment = PageFragment()
            val bundle = Bundle()
            bundle.putInt("POSITION", i+1)
            fragment.arguments = bundle
            data.add(fragment)
        }
    }

    override fun getCount(): Int {
        return total
    }

    override fun getItem(position: Int): Fragment {
        return data[position]
    }
}