package com.skilled.dagger

import android.util.Log
import javax.inject.Inject

/**
 * @created 11.01.2023
 * @author SkilledLis
 */
interface House {
    fun prepareForWar()
    fun reportForWar()
}

class Boltons @Inject constructor() : House {

    override fun prepareForWar() {
        Log.d("HOUSE", this.javaClass.simpleName + " prepared for war")
    }

    override fun reportForWar() {
        println(this.javaClass.simpleName + " reporting..")
    }
}

class Starks @Inject constructor() : House {

    override fun prepareForWar() {
        println(this.javaClass.simpleName + " prepared for war")
    }

    override fun reportForWar() {
        println(this.javaClass.simpleName + " reporting..")
    }
}
