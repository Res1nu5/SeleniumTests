package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlWikipediaOrg {

    WebDriver driver;

    // Tworzymy zmienne dla każdego elementu na stronie.
    By searchBox = By.id("searchInput");
    By searchButton = By.id("searchButton");

    public PlWikipediaOrg(WebDriver driver) {
        this.driver = driver;
    }



    // Tworzymy metody, które potem wykorzystamy w testach
    // Wpisanie tekstu w wyszukiwarkę

    public void provideSearchText(String text) {
        driver.findElement(searchBox).sendKeys(text);
    }

    public void clickSearchButton(){
        driver.findElement(searchButton).click();
    }

}
