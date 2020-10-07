package com.example.navigacia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        NavigationUI.setupWithNavController(nav_view,
            Navigation.findNavController(this, R.id.nav_host_fragment))
    }

    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this, R.id.nav_host_fragment).navigateUp()
    }


    override fun onResume() {
        super.onResume()
        Log.i("ZivotnyCyklusAktivita", "onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ZivotnyCyklusAktivita","onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ZivotnyCyklusAktivita","onStop Called")
    }

    override fun onDestroy() {
        Log.i("ZivotnyCyklusAktivita","onDestroy Called")
        super.onDestroy()

    }

    override fun onRestart() {
        super.onRestart()
        Log.i("ZivotnyCyklusAktivita","onRestart Called")
    }
}
