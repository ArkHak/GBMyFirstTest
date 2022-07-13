package ru.omysin.gbmyfirsttest

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.com"))
    }

    @Test
    fun emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.co.uk"))
    }

    @Test
    fun emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email"))
    }

    @Test
    fun emailValidator_InvalidEmailEmptyTld_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email."))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email..com"))
    }

    @Test
    fun emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("@email.com"))
    }

    @Test
    fun emailValidator_EmptyString_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun emailValidator_NullEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(null))
    }

    @Test
    fun emailValidator_InvalidEmailDomainEmpty_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@.com"))
    }

    @Test
    fun emailValidator_InvalidEmailUsernameSpecialSymbolSlash_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("nam/e@email.com"))
    }

    @Test
    fun emailValidator_InvalidEmailDomainSpecialSymbolSlash_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@em/ail.com"))
    }

    @Test
    fun emailValidator_InvalidEmailTldSpecialSymbolSlash_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email.c/om"))
    }

    @Test
    fun emailValidator_InvalidEmailUsernameSpecialSymbolSpace_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("nam e@email.com"))
    }

    @Test
    fun emailValidator_InvalidEmailUsernameStartSpecialSymbolSpace_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(" name@email.com"))
    }

    @Test
    fun emailValidator_InvalidEmailDomainSpecialSymbolSpace_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@em ail.com"))
    }

    @Test
    fun emailValidator_InvalidEmailTldSpecialSymbolSpace_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email.c om"))
    }

    @Test
    fun emailValidator_InvalidEmailTldEndSpecialSymbolSpace_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email.com "))
    }
}
