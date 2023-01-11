package com.skilled.dagger

import dagger.Module
import dagger.Provides

/**
 * @created 11.01.2023
 * @author SkilledLis
 */
class Cash()
class Solders()

@Module
class BraavosModule(
    private val cash: Cash, private val solders: Solders) {

    @Provides
    fun provideCash():Cash = cash

    @Provides
    fun provideSolders(): Solders = solders


}