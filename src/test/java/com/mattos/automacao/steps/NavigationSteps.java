package com.mattos.automacao.steps;

import com.mattos.automacao.config.WebDriverManager;
import com.mattos.automacao.pages.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class NavigationSteps {
	private WebDriver driver;
    private HomePage homePage;
    private CentralAjudaPage centralAjudaPage;
    private ActivationPage activationPage;

    @Before
    public void setup() {
        driver = WebDriverManager.getDriver();
        homePage = new HomePage(driver);
        centralAjudaPage = new CentralAjudaPage(driver);
        activationPage = new ActivationPage(driver);
    }

    @Given("o usuário acessa o site da Getnet")
    public void oUsuarioAcessaOSiteDaGetnet() {
        driver.get("https://site.getnet.com.br/");
    }

    @When("passar o mouse no botão Sou Cliente e na opção Central de Ajuda")
    public void passarOMouseNoBotaoSouClienteENaOpcaoCentralDeAjuda() {
        homePage.hoverOverSolutionsMenu();
        centralAjudaPage.clickHelpCenter();
    }
    
    @When("realiza uma busca por Como ativar e desbloquear o meu cartão Getnet")
    public void realizaUmaBuscaPorComoAtivarDesbloquearOMeuCartaoGetnet() {
        centralAjudaPage.searchForCardActivation();
    }

    @When("clica no botão Como ativar e desbloquear o meu cartão Getnet")
    public void clicaNoBotaoComoAtivarDesbloquearMeuCartaoGetNet() {
        centralAjudaPage.clickOnCardActivationResult();
    }

    @Then("a modal de ativação do cartão deve ser exibida")
    public void aModalDeAtivacaoDoCartaoDeveSerExibida() {
        assert activationPage.isModalDisplayed();
    }

    @After
    public void tearDown() {
        WebDriverManager.closeDriver();
    }
}
