package br.edu.ifsp.scl.sdm.currencyconverter.model.domain


import com.google.gson.annotations.SerializedName

data class ConversionResult(
    val amount: String,
    @SerializedName("base_currency_code")
    val baseCurrencyCode: String,
    @SerializedName("base_currency_name")
    val baseCurrencyName: String,
    val rates: Rates,
    val status: String,
    @SerializedName("updated_date")
    val updatedDate: String
) {
    data class Rates(
        @SerializedName("CAD")
        val cAD: CAD
    ) {
        data class CAD(
            @SerializedName("currency_name")
            val currencyName: String,
            val rate: String,
            @SerializedName("rate_for_amount")
            val rateForAmount: String
        )
    }
}