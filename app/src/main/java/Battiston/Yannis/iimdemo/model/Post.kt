package Battiston.Yannis.iimdemo.model

import java.io.Serializable

data class Post(
    val id: Int,
    val userId: Int,
    val title: String,
    val body: String
) : Serializable