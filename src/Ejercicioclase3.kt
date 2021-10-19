fun main(){

    println("Escribe el primer numero mayor que 0 ")
    val numeros1 = readLine()
    println("Escribe el segundo numero que 0 ")
    val numeros2 = readLine()
    println("Escribe el tercer numero mayor que 0 ")
    val numeros3 = readLine()
    println("Escribe el cuarto numero que 0 ")
    val numeros4 = readLine()
    println("Escribe el quinto numero mayor que 0 ")
    val numeros5 = readLine()
    println("Escribe el sexto numero que 0 ")
    val numeros6 = readLine()
    println("Escribe el septimo numero mayor que 0 ")
    val numeros7 = readLine()
    println("Escribe el octavo numero que 0 ")
    var numeros8 = readLine()
    println("Escribe el noveno numero mayor que 0 ")
    var numeros9 = readLine()
    println("Escribe el decimo numero que 0 ")
    var numeros10 = readLine()
val ArrayNumeros = mutableListOf<String>()
  ArrayNumeros.add(numeros1.toString())
    ArrayNumeros.add(numeros2.toString())
    ArrayNumeros.add(numeros3.toString())
    ArrayNumeros.add(numeros4.toString())
    ArrayNumeros.add(numeros5.toString())
    ArrayNumeros.add(numeros6.toString())
    ArrayNumeros.add(numeros7.toString())
    ArrayNumeros.add(numeros8.toString())
    ArrayNumeros.add(numeros9.toString())
    ArrayNumeros.add(numeros10.toString())

    if (ArrayNumeros.contains("0")) {
        print("Has introducido un cero")
    }else if(ArrayNumeros.contains(" ")){
        print("Has introducido un valor incorrecto")
    }else{
        print(ArrayNumeros)
    }



}


