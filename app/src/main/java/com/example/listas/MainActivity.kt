package com.example.listas

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val listaMaterias: ListView = findViewById<ListView>(R.id.ListaMaterias)
        val elementos = listOf("Programacion 3", "Calculo", "App Moviles")
        val adaptador = ArrayAdapter(this, R.layout.item_materia, elementos)
        listaMaterias.adapter = adaptador

        listaMaterias.setOnItemClickListener()
        { p: AdapterView<*>, view: View, position: Int, id: Long ->
            val nombre = elementos[position]
            Toast.makeText(this, nombre, Toast.LENGTH_SHORT).show()
            Log.v("Mi app", "Llega ahi")
        }

        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/
    }
}