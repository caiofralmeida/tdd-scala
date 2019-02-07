package io.github.caiofralmeida.tddscala

object Jokenpo {

  def run(playerOne: String, playerTwo: String): String = {



    if (playerOne.equals("pedra") && playerTwo.equals("tesoura")) {
      return "pedra ganhou"
    }

    if (playerOne.equals("papel") && playerTwo.equals("pedra")) {
      return "papel ganhou"
    }

    if (playerOne.equals("tesoura") && playerTwo.equals("papel")) {
      return "tesoura ganhou"
    }


    return "empate"
  }

  val relacao = ;

  def pedra(adversario: String): String = {
    if (adversario == "papel") {
      return "papel"
    }

    if (adversario == "tesoura") {
      return "pedra"
    }

    return "empate"
  }

}
