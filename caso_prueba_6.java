package org.testerfabrica.basico;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class caso_prueba_6 {


    public  static void main (String [] args) {

        WebDriver driver;

        String baseURL = "http://automationpractice.com/index.php";
        String actualResult="";
        String expectedResult="$18.51";
        String chromePath = System.getProperty("user.dir")+ "\\drivers\\chromedriver.exe";



        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).sendKeys("alexisgonzalezlancheroz1989@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("123456");
        //driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
        //driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")).click();
        driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();

        actualResult = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[3]/span")).getText();
        //actualResult= driver.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div:nth-child(4) > span")).getText();



        if (actualResult.contentEquals(expectedResult)){
            System.out.println("resultado no exitoso");

        }
        else System.out.println("resultado exitoso : El valor de la camiseta seleccionada  " + actualResult + "es igual a " + expectedResult)    ;
        }
    }









