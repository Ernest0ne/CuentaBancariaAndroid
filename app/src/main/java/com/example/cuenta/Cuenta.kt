package com.example.cuenta

import kotlin.math.roundToInt

class Cuenta {
    private var DNI: Int = 0
    private val numeroCuenta: Int = 10000
    private var tipoInteres = 0
    private var saldo = 0

    //Constructor por defecto
    fun Cuenta() {}

    //Constructor con parámetros
    fun Cuenta(DNI: Int, tipoInteres: Int, saldo: Int) {
        this.DNI = DNI
        this.tipoInteres = tipoInteres
        this.saldo = saldo
    }


    //getters y setters
    fun setDNI(d: Int) {
        DNI = d
    }

    fun setTipoInteres(n: Int) {
        tipoInteres = n
    }

    fun setSaldo(n: Int) {
        saldo = n
    }

    fun getDNI(): Int {
        return DNI
    }

    fun getNumeroCuenta(): Int {
        return numeroCuenta
    }

    fun getTipoInteres(): Int {
        return tipoInteres
    }

    fun getSaldo(): Int {
        return saldo
    }

    //actualizar saldo
    fun actSaldo(): Int{
        var nuevoSaldo: Int = (saldo*tipoInteres).toInt()/365

        println("Su nuevo saldo es $nuevoSaldo")
        return nuevoSaldo
    }

    //método ingreso
    fun ingreso(n: Double): Boolean {
        var ingresoCorrecto = true
        if (n < 0) {
            ingresoCorrecto = false
        } else {
            saldo = (saldo + n).toInt()
            println("Se ha ingresado $n el nuevo saldo es $saldo")
        }
        return ingresoCorrecto
    }

    fun retirar_dinero(cantidad: Double): Boolean{
        var retiro = true
        if (saldo < cantidad){
            retiro = false
            println("El monto a retirar es mayor al saldo disponible")
        }else{
            var newsaldo: Int = saldo - cantidad.toInt()
            println("Se han retirado $cantidad ahora tiene un saldo de $newsaldo " )
        }
        return retiro
    }

    fun numCuenta():Int{
        var num: Int = numeroCuenta
        return num+1
    }

    fun mostrarDatos(): String{
      var datos: String = "Los datos de la cuenta son:" + "\n" +
        "DNI del titular: " + getDNI() + "\n" +
        "Número de cuenta: " + numCuenta() + "\n" +
        "Tipo de interés: " + getTipoInteres() + "\n" +
        "Saldo: " + actSaldo()

        return datos
    }
}