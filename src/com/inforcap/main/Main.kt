package com.inforcap.main

fun main(){

    val author01 = Author(
        nombres = "Howard Phillips",
        apellidos = "Lovecraft",
        obraDestacadas = listOf("La llamada de Cthulhu","El Necronomicón","Las Montañas de la locura"),
        año_nacimiento = 1890,
        año_fallecimiento = 1937,
        comentarios = "Escritor estodounidense de novelas de terror y ciencia ficción."
    )

    val author02 = Author(
        nombres = "Robert Anthony",
        apellidos = "Salvatore",
        obraDestacadas = listOf("El elfo Oscuro","El valle del viento helado"),
        año_nacimiento = 1959,
        año_fallecimiento = null,
        comentarios = "Escritor estodounidense de literatura fantástica y ciencia ficción."
    )

    var autores: ArrayList<Author> = ArrayList()
    autores.add(author01)
    autores.add(author02)

    for (a in autores){
        imprimirDetalles(a)
    }

}


fun imprimirDetalles(author: Author){
    println("***************************************")
    println("Nombre autor: ${author.nombres} ${author.apellidos}")
    println("Obras Destacadas: ")
    for (libro in author.obraDestacadas!!){
        println("\t- ${libro}")
    }
    println("Año Nacimiento: ${author.año_nacimiento}")
    var edad = calculateAge(author.año_nacimiento,author.año_fallecimiento)
    println("Año Fallecimiento: " + if (edad > 0) "${author.año_fallecimiento}, murió a los ${edad} años de vida." else "aún está vivo.")
    println("Comentarios: ${author.comentarios}")
}