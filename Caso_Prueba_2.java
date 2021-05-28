
package org.testerfabrica.basico;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caso_Prueba_2 {

    //Se validara el acceso correcto al sitio

    public  static void main (String [] args) {

        WebDriver driver;

        String baseURL = "http://automationpractice.com/index.php";

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).sendKeys("alexisgonzalezlancheroz1989@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("123456");
        //driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();

        System.out.println("Se valida acceso correcto con la cuenta  " +
                "alexisgonzalezlancheroz1989@gmail.com");
    }

}