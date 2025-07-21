package com.ru.app.kubik.noteapp1.ui.fragments.on_board

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.ru.app.kubik.noteapp1.R
import com.ru.app.kubik.noteapp1.data.local.Pref
import com.ru.app.kubik.noteapp1.databinding.FragmentOnBoardBinding
import com.ru.app.kubik.noteapp1.ui.fragments.on_board.adapter.OnBoardAdapter

class OnBoardFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnBoardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        setupListener()
    }



    private fun init() {
        binding.viewPager.adapter = OnBoardAdapter(this)
    }

    private fun setupListener() = with(binding) {
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                if (position == 2) {
                    tvScip.visibility = View.GONE
                } else {
                    tvScip.visibility = View.VISIBLE
                    tvScip.setOnClickListener {
                        viewPager.setCurrentItem(binding.viewPager.currentItem + 2, true)
                    }
                }
            }
        })
    }

}