import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

/**
 * Created by Ryan on 10/19/2015.
 */

driver =
{
    String osName = System.getProperty("os.name").toLowerCase()
    if (osName.contains("windows")) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver\\chromedriver.exe");
    } else if (osName.contains("mac")) {
        return OperatingSystem.OSX
    } else if (osName.contains("linux")) {
        return OperatingSystem.LINUX
    } else {
        throw new Exception("Unrecognized operating system '${osName}'.")
    }

    WebDriver driver = new ChromeDriver()
    driver
}

reportsDir = "C:\\"
baseUrl = ""
atCheckWaiting = [30, 1]
autoClearCookies = false
