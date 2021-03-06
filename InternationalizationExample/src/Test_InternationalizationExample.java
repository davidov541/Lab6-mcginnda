import static org.junit.Assert.*;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;



public class Test_InternationalizationExample {
	@Test
	public void Test_GreetingsEnglish()
	{
		ResourceBundle resources = ResourceBundle.getBundle("messages", new Locale("en", "US"));
		assertEquals(PrintBalance.GreetUser(resources), "Hello World\nPlease enter your name");
	}
	@Test
	public void Test_BalanceEnglish()
	{
		ResourceBundle resources = ResourceBundle.getBundle("messages", new Locale("en", "US"));
		assertEquals(PrintBalance.DisplayBalance(resources, "Dave"), "I am pleased to meet you Dave\nAs of : " + DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, resources.getLocale()).format(new Date()) + "\nYou owe the school $9,876,543.21");
	}
	@Test
	public void Test_GoodbyeEnglish()
	{
		ResourceBundle resources = ResourceBundle.getBundle("messages", new Locale("en", "US"));
		assertEquals(PrintBalance.SayGoodbye(resources), "Good Bye");
	}
	@Test
	public void Test_GreetingsGerman()
	{
		ResourceBundle resources = ResourceBundle.getBundle("messages", new Locale("de", "DE"));
		assertEquals(PrintBalance.GreetUser(resources), "Hallo Welt\nBitte geben Sie Ihren Name");
	}
	@Test
	public void Test_BalanceGerman()
	{
		ResourceBundle resources = ResourceBundle.getBundle("messages", new Locale("de", "DE"));
		assertEquals(PrintBalance.DisplayBalance(resources, "Dave"), "Ich freut mich, zu kennenzulernen, Dave\nAb sofort : " + DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, resources.getLocale()).format(new Date()) + "\nSie schulden der Schule 9.876.543,21 €");
	}
	@Test
	public void Test_GoodbyeGerman()
	{
		ResourceBundle resources = ResourceBundle.getBundle("messages", new Locale("de", "DE"));
		assertEquals(PrintBalance.SayGoodbye(resources), "Auf Wiedersehen");
	}
	@Test
	public void Test_GreetingsFrench()
	{
		ResourceBundle resources = ResourceBundle.getBundle("messages", new Locale("fr", "FR"));
		assertEquals(PrintBalance.GreetUser(resources), "Bonjour tout le monde\nS'il vous plaît entrer votre nom");
	}
	@Test
	public void Test_BalanceFrench()
	{
		ResourceBundle resources = ResourceBundle.getBundle("messages", new Locale("fr", "FR"));
		assertEquals(PrintBalance.DisplayBalance(resources, "Dave"), "Je suis heureux de vous rencontrer, Dave\nComme des : " + 
				DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, resources.getLocale()).format(new Date()) + "\nVous devez l'école 9 876 543,21 €");
	}
	@Test
	public void Test_GoodbyeFrench()
	{
		ResourceBundle resources = ResourceBundle.getBundle("messages", new Locale("fr", "FR"));
		assertEquals(PrintBalance.SayGoodbye(resources), "Au revoir");
	}
}
