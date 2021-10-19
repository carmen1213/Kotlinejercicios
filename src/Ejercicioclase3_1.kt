fun main() {
    var numeros = "1".."100"
    val Arraypromedio = " "
    val Arraynumeros = mutableListOf<Int>()
    for (i in 0..9) {
        println("Escribe 10 numeros mayores que 0 ")
        val numeros = readLine()!!.toInt()
        Arraynumeros.add(numeros)
        Arraynumeros.sorted()
        for (i in 0..9) {

        }

    }
}
   /* if (Arraynumeros.contains("0")) {
        print("Has introducido un cero")
    }else if(Arraynumeros.contains(" ")){
        print("Has introducido un valor incorrecto")
    }else{

        print(Arraynumeros)
    }*/








