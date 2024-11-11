package com.inforcap.main

import java.time.LocalDateTime

data class Author(
    val nombres: String,
    val apellidos: String,
    val obraDestacadas: List<String>?,
    val año_nacimiento: Int,
    val año_fallecimiento: Int?,
    val comentarios: String?
)

fun calculateAge(añoNacimiento: Int, añoFallecimiento:Int?): Int {
    return if (añoFallecimiento == null){
        -1
    }
    else {
        añoFallecimiento - añoNacimiento
    }
}

