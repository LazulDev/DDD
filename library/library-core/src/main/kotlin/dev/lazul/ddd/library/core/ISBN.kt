package dev.lazul.ddd.library.core

data class ISBN(val value: String) {
    init {
        require(isValid()) { "ISBN should not be blank." }
    }
    private fun isValid(): Boolean {
        return value.isNotBlank()
    }
}
