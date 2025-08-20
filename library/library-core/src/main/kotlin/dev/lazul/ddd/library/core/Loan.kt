package dev.lazul.ddd.library.core

import java.time.LocalDate
import kotlin.uuid.Uuid

data class Loan(
    val id: Uuid,
    val userId: Uuid,
    val bookId: Uuid,
    val loanDate: LocalDate,
    val returnDate: LocalDate
)
