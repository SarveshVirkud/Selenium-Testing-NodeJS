
package sel_nodejs;

import static org.openqa.grid.common.SeleniumProtocol.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Sarvesh Virkud
 */
public class Sel_nodejs 
{
  
    public static void main(String[] args) 
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\virku\\Desktop\\Work\\Java\\chromedriver_win32\\chromedriver.exe");
        //Your system path where the chrome driver is stored
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/"); //The Page which is to be fetched and tested
        driver.manage().window().maximize();
        
        driver.findElement(By.id("1")).sendKeys("Andheri");
        driver.findElement(By.id("2")).sendKeys("Mumbai");
        driver.findElement(By.id("3")).sendKeys("India");
        driver.findElement(By.id("4")).sendKeys("23");
        driver.findElement(By.id("5")).sendKeys("45");
        driver.findElement(By.id("6")).sendKeys("Bombay Barbeque");
        driver.findElement(By.id("7")).sendKeys("400024");
        driver.findElement(By.id("btn1")).click();
        String actualText = "Insertion Successful";
        String extractedText = driver.findElement(By.id("textView")).getText();
        driver.close();
        if(actualText.equals(extractedText))
        System.out.println("TEST SUCCESSFUL");
        else
        System.out.println("TEST FAILURE");
   
    }  
}
