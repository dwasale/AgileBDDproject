package com.rudra;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepsDefinition {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    AppleMacBookPro appleMacBookPro = new AppleMacBookPro();
    @When("User click on register link button")
    public void user_click_on_register_link_button() {
        // Write code here that turns the phrase above into concrete actions
        homePage.toClickOnRegisterLinkButton();
    }
    @Then("User should be able to register and go back to home page")
    public void user_should_be_able_to_register_and_go_back_to_home_page() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.toFillTheRegistrationForm();
    }
    @Then("User click on {string} menu")
    public void user_click_on_menu(String category_name) {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnCategoryPage(category_name);
    }
    @Then("Goto {string} menu")
    public void goto_menu(String sub_category_name) {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnCategoryPage(sub_category_name);
    }
    @Then("Choose one of the {string} item")
    public void choose_one_of_the_item(String products) {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnCategoryPage(products);
    }
    @Then("User should be able to refer it to a friend")
    public void user_should_be_able_to_refer_it_to_a_friend() {
        // Write code here that turns the phrase above into concrete actions
        appleMacBookPro.toEmailAFriendAboutNewAppleMacBookPro();
    }
}
