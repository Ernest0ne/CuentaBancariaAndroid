package com.example.cuenta

    /**
    * A group of *members*.
    * Esta clase Cuenta  me permite definirThis class has no useful logic; it's just a documentation example.
    * @property name the name of this group.
    * @constructor Se crea un contructor por defecto y uno con parametros.
    */
class Cuenta {
    private var DNI: Int = 0
    private var numeroCuenta: Int = 10001
    private var interes: Float = 0.0f
    private var saldo: Int = 0

    //Constructor por defecto
    fun Cuenta() {}


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

        /**
         * Adds a [member] to this group.
         * @return the new size of the group.
         */
    fun mostrarDatos(): String{
        var datos: String = "Los datos de la cuenta son:" + "\n" +
                "DNI del titular: " + getDNI() + "\n" +
                "Número de cuenta: " + getNumeroCuenta() + "\n" +
                "Tipo de interés: " + getInteres() + "\n" +
                "Saldo: " + getSaldo()

        return datos
    }

        /**
         * Adds a [member] to this group.
         * @return the new size of the group.
         */
    fun ingresarDinero(ingresoDinero: Double): String {
        if (ingresoDinero <= 0) {
            return "Usted no ha ingresado dinero o el monto ingresado es cero"
        }
        saldo += ingresoDinero.toInt()

        return "El dinero se ingreso satifactoriamente"
    }

        /**
         * Adds a [member] to this group.
         * @return the new size of the group.
         */
    fun retirarDinero(cantidad: Double): String{
        if (saldo < cantidad){
             return "El monto a retirar es mayor al saldo disponible"
        }
            saldo -= cantidad.toInt()
        return "El dinero se retiro satifactoriamente"
    }

        /**
         * Adds a [member] to this group.
         * @return the new size of the group.
         */
    fun actualizarSaldo(): String{
        var interesDiario: Float = (saldo*interes)/365
        saldo += interesDiario.toInt()
        return "Saldo actualizado"
    }

}