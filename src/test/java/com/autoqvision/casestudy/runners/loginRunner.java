package com.autoqvision.casestudy.runners;


import com.autoqvision.casestudy.page.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class loginRunner {


    @Test
    void login() {
        var login = new LoginPage();
        Assertions.assertTrue(login.loginSucessful());
    }
}