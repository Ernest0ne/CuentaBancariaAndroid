package com.example.cuenta

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cuenta1 = Cuenta()

        cuenta1.setDNI(123456789)
        cuenta1.setInteres(0.3f)
        cuenta1.setSaldo(500000)

        //se realiza un ingreso en cuenta1
        println(" ${cuenta1.mostrarDatos()}")
        cuenta1.ingresarDinero(4000.0)
        cuenta1.retirarDinero(2000.0)
        cuenta1.actualizarSaldo()

    }

}