package io.github.caiofralmeida.tddscala

import org.scalatest.FunSuite

class JokenpoTest extends  FunSuite{


  test("Quando passar pedra e tesoura deve retornar Pedra Ganhou") {
    assert(Jokenpo.run("pedra", "tesoura") == "pedra ganhou")
  }

  test("Quando passar papel e pedra deve retornar Papel Ganhou") {
    assert(Jokenpo.run("papel", "pedra") == "papel ganhou")
  }

  test("Quando passar tesoura e papel deve retornar Tesoura Ganhou") {
    assert(Jokenpo.run("tesoura", "papel") == "tesoura ganhou")
  }

  test("Quando passar pedra e pedra deve retornar empate") {
    assert(Jokenpo.run("pedra", "pedra") == "empate")
  }
}