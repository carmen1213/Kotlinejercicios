import kotlin.random.Random
fun main() {
    var abecedario = 'a'..'z'
    val Arrayabecedario = mutableListOf<String>()
    var letracualquiera = "a"
    val Arrayvocales = mutableListOf<String>()
    val Arrayconsonantes = mutableListOf<String>()

    for (i in 0..9) {
        letracualquiera = abecedario.random().toString()
        Arrayabecedario.add(letracualquiera)
        if (Arrayabecedario[i] == "a" || Arrayabecedario[i] == "e" || Arrayabecedario[i] == "i" || Arrayabecedario[i] == "o" || Arrayabecedario[i] == "u") {
            Arrayvocales.add(letracualquiera)


        } else {
            Arrayconsonantes.add(letracualquiera)

        }




    }
    println("El array entero es :" + Arrayabecedario)
    println("Las vocales cogidas del array aleatorio y ordenadas son :" + Arrayvocales.sorted())
    println("Las consonantes cogidas del array aleatorio y ordenadas son :" + Arrayconsonantes.sorted())


    if (Arrayabecedario.contains("x")) {
        print("En este Array esta la X" + "\n")
    }

    for (i in 0..Arrayvocales.size-2) {
        if (Arrayvocales[i] == Arrayvocales[i + 1]) {
            println("La vocal repetida es : " + Arrayvocales[i])
        }
    }

}