Feature: Teste de execucao de serenity

  @Teste1
  Scenario: pesquisa google
  Given abro URL google
  When pesquiso "teste"
  Then verifico resultado "teste" pesquisado

