package com.skilled.dagger

import dagger.Component

/**
 * @created 11.01.2023
 * @author SkilledLis
 */
@Component(modules = [BraavosModule::class])
interface BattleComponent {
    fun getWar():War
    fun getCash() : Cash
    fun getSolders(): Solders
}


