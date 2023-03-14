package com.example.examenu2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        var btnDetalles: Button = findViewById<Button>(R.id.btn_detalles)
        var btnGlobos: Button = findViewById<Button>(R.id.btn_globos)
        var btnPeluches: Button = findViewById<Button>(R.id.btn_peluches)
        var btnRegalos: Button = findViewById<Button>(R.id.btn_regalos)
        var btnTazas: Button = findViewById<Button>(R.id.btn_tazas)

        btnDetalles.setOnClickListener{
            var intent: Intent =Intent(this , Regalos::class.java)
            intent.putExtra("menuType","Detalles")
            startActivity(intent)
        }

        btnGlobos.setOnClickListener{
            var intent: Intent =Intent(this , Regalos::class.java)
            intent.putExtra("menuType","Globos")
            startActivity(intent)
        }

        btnPeluches.setOnClickListener{
            var intent: Intent =Intent(this , Regalos::class.java)
            intent.putExtra("menuType","Peluches")
            startActivity(intent)
        }

        btnRegalos.setOnClickListener{
            var intent: Intent =Intent(this , Regalos::class.java)
            intent.putExtra("menuType","Regalos")
            startActivity(intent)
        }

        btnTazas.setOnClickListener{
            var intent: Intent =Intent(this , Regalos::class.java)
            intent.putExtra("menuType","Tazas")
            startActivity(intent)
        }

    }
}