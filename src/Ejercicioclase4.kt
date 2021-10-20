fun main() {
    var Mapaempleados: MutableMap<String, Int> = mutableMapOf()

    var nombres: String = " "
    var horas: Int = 0
    val constante: Double = 37.76
    val Arrayhoras = mutableListOf<Int>()
    for (i in 0..9) {
        println("Escribe 10 nombres de empleados ")
        nombres = readLine()!!.toString()
        println(" Y las respectivas horas trabajadas ")
        horas = readLine()!!.toInt()
        Mapaempleados[nombres]=horas
    }
    Mapaempleados.forEach {
        var salario = it.value * 37.76
        if (salario <= 1600.0) {
            println(it.key + " cobra : " + salario + "")
        }else{
            println("Revisar horas extras del empleado  " + it.key)
        }
    }
    Arrayhoras.add(horas)



    println(Mapaempleados)



}



