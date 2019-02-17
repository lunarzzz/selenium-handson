package cn.ruby;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @ClassNameTest
 * @Description TODO
 * @Author apple
 * @Date 2019/2/17 5:52 PM
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) throws MalformedURLException {
        WebDriver webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub/"), new ChromeOptions());
        webDriver.get("http://www.baidu.com");
        String title = webDriver.getTitle();
        System.out.println(title);
    }
}
