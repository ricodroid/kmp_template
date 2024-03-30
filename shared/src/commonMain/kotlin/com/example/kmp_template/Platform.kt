package com.example.kmp_template

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform