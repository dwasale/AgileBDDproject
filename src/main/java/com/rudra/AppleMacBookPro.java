package com.rudra;

import org.openqa.selenium.By;

public class AppleMacBookPro extends Utils{
    //Declaring locator paths for reuse-ability and clarity
    private By _clickMacBookIcon = By.linkText("Apple MacBook Pro 13-inch");
    private By _emailFriend = By.className("email-a-friend");
    private By _friendEmail = By.className("friend-email");
    private By _myEmail = By.className("your-email");
    private By _myMessage = By.name("PersonalMessage");
    private By _clickSendEmail = By.name("send-email");
    private By _getMessageAfterSuccessfulEmailAFriend = By.className("result");

    public void toEmailAFriendAboutNewAppleMacBookPro(){
        //Uniquely identify the element within the web page and perform given action click
        //clickOnElement(_clickMacBookIcon);
        //Uniquely identify the element within the web page and perform given action click
        clickOnElement(_emailFriend);
        //Uniquely identify the element within the web page fill it with the given user data
        sendUserInput(_friendEmail, "friendemail@email.com");
        //Uniquely identify the element within the web page fill it with the given user data
        sendUserInput(_myEmail, "");
        //Uniquely identify the element within the web page fill it with the given user data
        sendUserInput(_myMessage, "This is one of the best laptop in the market " +
                "with very high specs for day to day computing" +
                ". I recommend to get the latest 2022 version of macBook air with M2 chip.");
        clickOnElement(_clickSendEmail); //It will click the send email button
        System.out.println(getText(_getMessageAfterSuccessfulEmailAFriend));
 //       System.out.println(getTextFromSelectedElement(By.xpath("//div[@class='message-error validation-summary-errors']"))); // It will print the given message either successful/unsuccessful
    }
}
