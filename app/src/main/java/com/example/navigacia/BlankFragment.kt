package com.example.navigacia


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_blank.*

class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button.setOnClickListener {
            it.findNavController().navigate(R.id.action_blankFragment_to_blankFragment2)
        }

        cislo.addTextChangedListener {
            hodnota.text = it.toString()
            Log.d("nastav","nastavene")
        }

    }
}
