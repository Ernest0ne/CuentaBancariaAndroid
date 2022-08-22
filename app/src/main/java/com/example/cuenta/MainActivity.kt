package com.example.cuenta

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cuenta1 = Cuenta()

        cuenta1.setDNI(123456789)
        cuenta1.setTipoInteres(3)
        cuenta1.setSaldo(500000)

        //se realiza un ingreso en cuenta1
        cuenta1.actSaldo()
        cuenta1.ingreso(4000.0)
        cuenta1.retirar_dinero(2000.0)
        println(" ${cuenta1.mostrarDatos()}")

        //mostrar los datos de cuenta2 vacio
        /*val cuenta2 = Cuenta()
        println(" ${cuenta2.mostrarDatos()}")*/

    }


}