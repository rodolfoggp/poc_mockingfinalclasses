package com.example.poc_mockingfinalclasses

import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.mockingDetails
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull
import kotlin.test.assertTrue

class MySystemTest {

    private val dependency: FinalDependency = mock {
        on { message } doReturn "I am using a mocked dependency"
    }

    private val mySystem = MySystem(dependency)

    @Test
    fun `whatIsMyDependency Should use a mocked dependency`() {
        // GIVEN
        assertTrue(mockingDetails(dependency).isMock)

        // WHEN
        val result = mySystem.whatIsMyDependency()

        //THEN
        assertEquals("I am using a mocked dependency", result)
        assertNull(dependency.notMockedFunction()) // Tem que ser nulo porque não mockei esta função
    }
}