fun main(){
var Mapaempleados: Map<String,Int> = mapOf()
    var salario =  " "
    for (i in 0..9) {
        println("Escribe 10 nombres de empleados ")
        var nombres = readLine().toString()
        println(" Y las respectivas horas trabajadas ")
        var horas = readLine()!!.toInt()
        Mapaempleados= mutableMapOf(nombres to horas)
       // salario = (horas * "37,76")
        println(Mapaempleados)

    }




}


