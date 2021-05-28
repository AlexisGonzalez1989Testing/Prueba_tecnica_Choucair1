package org.testerfabrica.basico;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caso_Prueba_1 {

    public  static void main (String [] args) {

        WebDriver driver;

        String baseURL = "http://automationpractice.com/index.php";
        String actualResult="";

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get(baseURL);
        driver.manage().window().maximize();



        if (actualResult.contentEquals(baseURL)){

            System.out.println("ingreso corrrecto sitio = resultado exitoso ");
        }


        else {System.out.println("No ingreso al sitio deseado = resultado no exitoso");}


    }

}
