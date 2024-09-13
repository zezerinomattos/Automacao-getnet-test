package com.mattos.automacao.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

import java.time.Duration;

public class CentralAjudaPage {
	private WebDriver driver;
	private By centralDeAjudaLink = By.cssSelector("#menu-header-login-1 > :nth-child(1) > .gnt-nav-menu-depth2 > :nth-child(1) > .gnt-nav-menu > :nth-child(5) > #menu-ajuda-sou-cliente-central-ajuda");
	private By searchInput = By.cssSelector("#faq-search-input");
	private By cardActivationButton = By.cssSelector("[href='https://site.getnet.com.br/duvidas/cartao-getnet/?modal_open=12807'] > .c-search-dropdown-link__item");

    public CentralAjudaPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void clickHelpCenter() {
        driver.findElement(centralDeAjudaLink).click();
    }
    
    public void searchForCardActivation() {
        driver.findElement(searchInput).sendKeys("Como ativar e desbloquear o meu cartão Getnet");
    }
    
    public void clickOnCardActivationResult() {
        // Define o tempo de espera se precisar
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        
        // Aguarde até que o elemento esteja presente e visível
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(cardActivationButton));
        element.click();
    }
    

    
}
