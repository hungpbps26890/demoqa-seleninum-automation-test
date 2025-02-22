package com.demoqa.tests.elements;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.elements.WebTablesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTableTest extends BaseTest {

    @Test
    public void testWebTable() {
        //given
        String email = "kierra@example.com";
        String age = "18";

        WebTablesPage webTablesPage = homePage.goToElementsPage().clickWebTables();

        //when
        webTablesPage.clickEdit(email);
        webTablesPage.setAge(age);
        webTablesPage.clickSubmit();

        String actualTableAge = webTablesPage.getTableAge(email);

        //then
        String message = "\nActual & Expected Age Do Not Match\n";
        Assert.assertEquals(actualTableAge, age, message);
    }
}
