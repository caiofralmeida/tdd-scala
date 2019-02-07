package io.github.caiofralmeida.tddscala

object FizzBuzz {
  def run(value: Int): String = {
    if (value % 15 == 0)
      return "FizzBuzz"
    if (value % 5 == 0)
      return "Buzz"
    if (value % 3 == 0)
      return "Fizz"

    return String.valueOf(value)
  }
}
