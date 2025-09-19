package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

// Tiap item punya title + desc
val TABS_FIXED = listOf(
    Pair(R.string.starbucks_title, R.string.starbucks_desc),
    Pair(R.string.janjijiwa_title, R.string.janjijiwa_desc),
    Pair(R.string.kopikenangan_title, R.string.kopikenangan_desc),
)

class CafeAdapter(private val fa: FragmentActivity) :
    FragmentStateAdapter(fa) {

    override fun getItemCount(): Int = TABS_FIXED.size

    override fun createFragment(position: Int): Fragment {
        // Ambil deskripsi sesuai tab
        val desc = fa.getString(TABS_FIXED[position].second)
        return DetailFragment.newInstance(desc)
    }
}
