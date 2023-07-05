package GENRIC_SCRIPT;
import org.s
import java.io.File;
import java.util.Date;

public class Take_sreenshot 
{
	public static void getphoto(WebDriver driver) 
	{
		String photo=".photos/";
		Date d=new Date();
	   String d1=d.toString();
	   String d2=d1.replaceAll(":", "_");
	   TakesScreenshot ts=(TakesScreenshot)driver;
	   File src=ts.getscreenshotAs(OutputTy)
	  
		
		
	}

}
