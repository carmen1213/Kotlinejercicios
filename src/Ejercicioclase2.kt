import kotlin.random.Random
fun main() {

    var ArrayNumero = List(10) { Random.nextInt(1, 101) }
    val ArrayNumerosimpares = mutableListOf<Int>()
    val ArrayNumerospares = mutableListOf<Int>()
    val ArrayNumerosprimos = mutableListOf<Int>()
    var primo = true


    for (i in 0..9) {
        if (ArrayNumero[i] % 2 == 0) {
            ArrayNumerospares.add(ArrayNumero[i])
        } else {
            ArrayNumerosimpares.add(ArrayNumero[i])
        }

    }
    for (i in 0..ArrayNumerosimpares.size - 2){
        if ( checkPrimo(ArrayNumerosimpares[i])== true){
        ArrayNumerosprimos.add(ArrayNumerosimpares[i])
        }

    }


    println("Este es el array creado aleatoriamnete: "+ArrayNumero)
    println("Este es el Array creado a partir del original de numeros impares: " + ArrayNumerosimpares)
    println( "Este es el Array creado a partir del original de numeros primos : " +ArrayNumerosprimos)
    }

fun checkPrimo(num: Int): Boolean { // función que retorna un booleano
    var primo = true
    for (i in 2..num / 2) { // bucle sobre un rango
        if (num % i == 0) { // no es número primo
            primo = false
            break // sale del bucle
        }
    }
    return primo // true o false
}






