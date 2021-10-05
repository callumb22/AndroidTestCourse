package com.binner.callum.ytjunittests


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty user name returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid user name and correctly repeated password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Callum",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Callum",
            "",
            ""
        )
        assertThat(result).isFalse()


    }

    @Test
    fun `password repeated incorrectly returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Callum",
            "123",
            "1234"
        )
        assertThat(result).isFalse()

    }

    @Test
    fun `password less than two digits returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Callum",
            "abcde1",
            "abcde1"
        )
        assertThat(result).isFalse()

    }
}