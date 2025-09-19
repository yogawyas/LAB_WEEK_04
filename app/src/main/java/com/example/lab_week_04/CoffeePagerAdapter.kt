package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class CoffeePagerAdapter(private val fragment: Fragment) : FragmentStateAdapter(fragment) {

    private val coffeeDesc = listOf(
        R.string.starbucks_desc,
        R.string.janjijiwa_desc,
        R.string.kopikenangan_desc
    )

    override fun getItemCount(): Int = coffeeDesc.size

    override fun createFragment(position: Int): Fragment {
        val content = fragment.requireContext().getString(coffeeDesc[position])
        return DetailFragment.newInstance(content)
    }
}
