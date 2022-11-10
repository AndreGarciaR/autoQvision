package com.autoqvision.casestudy.page;


import com.autoqvision.casestudy.commons.Base;

public class LoginPage extends Base {

    private static final String username_locator = "//input[@id='userName']";
    private static final String password_locator = "//input[@id='password']";
    private static final String buttonLogin_locator = "//button[@id='login']";
    private static final String loginSucessfull_locator = "//button[contains(text(),'Log out')]";

    public LoginPage() {
        super(driver);
    }

    public void navigatePage() {
        navigatePage("https://demoqa.com/login");
    }

    public void writeUsername(String locator, String username) {
        write(locator, username);
    }

    public void writePassword(String locator, String password) {
        write(locator, password);
    }

    public Boolean loginSucessful() {
        navigatePage();
        writeUsername(username_locator, "Andrea.Rodriguez");
        writePassword(password_locator, "Pruebas.2022*");
        clickElement(buttonLogin_locator);
        return verifyLogin(loginSucessfull_locator);
    }

    public boolean verifyLogin(String locator) {
        try {
            find(locator);
            return true;
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return false;
        }
    }
}