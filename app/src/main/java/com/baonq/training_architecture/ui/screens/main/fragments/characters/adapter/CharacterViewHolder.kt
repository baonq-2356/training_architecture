package com.baonq.training_architecture.ui.screens.main.fragments.characters.adapter

import android.annotation.SuppressLint
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.baonq.training_architecture.databinding.ItemCharacterBinding
import com.baonq.training_architecture.ui.screens.main.fragments.characters.listeners.CharacterItemListener
import com.baonq.training_architecture.data.entities.Character
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop

class CharacterViewHolder(
    private val itemBinding: ItemCharacterBinding,
    private val listener: CharacterItemListener
) : RecyclerView.ViewHolder(itemBinding.root), View.OnClickListener {

    private lateinit var character: Character

    init {
        itemBinding.root.setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n")
    fun bind(item: Character) {
        this.character = item
        itemBinding.name.text = item.name
        itemBinding.speciesAndStatus.text = """${item.species} - ${item.status}"""
        Glide.with(itemBinding.root)
            .load(item.image)
            .transform(CircleCrop())
            .into(itemBinding.image)
    }

    override fun onClick(v: View?) {
        listener.onClickedCharacter(character.id)
    }

}

