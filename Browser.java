package week2.day2;

public class Browser {
	public String launchBrowser(String browserName)
	{
		return browserName;
	
	}
public void loadURL()
{
	System.out.println("Application URL loaded successfully");
}
public static void main(String[]args) {
Browser br= new Browser();
System.out.println(br.launchBrowser("Browser launched successfully"));
br.loadURL();
}
}
