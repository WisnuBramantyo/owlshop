package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static drivers.AndroidDriverInit.driver;

public class MedicinePage {
    public void clickBtn() {
        By locator = MobileBy.id("login");
        AndroidElement btnLogin = driver.findElement(locator);
        btnLogin.click();
        //fungsi untuk menemukan text di element Hasil:
//        AndroidElement result = driver.findElement(By.id("com.isl.simpleapp:id/tv_result"));
//        System.out.println(result.getText());

    }

}
