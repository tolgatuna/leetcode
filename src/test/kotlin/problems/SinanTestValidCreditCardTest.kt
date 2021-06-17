package problems

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SinanTestValidCreditCardTest {


    @Test
    internal fun shouldNotValidForEmptyString() {
        val emptyString = "";
        val lessThanOneString = "1";

        assertFalse(SinanTestValidCreditCard.isValid(emptyString))
        assertFalse(SinanTestValidCreditCard.isValid(lessThanOneString))
    }

    @Test
    internal fun shouldNotValidForTextContainsAnyCharacter() {
        val creditCard = "1abc234512341234";
        assertFalse(SinanTestValidCreditCard.isValid(creditCard))
    }

    @Test
    internal fun shouldReturnValid() {
        val creditCard = "4539 1488 0343 6467";
        assertTrue(SinanTestValidCreditCard.isValid(creditCard))
    }

    @Test
    internal fun shouldNotReturnValid() {
        val creditCard = "8273 1232 7352 0569";
        assertTrue(SinanTestValidCreditCard.isValid(creditCard))
    }

}
