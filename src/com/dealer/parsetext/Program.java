package com.dealer.parsetext;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Vinodh Thiagarajan
 *
 */
public class Program {

	/**
	 * @param This method parses a text file that has key,value pair in the following format
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader input;
		try {

			
			 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\c813507\\Desktop\\DealerParse.txt"));
			    try {
			        StringBuilder sb = new StringBuilder();
			        String line = br.readLine();
			        HashMap<String,Integer> hmAddBasedOnUser = new HashMap<String,Integer>();
			        while (line != null) {
			            line = br.readLine();
			            if(line != null){
			            String[] splitLine = line.split(",");
			            if (hmAddBasedOnUser.containsKey(splitLine[0].toString())) {
			                // Okay, there's a key but the value is null
			            	int intFromHm = hmAddBasedOnUser.get(splitLine[0].toString());
			            	int intFromTxt = Integer.parseInt(splitLine[1].toString());
			            	hmAddBasedOnUser.put(splitLine[0].toString(), intFromHm+intFromTxt);
			             } else {
			            	 hmAddBasedOnUser.put(splitLine[0].toString(),Integer.parseInt(splitLine[1].toString()));
			             }
			            }
			        }
			        //Now the Result (Implement LinkedHashMap to get a sorted output)
			        Iterator it = hmAddBasedOnUser.entrySet().iterator();
			        while (it.hasNext()) {
			            Map.Entry pairs = (Map.Entry)it.next();
			            System.out.println("The total for " +pairs.getKey() + " is  " + pairs.getValue());
			            it.remove(); // avoids a ConcurrentModificationException
			        }
			        
			      
			    } finally {
			        br.close();
			    }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not Found , verify the file location");
		}catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File not i");
		}catch(Exception e){
			//Just for Development
			e.printStackTrace();
			System.out.println("Exception While Parsing!!");
		}
		

}
}
