package dev.lazul.ddd.library.core

import kotlin.uuid.Uuid

data class Book(
    val id: Uuid,
    val title: String,
    val ISBN: ISBN,
    val author: String
)