import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


/**
 * TODO A simple class that needs to be localized
 *
 * @author mohan.
 *         Created Mar 27, 2010.
 */
public class PrintBalance{


	/**
	 * Simple Java Method that is crying out to be localized.
	 *
	 * @param args
	 */
	public static void main(String args[])
	{
		ResourceBundle resources = ResourceBundle.getBundle("messages", new Locale("fr", "FR"));
		Scanner scanInput = new Scanner(System.in);

		System.out.println(GreetUser(resources));
		String name = scanInput.nextLine();
		System.out.println(DisplayBalance(resources, name));
		System.out.println(SayGoodbye(resources));
	}

	public static String SayGoodbye(ResourceBundle resources)
	{
		return resources.getString("Farewell");
	}

	public static String DisplayBalance(ResourceBundle resources, String name)
	{
		String returnable = "";
		Date today = new Date();
		returnable += resources.getString("PleasedToMeet") + name;

		//print today's date, balance and bid goodbye
		returnable += "\n";
		returnable += resources.getString("OnToday") + DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, resources.getLocale()).format(today);
		returnable += "\n";
		returnable += resources.getString("Owes") + NumberFormat.getCurrencyInstance(resources.getLocale()).format(9876543.21);
		return returnable;
	}

	public static String GreetUser(ResourceBundle resources)
	{
		String returnable = "";
		//Greeting
		returnable += resources.getString("Greeting");
		returnable += "\n";
		//Get User's Name
		returnable += resources.getString("NameRequest");
		return returnable;
	}
}
