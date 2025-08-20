package dev.lazul.ddd.library.core

data class Email(val value: String) {
    init {
        require(value.contains('@')) {"Email should contain at"}
        require(value.endsWith(".com")) {"Email end with .com"}
    }
}
