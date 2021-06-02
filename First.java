import java.util.*;
import java.lang.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class First
{
	public static void main(String[]args)
	{
		/*
		com.sun.security.auth.module.NTSystem NTSystem = new
		com.sun.security.auth.module.NTSystem();

		For getting the user name and laptop name.

	    System.out.println(NTSystem.getName());
	    System.out.println(NTSystem.getDomain());

	    new com.sun.security.auth.module.UnixSystem().getUsername() - For unix

	    For getting the user name and laptop name.
	    */
	    System.out.println("Hi ! I am a Chatbot. Type below to talk to me. Type \'exit\' to exit the App\n");

		do
		{

			Scanner sc=new Scanner(System.in);
			System.out.println("Your command : ");
			String str=sc.nextLine();

			str = str.toLowerCase();

			if (str.equals("hello") || str.equals("hola") || str.equals("hi")) {
				try {
			      File myObj = new File("name.txt");
			      Scanner myReader = new Scanner(myObj);
			      while (myReader.hasNextLine()) {
			        String data = myReader.nextLine();
			        System.out.println(str+" "+data);
			      }
			      myReader.close();
			    } catch (FileNotFoundException e) {
			      System.out.println("Error reading \"name.txt\".");
			      e.printStackTrace();
			    }

			} else if (str.equals("exit") || str.equals("close") || str.equals("quit")) {
				System.out.println("Thank You for using ChatBot !");
				System.exit(0);

			} else if (str.equals("what is your name") || str.equals("who are you")) {
				System.out.println("My name is Bob and I am a Chatbot made from Java.");

			} else if (str.equals("who made you") || str.equals("who created you")) {
				System.out.println("I was created by Joel Shine on June 2, 2021 !");

			} else if (str.equals("youtube") || str.equals("open yutube") || str.equals("start youtube")) {
				Runtime runtime = Runtime.getRuntime();     //getting Runtime object
 
		        String[]website = new String[] {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "http://www.youtube.com"};
		 
		        try
		        {
		            runtime.exec(website);
		        }
		        catch (IOException e)
		        {
		            e.printStackTrace();
		        }
			} else if (str.equals("notepad") || str.equals("start notepad") || str.equals("open notepad")) {
				Runtime runtime = Runtime.getRuntime();     //getting Runtime object
 
		        try
		        {
		            runtime.exec("notepad.exe");
		 
		            //OR runtime.exec("notepad");
		        }
		        catch (IOException e)
		        {
		            e.printStackTrace();
		        }

			} else {
				continue;
			}

		}while(true);
	}
}