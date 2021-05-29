package com.brunomotadev.santanderdevweek.data.local

import com.brunomotadev.santanderdevweek.data.Cartao
import com.brunomotadev.santanderdevweek.data.Cliente
import com.brunomotadev.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData():Conta{
        val cliente = Cliente("Bruno")
        val cartao = Cartao("6586456849564")
        return Conta(
            "444565-4",
            "6552-4",
            "2.458,80",
            "R$ 4.120,00",
            cliente,
            cartao
        )
    }
}