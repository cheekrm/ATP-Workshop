import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

/**
 * Created by Ryan on 10/19/2015.
 */

driver =
{
    String os = ""
    String fileType = ""

    String osName = System.getProperty("os.name").toLowerCase()
    if (osName.contains("windows")) {
        os = "Windows"
        fileType = ".exe"
    } else if (osName.contains("mac")) {
        os = "Mac"
    } else if (osName.contains("linux")) {
        os = "Linux"
    } else {
        throw new Exception("Unrecognized operating system '${osName}.")
    }

    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\${os}\\chromedriver\\chromedriver${fileType}")

    WebDriver driver = new ChromeDriver()
}

reportsDir = ""
baseUrl = ""
atCheckWaiting = [30, 1]
autoClearCookies = false
