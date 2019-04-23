import java.net.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class HTMLData {
		 
	 
	public static void main(String[] args) throws Exception {

		
	    URL oracle = new URL("http://www.lan.esalq.usp.br/en/equipe/docentes");
	    BufferedReader in = new BufferedReader(
	    new InputStreamReader(oracle.openStream()));

	    String inputLine;
	    StringBuffer sb = new StringBuffer();
	    
	    while ((inputLine = in.readLine()) != null) {
	    	sb.append(inputLine);
	        System.out.println(inputLine);
	    }
	        
	    in.close();
	    //TODO: Fix regexp...
	    Pattern pattern1 = Pattern.compile("\\w+@\\w+.\\w+");
	    Matcher matcher1 = pattern1.matcher(sb);
	    
	    while (matcher1.find())
	    	System.out.println(matcher1.group(0));
	    
    } //main

} //HTMLData

