import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeWork9 {
//1.	In the main class write code that opens the chosen internet shop in Chrome browser.
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bookdepository.com/");
//2.	On the Home page locate logo, Sign in Register, icon, search field, navigation menu, banner.
        WebElement logo = waitForElementLocatedBy(driver, By.xpath("//a[@class='brand-link']/img"));
        WebElement signIn = waitForElementLocatedBy(driver, By.xpath("//div[@class='user-nav']//a[@href='/account/login/to/account']"));
        WebElement iconUser = waitForElementLocatedBy(driver, By.xpath("//div[@class='user-nav']//i[@class='icon-user']"));
        WebElement searchField = waitForElementLocatedBy(driver, By.xpath("//input[@class='text-input']"));
        WebElement navigationMenu = waitForElementLocatedBy(driver, By.xpath("//div[@class='secondary-header']//ul[@class='page-links mobile-nav-content']"));
        WebElement banner = waitForElementLocatedBy(driver, By.xpath("(//div[@class='paragraph-content'])[2]"));
//3.	Search for "camileo". or "ukranian" =)
        searchField.sendKeys("ukranian");
        WebElement searchButton = waitForElementLocatedBy(driver, By.xpath("//button[@class='header-search-btn']"));
        searchButton.click();
//4.	Click  "Add to cart" button for product "CAMILEO S10 EU"
        String bookName = "Bequest";
        WebElement addToBasket = waitForElementLocatedBy(driver, By.xpath("//meta[@content='" + bookName + "']/../div//a[@class='btn btn-sm btn-primary add-to-basket']"));
        addToBasket.click();
        WebElement closeButton = waitForElementLocatedBy(driver, By.xpath("//button[@class='close']"));
        closeButton.click();
//5.	Click on product "CAMILEO S10 EU" on search result page.
        WebElement product = waitForElementLocatedBy(driver, By.xpath("//meta[@content='" + bookName + "']/../div/h3/a"));
        product.click();
        WebElement productDetails = waitForElementLocatedBy(driver, By.xpath("//div[@class='biblio-wrap']"));

        driver.quit();
    }

    private static WebElement waitForElementLocatedBy(WebDriver driver, By by) {
        return new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }
}