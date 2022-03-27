package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.PlWikipediaOrg;

public class SearchInWikipedia {



    public static void main(String[] args) {
        performSearch();
    }

    private static void performSearch(){
        System.setProperty("webdriver.edge.driver","Drivers/Edge/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://pl.wikipedia.org");

        PlWikipediaOrg wikipedia = new PlWikipediaOrg(driver);

        wikipedia.provideSearchText("Buffalo buffalo Buffalo buffalo buffalo buffalo Buffalo buffalo");
        wikipedia.clickSearchButton();
    }
}
