package com.mattos.automacao.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    private WebDriver driver;
    private By solutionsMenu = By.cssSelector("#menu-header-login-1 > :nth-child(1) > .gnt-nav-button");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void hoverOverSolutionsMenu() {
        Actions actions = new Actions(driver);

        WebElement menuElement = driver.findElement(solutionsMenu);

        actions.moveToElement(menuElement).perform();
    }
}
