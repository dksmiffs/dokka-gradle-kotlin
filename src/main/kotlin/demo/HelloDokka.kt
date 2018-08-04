package demo

/**
 * A cliche of a program, written only for these KDoc bits.
 *
 * @property name The name of the person to be greeted.
 */
class Greeter(val name: String) {
  /**
   * Performs the greet work.
   */
  fun greet() {
    println("Hello, $name!")
  }
}

/**
 * The main function.
 *
 * @param args Not used in this implementation.
 */
fun main(vararg args: String) {
  Greeter("Dokka").greet()
}

