package com.example.aula0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class DestinoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destino)
        Log.i("MINHAACTIVITY", "onDestroy: Agora passei pelo CREATE TELA DESTINO")

    }
    override fun onDestroy(){
        super.onDestroy()
        Log.i("MINHAACTIVITY", "onDestroy: Agora passei pelo onDestroy TELA DESTINO")
    }
}