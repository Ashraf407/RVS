package com.arora.restAssurd;
import java.io.FileNotFoundException; 
import java.io.PrintWriter; 
import java.util.LinkedHashMap; 
import java.util.Map; 
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 

public class AroraRest {
	
	
	public static void main(String[] args) throws FileNotFoundException  
    { 
        // creating JSONObject 
        JSONObject jo = new JSONObject(); 
          
        // putting data to JSONObject 
        jo.put("firstName", "John"); 
        jo.put("lastName", "Smith"); 
        jo.put("age", 25); 
          
        // for address data, first create LinkedHashMap 
        Map m = new LinkedHashMap(4); 
        m.put("streetAddress", "21 2nd Street"); 
        m.put("city", "New York"); 
        m.put("state", "NY"); 
        m.put("postalCode", 10021); 
          
        // putting address to JSONObject 
        jo.put("address", m); 
        
        Map m1 = new LinkedHashMap(); 
        
        JSONArray ja1 = new JSONArray();  
        /*m1.put("type", "home"); 
        m1.put("number", "212 555-1234"); 
        Map m2 = new LinkedHashMap(); 
        m2.put("type", "home"); 
        m2.put("number", "111 555-1234"); */
        // putting address to JSONObject 
        jo.put("address", m); 
        ja1.add(m1);
       // ja1.add(m2);
        m.put("Rural", ja1);
          
        // for phone numbers, first create JSONArray  
        JSONArray ja = new JSONArray(); 
          
        m = new LinkedHashMap(2); 
        m.put("type", "home"); 
        m.put("number", "212 555-1234"); 
          
        // adding map to list 
        ja.add(m); 
          
        m = new LinkedHashMap(2); 
        m.put("type", "fax"); 
        m.put("number", "212 555-1234"); 
          
        // adding map to list 
        ja.add(m); 
          
        // putting phoneNumbers to JSONObject 
        jo.put("phoneNumbers", ja); 
          System.out.println(jo);
        /*// writing JSON to file:"JSONExample.json" in cwd 
        PrintWriter pw = new PrintWriter("JSONExample.json"); 
        pw.write(jo.toJSONString()); 
          */
        
    } 
} 
	

