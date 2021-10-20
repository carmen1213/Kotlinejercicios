fun main() {
    var sumaarray : Int = 0
    var sumapares : Int = 0
    var restaimpares : Int = 0
    var promedio : Int = 0
    val Arraynumeros = mutableListOf<Int>()
    val ArrayNumerosimpares= mutableListOf<Int>()
    val ArrayNumerospares= mutableListOf<Int>()
    for (i in 0..9) {
        println("Escribe 10 numeros mayores que 0 ")
        val numeros = readLine()!!.toInt()
        Arraynumeros.add(numeros)
    }
    Arraynumeros.sorted()
    if (Arraynumeros.contains(10)) {
        print("En este Array esta el 10" + "\n")
    }
    for (i in 0..9) {
        if (Arraynumeros[i] % 2 == 0) {
            ArrayNumerospares.add(Arraynumeros[i])
        } else {
            ArrayNumerosimpares.add(Arraynumeros[i])
        }
//sumapares
    }

    println("Este es el array de 10 numeros introducidos por el usuario : =  " + Arraynumeros+ "\n")
    println("Este es el array de numeros impares :  = " +  ArrayNumerosimpares+ "\n")
    println("Este es el array de numeros pares :  = " +ArrayNumerospares+ "\n")
    for (i in 0..ArrayNumerospares.size-2){
        sumapares = (sumapares + ArrayNumerospares[i])

    }
    print("La suma de los numeros pares es : =  " +sumapares+ "\n")

    for (i in 0..ArrayNumerosimpares.size-2){
        restaimpares = (restaimpares - ArrayNumerosimpares[i])

    }

    print("La resta de los numeros impares es : =  " +  restaimpares+ "\n")


    for (i in 0..Arraynumeros.size-2){
        sumaarray = (sumaarray + Arraynumeros[i])
    }
    print("La suma de este array es : =  " + sumaarray+ "\n")


    promedio = (sumaarray / 10)

    print("El promedio de este array es : =  "+promedio + "\n")

}








