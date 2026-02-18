package org.example.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPom {

    static public WebDriver driver;

    @FindBy(xpath = "//*[text()='Forms']")
    WebElement forms;

    @FindBy(xpath = "//*[text()='Practice Form']")
    WebElement practiceForm;

    @FindBy(xpath = "//*[@id='firstName']")
    WebElement firstName;

    @FindBy(xpath = "//*[@id='lastName']")
    WebElement lastName;

    @FindBy(xpath = "//*[@id='userEmail']")
    WebElement userEmail;

    public FormPom(WebDriver driverParam) {
        driver = driverParam;
        PageFactory.initElements(driver, this);
    }

    public void setEmail(String emailParam) {
        userEmail.clear();
        userEmail.sendKeys(emailParam);
    }

    public void setLastName(String lastNameParam) {
        lastName.clear();
        lastName.sendKeys(lastNameParam);
    }

    public void setFirstName(String firstNameParam) {
        firstName.clear();
        firstName.sendKeys(firstNameParam);
    }

    public void clickPracticeForm() {
        practiceForm.click();
    }

    public void clickForms() {
        forms.click();
    }

    public void pause(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
