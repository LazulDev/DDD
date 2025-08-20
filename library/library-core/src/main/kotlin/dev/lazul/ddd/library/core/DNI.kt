package dev.lazul.ddd.library.core

data class DNI(val value: String) {
    init {
        require(isNotEmpty()) { "DNI should not be empty"}
    }
    private fun isNotEmpty(): Boolean {
        return this.value.isNotEmpty()
    }
}
