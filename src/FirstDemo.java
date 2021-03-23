import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Chrome-Driver\\chromedriver.exe");
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://www.google.co.in/");
	}

}
