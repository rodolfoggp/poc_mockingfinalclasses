package com.example.poc_mockingfinalclasses

import com.android.example.poc_mockingfinalclasses.OpenForTesting

@OpenForTesting
class FinalDependency {

    val message = "I am using a real implementation"

    fun notMockedFunction() = "I will not be mocked"
}

