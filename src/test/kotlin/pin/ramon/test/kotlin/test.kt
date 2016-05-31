package pin.ramon.test.kotlin

/**
 * Test for KotlinSample main module
 * Created by ramon.pin on 3/05/16.
 */
import org.junit.Test
import junit.framework.TestCase

import kotlin.test.*
import pin.ramon.kotlin.*
import java.math.BigInteger

class MainTest: TestCase() {

    @Test fun test_sum() {
        assertEquals(3, sum(1, 2), "La suma de Ints no es correcta.")
        assertEquals(BigInteger("2"), binomial(2, 1), "El calculo del binomio no es correcto.")
    }

}
