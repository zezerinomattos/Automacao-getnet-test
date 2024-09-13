package com.mattos.automacao.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActivationPage {
	private WebDriver driver;
    private By activateCardButton = By.xpath("//button[contains(text(), 'Como ativar meu cartão SuperGet')]");
    private By modalContent = By.cssSelector(".is-modal-open > .o-modal__content");
    private By modalText = By.xpath("//div[contains(text(), 'Como ativar/desbloquear o meu cartão Getnet?')]");

    public ActivationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickActivateCardButton() {
        driver.findElement(activateCardButton).click();
    }

    public boolean isModalDisplayed() {
        WebElement modal = driver.findElement(modalContent);
        return modal.isDisplayed();
    }

    public boolean isTextVisibleInModal() {
        WebElement textElement = driver.findElement(modalText);
        return textElement.isDisplayed();
    }
}
