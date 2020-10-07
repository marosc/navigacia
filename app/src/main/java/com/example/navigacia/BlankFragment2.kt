package com.example.navigacia


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_blank_fragment2.*

class BlankFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_fragment2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button2.setOnClickListener { it.findNavController().popBackStack() }


        nastav.setOnClickListener {
            hodnota.text=cislo.text.toString()
            hodnota2.text=cislo.text.toString()
            Log.d("nastav","nastavene")
        }
        lifecycle.addObserver(hodnota2)
    }

    //Ak zakomentujete a onSaveInstanceState() onActivityCreated() tak sa vam hodnota v TextView nezachova po rotacii.
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("cislo",hodnota.text.toString())
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i("ZivotnyCyklusFragment", "onActivityCreated called")
        savedInstanceState?.let {
            hodnota.text=it.getString("cislo")
        }
    }


    override fun onAttachFragment(childFragment: Fragment) {
        super.onAttachFragment(childFragment)
        Log.i("ZivotnyCyklusFragment", "onAttachFragment called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ZivotnyCyklusFragment", "onCreate called")
    }
 
  override fun onStart() {
        super.onStart()
        Log.i("ZivotnyCyklusFragment", "onStart called")
    }
    override fun onResume() {
        super.onResume()
        Log.i("ZivotnyCyklusFragment", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("ZivotnyCyklusFragment", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("ZivotnyCyklusFragment", "onStop called")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("ZivotnyCyklusFragment", "onDestroyView called")
    }
    override fun onDetach() {
        super.onDetach()
        Log.i("ZivotnyCyklusFragment", "onDetach called")
        lifecycle.removeObserver(hodnota2)
    }
}
