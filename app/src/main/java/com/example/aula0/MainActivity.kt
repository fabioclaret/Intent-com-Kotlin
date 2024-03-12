package com.example.aula0

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MINHAACTIVITY", "onCreate: Acabei de passsar no metodo onCreate TELA ORIGEM")
    }

    fun onClickProsseguir(view:View){
        val intent = Intent(this,DestinoActivity::class.java)
        startActivity(intent)

    }

    override fun onDestroy(){
        super.onDestroy()
        Log.i("MINHAACTIVITY", "onDestroy: Agora passei pelo onDestroy TELA ORIGEM")
    }

    override fun onStop(){
        super.onStop()
        Log.i("MINHAACTIVITY", "onStop: Agora passei pelo onStop TELA ORIGEM")

    }
    override fun onStart(){
        super.onStart()
        Log.i("MINHAACTIVITY", "onStart: Agora passei pelo onStart TELA ORIGEM")

    }


}




