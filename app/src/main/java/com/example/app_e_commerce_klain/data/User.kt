package com.example.app_e_commerce_klain.data

data class User(
    val firstName: String,
    val lastName: String,
    val email: String,
    val imagePath: String = ""
){
    constructor(): this("","","","")
}
