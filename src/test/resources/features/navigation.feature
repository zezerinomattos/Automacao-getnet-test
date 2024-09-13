Feature: Navegação no site da Getnet

  Scenario: Verificar a modal de ativação do cartão SuperGet
    Given o usuário acessa o site da Getnet
    When passar o mouse no botão Sou Cliente e na opção Central de Ajuda
    And realiza uma busca por Como ativar e desbloquear o meu cartão Getnet
    And clica no botão Como ativar e desbloquear o meu cartão Getnet
    Then a modal de ativação do cartão deve ser exibida
