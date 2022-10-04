package com.currency.exchanger.domain.rate.usecase

import com.currency.exchanger.data.rate.local.dto.Balance
import com.currency.exchanger.data.rate.local.dto.Rate
import com.currency.exchanger.domain.rate.BalanceLocalRepository
import com.currency.exchanger.domain.rate.RateLocalRepository
import javax.inject.Inject

class BalanceLocalUseCase @Inject constructor(private val balanceLocalRepository: BalanceLocalRepository) {
    suspend fun invoke(balance: Balance) {
        return balanceLocalRepository.addBalance(balance)
    }
}