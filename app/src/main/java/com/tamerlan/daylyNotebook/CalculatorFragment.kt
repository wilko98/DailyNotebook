package com.tamerlan.daylyNotebook

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_calculator.*
import java.lang.Exception

/**
 * Фрагмент с калькулятором
 * простой фрагмент для тренировки базовых функций Espresso
 * и junit
 * Используется TDD без тестов ничего не добавлять
 */
class CalculatorFragment : Fragment(R.layout.fragment_calculator) {

    companion object {
        fun build() = CalculatorFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setListeners()
    }

    fun setListeners() {
        btnPlus.setOnClickListener {
            try {
                tvResult.text =
                    (etFirstValue.text.toString().toLong() + etSecondValue.text.toString()
                        .toLong()).toString()
            } catch (e: Exception) {
                tvResult.text = MainActivity.ERROR_TEXT
            }
        }
        btnMinus.setOnClickListener {
            try {
                tvResult.text =
                    (etFirstValue.text.toString().toLong() - etSecondValue.text.toString()
                        .toLong()).toString()
            } catch (e: Exception) {
                tvResult.text = MainActivity.ERROR_TEXT
            }
        }
        btnMultiply.setOnClickListener {
            try {
                tvResult.text =
                    (etFirstValue.text.toString().toLong() * etSecondValue.text.toString()
                        .toLong()).toString()
            } catch (e: Exception) {
                tvResult.text = MainActivity.ERROR_TEXT
            }
        }
        btnDivision.setOnClickListener {
            try {
                tvResult.text =
                    (etFirstValue.text.toString().toLong() / etSecondValue.text.toString()
                        .toLong()).toString()
            } catch (e: Exception) {
                tvResult.text = MainActivity.ERROR_TEXT
            }
        }
    }
}