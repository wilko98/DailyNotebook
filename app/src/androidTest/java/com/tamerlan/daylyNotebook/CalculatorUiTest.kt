package com.tamerlan.daylyNotebook

import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class CalculatorUiTest{

    @get:Rule var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun checkSum(){
        onView(withId(R.id.etFirstValue)).perform(typeText("5"))
        onView(withId(R.id.etSecondValue)).perform(typeText("2"), closeSoftKeyboard())
        onView(withId(R.id.btnPlus)).perform(click())
        onView(withId(R.id.tvResult)).check(matches(withText("7")))
    }
    @Test
    fun checkMinus(){
        onView(withId(R.id.etFirstValue)).perform(typeText("5"))
        onView(withId(R.id.etSecondValue)).perform(typeText("2"), closeSoftKeyboard())
        onView(withId(R.id.btnMinus)).perform(click())
        onView(withId(R.id.tvResult)).check(matches(withText("3")))
    }
    @Test
    fun checkMultiply(){
        onView(withId(R.id.etFirstValue)).perform(typeText("5"))
        onView(withId(R.id.etSecondValue)).perform(typeText("2"), closeSoftKeyboard())
        onView(withId(R.id.btnMultiply)).perform(click())
        onView(withId(R.id.tvResult)).check(matches(withText("10")))
    }
    @Test
    fun checkDevision(){
        onView(withId(R.id.etFirstValue)).perform(typeText("6"))
        onView(withId(R.id.etSecondValue)).perform(typeText("2"), closeSoftKeyboard())
        onView(withId(R.id.btnDivision)).perform(click())
        onView(withId(R.id.tvResult)).check(matches(withText("3")))
    }
    @Test
    fun checkDevisionByZero(){
        onView(withId(R.id.etFirstValue)).perform(typeText("6"))
        onView(withId(R.id.etSecondValue)).perform(typeText("0"), closeSoftKeyboard())
        onView(withId(R.id.btnDivision)).perform(click())
        onView(withId(R.id.tvResult)).check(matches(withText(MainActivity.ERROR_TEXT)))
    }
    @Test
    fun checkMultiplyLargeNumber(){
        onView(withId(R.id.etFirstValue)).perform(typeText("10000000"))
        onView(withId(R.id.etSecondValue)).perform(typeText("10000000"), closeSoftKeyboard())
        onView(withId(R.id.btnMultiply)).perform(click())
        onView(withId(R.id.tvResult)).check(matches(withText("100000000000000")))
    }

    @Test
    fun checkMultipleClick(){
        onView(withId(R.id.etFirstValue)).perform(typeText("100"))
        onView(withId(R.id.etSecondValue)).perform(typeText("100"), closeSoftKeyboard())
        onView(withId(R.id.btnMultiply)).perform(click())
        onView(withId(R.id.btnMultiply)).perform(click())
        onView(withId(R.id.btnMultiply)).perform(click())
        onView(withId(R.id.btnMultiply)).perform(click())
        onView(withId(R.id.btnMultiply)).perform(click())
        onView(withId(R.id.btnMultiply)).perform(click())
        onView(withId(R.id.btnMultiply)).perform(click())
        onView(withId(R.id.btnMultiply)).perform(click())
        onView(withId(R.id.btnMultiply)).perform(click())
        onView(withId(R.id.btnMultiply)).perform(click())
        onView(withId(R.id.btnMultiply)).perform(click())
        onView(withId(R.id.tvResult)).check(matches(withText("10000")))
    }

    @Test
    fun checkEmptyFields(){
        onView(withId(R.id.btnDivision)).perform(click())
        onView(withId(R.id.btnMultiply)).perform(click())
        onView(withId(R.id.btnPlus)).perform(click())
        onView(withId(R.id.btnMinus)).perform(click())
    }

}