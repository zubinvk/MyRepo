package programs;

import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidLinks {
	public static WebDriver driver;
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/");

        //Storing the links in a list and traversing through the links
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // This line will print the number of links and the count of links.
        System.out.println("No of links are "+ links.size());  
      
        //checking the links fetched.
        for(int i=0;i<links.size();i++)
        {
            WebElement E1= links.get(i);
            String url= E1.getAttribute("href");
            verifyLinks(url);
        }
        
        driver.quit();
    }
    
    
    public static void verifyLinks(String linkUrl)
    {
        try
        {
            URL url = new URL(linkUrl);

            //Now we will be creating url connection and getting the response code
            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            if(httpURLConnect.getResponseCode()>=400)
            {
            	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
            }    
       
            //Fetching and Printing the response code obtained
            else{
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
        }catch (Exception e) {
      }
   }
}
	
	
	
	

//	public static void main(String[] args) throws Exception {
//		driver = WebDriverManager.chromedriver().create();
////		String downloadedDriverPath = WebDriverManager.chromedriver().getDownloadedDriverPath();
////		System.out.println(downloadedDriverPath);
//////    	WebDriver driver = new ChromeDriver();
////		driver.get("https://www.w3schools.com/");
////		System.out.println(driver.getTitle());
////		
////		Set<String> windowHandles = driver.getWindowHandles();
////		for(String wh:windowHandles) {
////			System.out.println(wh);
////		}
////		
////		System.out.println(windowHandles.size());
//		
////		String companyName = "Alfreds Futterkiste";
////		WebElement countryName = getCorrespondingCountry(companyName);
////		WebElement contactName = getCorrespondingContact(companyName);
////		
////		System.out.println("Country Name of the "+companyName+" - "+countryName.getText());
////		System.out.println("Contact Name of the "+companyName+" - "+contactName.getText());
//
////		driver.quit();
//		
//		driver.manage().window().maximize();
////		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.hyrtutorials.com/");
//			
//		List<WebElement> webElements = driver.findElements(By.tagName("a"));
//		System.out.println(webElements.size());
//
//		for(WebElement we:webElements) {
//			String checkUrl = we.getAttribute("href");
//			URL url = new URL(checkUrl);
//			CookieHandler.setDefault(new CookieManager(null, CookiePolicy.ACCEPT_ALL));
//			HttpURLConnection openConnection = (HttpURLConnection) url.openConnection();
//			openConnection.setConnectTimeout(5000);
//			openConnection.connect();
//			System.out.println(openConnection.getResponseCode());
//		}
//			
//		
//		
//	}
//
//	public static void checkBrokenLink(String link) {
//
//		try {
//			URL url = new URL(link);
//
//			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//
//			connection.setConnectTimeout(100000);
//			connection.connect();
////			System.out.println(connection.getResponseCode());
//
//			if (connection.getResponseCode() >= 400) {
//				System.out.println(link + "---------------------->" + connection.getResponseMessage());
//			}
//			else {
//				System.out.println(link +"-----------------------"+connection.getResponseCode());
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//	private static WebElement getCorrespondingContact(String companyName) {
//		return driver.findElement(
//				By.xpath("//table[@id='customers']//td[contains(text(),'" + companyName + "')]//../td[2]"));
//
//	}
//
//	public static WebElement getCorrespondingCountry(String companyName) {
//		return driver.findElement(
//				By.xpath("//table[@id='customers']//td[contains(text(),'" + companyName + "')]//../td[3]"));
//	}
//}
