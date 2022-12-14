package com.currency.exchanger.data.currency.local.dto

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Entity(tableName = "exchange")
data class Exchange(
    @PrimaryKey(autoGenerate = true)
    var pk: Long = 0,
    @SerializedName("from_currency")
    val fromCurrency: String,
    @SerializedName("to_currency")
    val toCurrency: String?,
    @SerializedName("from_amount")
    val fromAmount: Double?,
    @SerializedName("converted_amount")
    val convertedAmount: Double?,
    @SerializedName("fee")
    val fee: Double?,
    @SerializedName("release_date")
    val releaseDate: String?,
) : Serializable