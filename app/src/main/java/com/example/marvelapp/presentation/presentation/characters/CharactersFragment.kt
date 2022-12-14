package com.example.marvelapp.presentation.presentation.characters

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.marvelapp.R
import com.example.marvelapp.databinding.FragmentCharactersBinding
import com.example.process.domain.model.Character
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CharactersFragment : Fragment() {

    private var _binding: FragmentCharactersBinding? = null
    private val binding: FragmentCharactersBinding get() = _binding!!

    private val charactersAdapter = CharactersAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentCharactersBinding.inflate(
        inflater,
        container, false
    ).apply {
        _binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initCharactersAdapter()

        charactersAdapter.submitList(
            listOf(
                Character("3D-Man", "https://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784.jpg"),
                Character("3D-Man", "https://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784.jpg"),
                Character("3D-Man", "https://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784.jpg"),
                Character("3D-Man", "https://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784.jpg"),
                Character("3D-Man", "https://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784.jpg"),
            )
        )
    }

    private fun initCharactersAdapter() {
        binding.recyclerCharacters.run {
            setHasFixedSize(true)
            adapter = charactersAdapter
        }
    }
}