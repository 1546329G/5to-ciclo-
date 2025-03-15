package com.gandyh.senativ2025

class KotlinEjemplo2 {
    val constamte: String = "gandy"
    var contador: Int = 0
    var precio: Double = 3.14
    var  esVERdadero: Boolean = true
    var nombre: String = "SENATI"

    val numeros = listOf(1,2,3,4,5)
    val nombres = mutableListOf("Ana","Carla","Elena")
    var tipoCambio: Double = 3.68
    var edad: Int = 0

    fun calcularEnDolares(precio: Double, tipoCambio: Double): Double
    {
        return precio * tipoCambio
    }

    fun calcularEnsoles(precio: Double, tipoCambio: Double): Double
    {
        return precio / tipoCambio
    }

    fun  calcularMayorEdad(edad: Int): Boolean
    {
        if (edad<=0)
            return false

        if(edad>=18)
            return true
        else
            return false

    }

    fun  mostrarNumeros():Int

    {
        for (i in 10 )

        {

        }
    }



}


fun main()
{
    var kotlin = KotlinEjemplo2()
    var respuesta =  kotlin.calcularEnDolares(350.50,3.68)
    println(" El precio en soles es $respuesta")

  // var  respuesta2=kotlin.calcularMayorEdad(20)


    var respuesta2=kotlin.calcularMayorEdad(5)

    if(respuesta2  == true)
        println("La edad de 20 años  es mayor de edad")
    else
        println("la edad de 20 años es manor  de edad")








}