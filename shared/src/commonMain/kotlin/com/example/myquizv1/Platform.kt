package com.example.myquizv1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform