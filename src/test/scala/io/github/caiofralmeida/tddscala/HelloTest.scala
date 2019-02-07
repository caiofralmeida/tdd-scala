package io.github.caiofralmeida.tddscala

import org.scalatest.FunSuite

class HelloTest extends FunSuite {

  test("the name is set correctly in constructor") {
    assert(Hello.jamal == "Hello")
  }
}
