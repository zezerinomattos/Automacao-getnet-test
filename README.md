# Projeto de Automação QA - Getnet

## Visão Geral

Este projeto visa automatizar a verificação do modal de ativação do cartão SuperGet no site da Getnet. A automação é realizada utilizando Selenium WebDriver com Java, JUnit e Cucumber, e foi configurada para seguir as melhores práticas de design e organização de código. O objetivo é garantir que o fluxo de ativação do cartão e a exibição do modal funcionem corretamente.

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- **`src/test/java/com/mattos/automacao/pages`**: Contém classes de página que representam as páginas e componentes do site.
- **`src/test/java/com/mattos/automacao/steps`**: Contém as definições de etapas para o Cucumber, que traduzem os passos definidos nos arquivos de recurso para ações executáveis.
- **`src/test/resources/features`**: Contém os arquivos de recurso do Cucumber que descrevem os cenários de teste em linguagem Gherkin.
- **`pom.xml`**: Arquivo de configuração do Maven para gerenciar dependências e configurações do projeto.

## Dependências

O projeto utiliza as seguintes dependências principais:

- Selenium WebDriver
- JUnit
- Cucumber
- WebDriverManager

Certifique-se de que as seguintes dependências estão incluídas no seu arquivo `pom.xml`:

```xml
<dependencies>
    <!-- Selenium WebDriver -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.9.0</version>
    </dependency>
    
    <!-- JUnit -->
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.9.2</version>
        <scope>test</scope>
    </dependency>
    
    <!-- Cucumber -->
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>8.1.0</version>
    </dependency>
    
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-junit</artifactId>
        <version>8.1.0</version>
        <scope>test</scope>
    </dependency>
    
    <!-- WebDriverManager -->
    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.3.0</version>
    </dependency>
</dependencies>

```
# Configuração do Projeto

### 1 - Clone o repositório:
git clone git@github.com:zezerinomattos/Automacao-getnet-test-front-end.git 
cd Automacao-getnet-test-front-end

### 2 - Instale as dependências do Maven:
mvn install

## Execução dos Testes
mvn test

## Estrutura das Classes
## Classe CentralAjudaPage
Representa a página "Central de Ajuda" e contém métodos para interagir com os elementos dessa página, como clicar no link da Central de Ajuda, buscar a ativação do cartão e clicar no resultado da busca.

## Classe ActivationPage
Representa a página do modal de ativação do cartão. Contém métodos para clicar no botão de ativação do cartão e verificar se o modal e o texto esperado estão visíveis.

## Arquivo de Recursos (Feature File)
O arquivo de recursos define os cenários de teste usando a linguagem Gherkin. No projeto atual, o cenário inclui acessar o site, buscar a ativação do cartão e verificar a exibição do modal com o texto correto.

## Contribuição
Contribuições são bem-vindas. Sinta-se à vontade para abrir uma issue ou enviar um pull request para melhorar o projeto.

## Licença
Este projeto está licenciado sob a Licença MIT.
