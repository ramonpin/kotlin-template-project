/**
 * KotlinSample main function
 * Created by ramon.pin on 31/05/16.
 */
package pin.ramon.kotlin

import com.google.common.math.BigIntegerMath

@Suppress("unused")
fun main(vararg args: String) {
    println("Hello world!!!")
    println("Sum of 1 + 2 = ${sum(1, 2)}")
    println("Binomial of 2 and 1 = ${binomial(2, 1)}")
}

fun sum(a: Int, b: Int) = a + b

fun binomial(a: Int, b:Int) = BigIntegerMath.binomial(a, b)
