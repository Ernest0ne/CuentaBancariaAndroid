package com.example.cuenta

class Cuenta {
    private var DNI: Int = 0
    private var numeroCuenta: Int = 10001
    private var interes: Float = 0.0f
    private var saldo: Int = 0

    //Constructor por defecto
    fun Cuenta() {}

    //Constructor con parámetros
    fun Cuenta(DNI: Int, interes: Float, saldo: Int) {
        this.DNI = DNI
        this.interes = interes
        this.saldo = saldo
    }


    //getters y setters
    fun setDNI(DNI: Int) {
        this.DNI = DNI
    }

    fun setInteres(interes: Float) {
        this.interes = interes
    }

    fun setSaldo(saldo: Int) {
        this.saldo = saldo
    }

    fun getDNI(): Int {
        return DNI
    }

    fun getNumeroCuenta(): Int {
        return numeroCuenta
    }

   fun getInteres(): Float{
       return interes
   }

    fun getSaldo(): Int {
        return saldo
    }

    /*Metodo para mostrar los datos de la cuenta, utilizando una
    cadena de String, mediante las propiedades del objecto*/
    fun mostrarDatos(): String{
        var datos: String = "Los datos de la cuenta son:" + "\n" +
                "DNI del titular: " + getDNI() + "\n" +
                "Número de cuenta: " + getNumeroCuenta() + "\n" +
                "Tipo de interés: " + getInteres() + "\n" +
                "Saldo: " + getSaldo()

        return datos
    }

    /*Método ingreso que me permite ingresar dinero a la cuenta, preguntando que el ingreso de dinero
    sea mayor a cero y aplicando la operacion al saldo y mostrar un mensaje del nuevo saldo */
    fun ingresarDinero(ingresoDinero: Double): Boolean {
        var ingresoCorrecto = true
        if (ingresoDinero < 0) {
            ingresoCorrecto = false
        } else {
            saldo = (saldo + ingresoDinero).toInt()
            println("Se ha ingresado $ingresoDinero el nuevo saldo es $saldo")
        }
        return ingresoCorrecto
    }

    /*Metodo que permite el retiro de dinero de la cuenta,utilizando una condicion que verifique
     que la cantidad de dinero a retirar es menor a la cantidad del saldo de la cuenta. */
    fun retirarDinero(cantidad: Double): Boolean{
        var retiro = true
        if (saldo < cantidad){
            retiro = false
            println("El monto a retirar es mayor al saldo disponible")
        }else{
            saldo -= cantidad.toInt()
            println("Se han retirado $cantidad ahora tiene un saldo de $saldo " )
        }
        return retiro
    }

    /*Metodo que permite actualiar el saldo, aplicando el interes diario al saldo actual
     y mostrando un mensaje del saldo actualizado*/
    fun actualizarSaldo(): Float{
        var interesDiario: Float = (saldo*interes)/365
        var nuevoSaldo: Float = saldo - interesDiario
        println("El interes diario es de $interesDiario, la actualizacion del saldo es $nuevoSaldo")
        return interesDiario
    }

}