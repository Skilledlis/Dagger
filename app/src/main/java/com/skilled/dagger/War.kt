package com.skilled.dagger

import javax.inject.Inject

/**
 * @created 11.01.2023
 * @author SkilledLis
 */
class War @Inject constructor(
    private val starks: Starks,
    private val boltons: Boltons
) {

    fun prepare() {
        starks.prepareForWar()
        boltons.prepareForWar()
    }

    fun report() {
        starks.reportForWar()
        boltons.reportForWar()
    }
}