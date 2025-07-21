package com.ru.app.kubik.noteapp1.ui.fragments.on_board

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ru.app.kubik.noteapp1.R
import com.ru.app.kubik.noteapp1.databinding.FragmentPageBinding


class PageFragment : Fragment() {

    private lateinit var binding: FragmentPageBinding

    companion object{
        const val ON_BOARD_KEY = "onBoardKey"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init(): Unit = with(binding) {
        when(requireArguments().getInt(ON_BOARD_KEY)){
            0->{
                tvTitle.text = "Удобство";
                tvDesc.text = "Создавайте заметки в два клика! Записывайте мысли, идеи и важные задачи мгновенно.";
            }
            1->{
                tvTitle.text = "Организация";
                tvDesc.text = "Организуйте заметки по папкам и тегам. Легко находите нужную информацию в любое время.";
            }
            2->{
                tvTitle.text = "Синхронизация";
                tvDesc.text = "Синхронизация на всех устройствах. Доступ к записям в любое время и в любом месте.";
            }
        }
    }

}