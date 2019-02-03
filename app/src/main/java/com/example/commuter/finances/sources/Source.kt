package com.example.commuter.finances.sources

import java.time.LocalDateTime

sealed class Source {

    abstract val date: LocalDateTime

    data class Income(
            override val date: LocalDateTime,
            val grossPay: Double,
            val federalIncomeTax: Double,
            val socialSecurityTax: Double,
            val medicareTax: Double,
            val nyStateIncomeTax: Double,
            val nycIncomeTax: Double,
            val nySUISDITax: Double,
            val dentalPretax: Double,
            val medical: Double,
            val transitPretax: Double,
            val retirement: Double,
            val studentRepay: Double,
            val reimbursement: Double,
            val takeHome: Double
    ) : Source()
}