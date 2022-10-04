package E_CommercePages;

// This class defines homePage elements.


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
    WebDriver driver;
    // Defines homepage URL.
    public String homepageURL() {
        return "https://demo.nopcommerce.com/";

    }

    // Defines Search Text Field Element.
    public WebElement searchTxtFld() {
        By searchTxtFld = By.cssSelector("input[class=\"search-box-text ui-autocomplete-input\"]");
        return driver.findElement(searchTxtFld);
    }

    // Defines Search Button Element.
    public WebElement searchButton() {
        By searchButton = By.cssSelector("button[class=\"button-1 search-box-button\"]");
        return driver.findElement(searchButton);
    }

    // Define Computers Category in TOP MENU:
    public WebElement computersCategory() {
        By computersCategory = By.cssSelector("ul[class=\"top-menu notmobile\"] > li > [href=\"/computers\"]");
        return driver.findElement(computersCategory);
    }

    // Define Desktops SubCategory in TOP MENU:
    public WebElement desktopsSubCategory() {
        By desktopsSubCategory = By.cssSelector("ul[class=\"sublist\"] > li[class=\"inactive\"] > [href=\"/desktops\"]");
        return driver.findElement(desktopsSubCategory);
    }

    // Define Apparel Category in TOP MENU:
    public WebElement apparelCategory() {
        By apparelCategory = By.cssSelector("ul[class=\"top-menu notmobile\"] > li > a[href=\"/apparel\"]");
        return driver.findElement(apparelCategory);
    }

    public WebElement facebookLink() {
        By facebookLink = By.xpath("//li[@class='facebook']");
        return driver.findElement(facebookLink);
    }

    public WebElement twitterLink() {
        By twitterLink = By.xpath("//li[@class='twitter']");
        return driver.findElement(twitterLink);
    }
    public WebElement rssLink() {
        By rssLink = By.xpath("//li[@class='rss']");
        return driver.findElement(rssLink);
    }

    public WebElement youtubeLink() {
        By youtubeLink = By.xpath("//li[@class='youtube']");
        return driver.findElement(youtubeLink);
    }


}
