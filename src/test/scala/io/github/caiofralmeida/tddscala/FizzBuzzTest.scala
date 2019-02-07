package io.github.caiofralmeida.tddscala

import org.scalatest.FunSuite

class FizzBuzzTest extends FunSuite {

  test("Quando passar um numero divisivel por 3 deve retornar Fizz") {
    assert(FizzBuzz.run(3) === "Fizz")
  }

  test("Quando passar um numero divisivel por 5 deve retornar Buzz") {
    assert(FizzBuzz.run(5) === "Buzz")
  }

  test("Quando passar um numero divisivel por 3 e por 5 deve retornar FizzBuzz") {
    assert(FizzBuzz.run(135) === "FizzBuzz")
  }

  test("Quando passar um numero não divisivel por 3 nem por 5 deve retornar o proprio numero") {
    assert(FizzBuzz.run(1) === "1")
  }

}
