package com.rudra;

import org.openqa.selenium.By;

public class HomePage extends Utils{

    private By _registerLink = By.className("ico-register");

    public void toClickOnRegisterLinkButton(){
        clickOnElement(_registerLink);
    }

    public void clickOnCategoryPage(String category_name){
        clickOnElement(By.linkText(category_name));
    }
}
