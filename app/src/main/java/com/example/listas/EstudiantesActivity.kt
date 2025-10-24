package com.example.listas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EstudiantesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_estudiantes)
        var estudiantes = listOf<Estudiante>(
            Estudiante("Jhon Doe", "0992344567", "https://thumbs.dreamstime.com/b/typical-american-college-teenager-20227417.jpg"),
            Estudiante("Michael Jackson", "0992444567", "https://cdn-p.smehost.net/sites/28d35d54a3c64e2b851790a18a1c4c18/wp-content/uploads/2017/04/19870831_bad_album_shoot.jpg"),
            Estudiante("Moisex Caicedo", "0292344567", "https://a4.espncdn.com/combiner/i?img=%2Fphoto%2F2022%2F1119%2Fr1093350_1296x729_16%2D9.jpg"),
            Estudiante("El Calchin", "0592344567", "https://upload.wikimedia.org/wikipedia/commons/0/03/Argentina_national_football_team_-_2_-_2022_%28Julián_Álvarez%29.jpg")
        )
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}