package dev.lazul.ddd.library.core

import kotlin.uuid.Uuid

data class User(
    val id: Uuid,
    val name: String,
    val DNI: DNI,
    val email: Email
) {
    private var _hasPenalty = false
    val hasPenalty: Boolean get() = _hasPenalty

    fun applyPenalty() {
        _hasPenalty = true }
}
