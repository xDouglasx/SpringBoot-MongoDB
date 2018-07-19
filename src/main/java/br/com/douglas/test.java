package br.com.douglas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class test {

	public static void main(String[] args) throws IOException
	{
		   String URLstring = "https://jsonmock.hackerrank.com/api/movies/search/?Title=spiderman";
        
	       URL url = new URL(URLstring);
	       HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	       conn.setRequestMethod("GET");
	       
	       
	       BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	       String input;
	        StringBuffer response = new StringBuffer();
	       while ((input = in.readLine()) != null){
	           response.append(input);
	       } 
	       
	        System.out.println(response.toString());


	}

}
