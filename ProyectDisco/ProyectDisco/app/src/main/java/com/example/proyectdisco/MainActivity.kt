package com.example.proyectdisco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtener referencias a los botones
        val buttonEnter = findViewById<Button>(R.id.buttonEnter)
        val buttonEvents = findViewById<Button>(R.id.buttonEvents)
        val buttonReserveTable = findViewById<Button>(R.id.buttonReserveTable)
        val buttonGuestList = findViewById<Button>(R.id.buttonGuestList)
        val buttonPromotions = findViewById<Button>(R.id.buttonPromotions)
        val buttonContact = findViewById<Button>(R.id.buttonContact)

        // Establecer un listener de clic para el botón de entrada
        buttonEnter.setOnClickListener {
            // Abrir la nueva actividad al hacer clic en el botón de entrada
            val intent = Intent(this, Entrar::class.java)
            startActivity(intent)
        }

        // Puedes agregar listeners de clic para otros botones y definir el comportamiento deseado aquí
        // Por ejemplo, puedes abrir otras actividades o ejecutar cierta lógica cuando se haga clic en esos botones
    }
}
