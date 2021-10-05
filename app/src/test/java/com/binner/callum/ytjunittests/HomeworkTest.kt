package com.binner.callum.ytjunittests

import com.google.common.truth.Truth.assertThat
import org.junit.Test



class HomeworkTest {

    @Test
    fun `input is 1`() {
        val result = Homework.fib(1)
    assertThat(result).isEqualTo(1)
    }

    @Test
    fun `input is 5`() {
        val result = Homework.fib(5)
        assertThat(result).isEqualTo(5)
    }

    @Test
    fun `input is 50`() {
        val result = Homework.fib(50)
        assertThat(result).isEqualTo(12586269025)
    }


    @Test
    fun `equal braces`() {
        val result = Homework.checkBraces("(Hello!)")
        assertThat(result).isTrue()
    }

    @Test
    fun `extra left brace`() {
        val result = Homework.checkBraces("((Hello!)")
        assertThat(result).isFalse()
    }

    @Test
    fun `extra right brace`() {
        val result = Homework.checkBraces("(Hello!))")
        assertThat(result).isFalse()
    }

    @Test
    fun `equal extra braces`() {
        val result = Homework.checkBraces("((Hello!))")
        assertThat(result).isTrue()
    }

    @Test
    fun `reverse braces`() {
        val result = Homework.checkBraces(")(")
        assertThat(result).isFalse()
    }
}