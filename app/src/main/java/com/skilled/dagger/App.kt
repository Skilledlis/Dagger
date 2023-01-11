package com.skilled.dagger

import android.app.Application

/**
 * @created 11.01.2023
 * @author SkilledLis
 */
class App : Application() {

    lateinit var battleComponent: BattleComponent


    override fun onCreate() {
        super.onCreate()
        battleComponent =
            DaggerBattleComponent.builder().braavosModule(BraavosModule(Cash(), Solders())).build()
        val war = battleComponent.getWar()
        battleComponent.getCash()
    }
}
