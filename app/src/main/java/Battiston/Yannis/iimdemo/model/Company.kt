package Battiston.Yannis.iimdemo.model

import java.io.Serializable

data class Company(
    val name: String,
    val catchPhrase: String,
    val bs: String
) : Serializable