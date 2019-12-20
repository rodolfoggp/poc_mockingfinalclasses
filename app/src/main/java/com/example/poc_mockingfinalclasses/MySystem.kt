package com.example.poc_mockingfinalclasses

class MySystem(private val dependency: FinalDependency) {
    fun whatIsMyDependency(): String = dependency.message
}