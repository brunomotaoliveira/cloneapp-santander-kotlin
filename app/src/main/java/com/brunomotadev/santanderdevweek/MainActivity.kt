package com.brunomotadev.santanderdevweek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val medicamento = Medicamento(formula = "teste1", posologia = "teste2");
        medicamento.formula
    }


}