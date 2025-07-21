package com.ru.app.kubik.noteapp1.ui.fragments.main_note.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.ru.app.kubik.noteapp1.data.models.NoteModel
import com.ru.app.kubik.noteapp1.databinding.ItemListNoteBinding

class NoteAdapter : Adapter<NoteAdapter.NoteViewHolder>() {

    private val homeList = arrayListOf<NoteModel>()

    @SuppressLint("NotifyDataSetChanged")
    fun addNotes(home: List<NoteModel>) {
        homeList.clear()
        homeList.addAll(home)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        return NoteViewHolder(
            ItemListNoteBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return homeList.size
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.bind(homeList[position])
    }

    inner class NoteViewHolder(private val binding: ItemListNoteBinding) :
        ViewHolder(binding.root) {
        fun bind(note: NoteModel) {
            binding.textTitle.text = note.title
            binding.textDesc.text = note.desc
        }
    }
}