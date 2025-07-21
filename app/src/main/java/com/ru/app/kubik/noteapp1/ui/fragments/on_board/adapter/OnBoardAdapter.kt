package com.ru.app.kubik.noteapp1.ui.fragments.on_board.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ru.app.kubik.noteapp1.ui.fragments.on_board.PageFragment
import com.ru.app.kubik.noteapp1.ui.fragments.on_board.PageFragment.Companion.ON_BOARD_KEY

class OnBoardAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount() = 3

    override fun createFragment(position: Int) = PageFragment().apply {
        arguments =
            Bundle().apply { putInt(ON_BOARD_KEY, position) }
    }

}