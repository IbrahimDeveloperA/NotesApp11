package com.ru.app.kubik.noteapp1.ui.fragments.main_note

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ru.app.kubik.noteapp1.App
import com.ru.app.kubik.noteapp1.R
import com.ru.app.kubik.noteapp1.data.local.Pref
import com.ru.app.kubik.noteapp1.data.models.NoteModel
import com.ru.app.kubik.noteapp1.databinding.FragmentMainNoteBinding
import com.ru.app.kubik.noteapp1.ui.fragments.main_note.adapter.NoteAdapter

class MainNoteFragment : Fragment() {

    private lateinit var binding: FragmentMainNoteBinding
    private val noteAdapter = NoteAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainNoteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        setupListener()
        getData()
    }

    private fun getData() {
        val list = App.appDatabase?.noteDao()?.getAll() ?: emptyList()

        noteAdapter.addNotes(list)
    }

    private fun initData() {
        binding.rvNotes.adapter = noteAdapter;
    }

    private fun setupListener() {
        binding.fabGo.setOnClickListener { findNavController().navigate(R.id.detailFragment) }
    }

}