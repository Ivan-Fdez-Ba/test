package com.example.firstproject

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
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

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txtNombre: EditText = findViewById(R.id.TxtNombre)
        val btnOK: Button = findViewById(R.id.Boton)
        val lblNombre : TextView = findViewById(R.id.LblNom)

       btnOK.setOnClickListener {
           var nombre = txtNombre.text.toString()

           if(nombre.any()){
               lblNombre.text = "El teu nom complet és " + nombre
           }else{
               Toast.makeText(this, "No has introduït el teu nom.", Toast.LENGTH_LONG).show()
               txtNombre.setBackgroundColor(Color.RED)
           }
       }





    }
}