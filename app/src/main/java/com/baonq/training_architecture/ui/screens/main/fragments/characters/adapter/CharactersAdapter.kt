package com.baonq.training_architecture.ui.screens.main.fragments.characters.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.baonq.training_architecture.ui.screens.main.fragments.characters.listeners.CharacterItemListener
import com.baonq.training_architecture.data.entities.Character
import com.baonq.training_architecture.databinding.ItemCharacterBinding

class CharactersAdapter(
    private val listener: CharacterItemListener
): RecyclerView.Adapter<CharacterViewHolder>() {

    private val items = ArrayList<Character>()

    fun setItems(items: ArrayList<Character>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val binding: ItemCharacterBinding =
            ItemCharacterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CharacterViewHolder(binding, listener)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) = holder.bind(items[position])
}
