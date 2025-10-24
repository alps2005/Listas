package com.example.listas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Paises_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paises)
        val paises = listOf<String>("Ecuador", "Mexico", "Colombia", "Chile", "Argentina", "Afganistan")
        val rvpaises = findViewById<RecyclerView>(R.id.rvpaises)
//        rvpaises.layoutManager = LinearLayoutManager(this,
//            LinearLayoutManager.HORIZONTAL, false)
        rvpaises.layoutManager = GridLayoutManager(this, 2)
        rvpaises.adapter = PaisAdapter(paises)
    }
}