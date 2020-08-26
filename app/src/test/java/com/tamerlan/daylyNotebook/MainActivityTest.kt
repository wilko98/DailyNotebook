package com.tamerlan.daylyNotebook

import android.os.Build
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [Build.VERSION_CODES.O_MR1])
class MainActivityTest(){

    @Test fun shouldOpenNotesFragment(){
        val activity = Robolectric.buildActivity(MainActivity::class.java)
        activity.create()
        activity.resume()

        



    }
}