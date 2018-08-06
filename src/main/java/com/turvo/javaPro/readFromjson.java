package com.turvo.javaPro;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class readFromjson {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		Object obj001 = new JSONParser().parse(new FileReader("/Users/turvo/Desktop/jsonExample1.json"));
		
		JSONObject jo =  (JSONObject)obj001;
		
		
		Long rank = (Long)jo.get("rank");
		String name =(String)jo.get("Name");
		JSONArray  officeAddress = (JSONArray) jo.get("officeAddress");
		JSONArray  skillSet = (JSONArray) jo.get("skillSet");

		int size = skillSet.size();
		
		System.out.println("----rank---"+rank);
		System.out.println("---name----"+name);
		System.out.println("--officeAddress---"+officeAddress);
		System.out.println("----skillSet---"+skillSet);
		
		System.out.println("-----size ---"+size);
		
			

			JSONObject objects=	(JSONObject) skillSet.get(0) ; 
			System.out.println("--objects ---"+objects);
			
			//getting the key1 in JSONObject form
			JSONObject  key1 = (JSONObject) objects.get("key1");
			
			//getting the key1 in Map form. We can iterate this map through iterator
			Map map = (Map)objects.get("key1");
			System.out.println("--key1 in Map form ---"+map);

			
			
			System.out.println("--key1 in objects ---"+key1);

			System.out.println("-- in key1 json ---"+key1.get("rank"));
			System.out.println("-- in key1 json ---"+key1.get("Name"));

			
			String str1=	(String) skillSet.get(1) ; 
			System.out.println("--objects1 ---"+str1);


			String str2=	(String) skillSet.get(2) ; 
			System.out.println("--objects2 ---"+str2);


			JSONObject objects3=	(JSONObject) skillSet.get(3) ; 
			System.out.println("--objects3 ---"+objects3);
			
			
			System.out.println("---In the objects3----"+objects3.get("test2"));
			System.out.println("---In the objects3----"+objects3.get("test1"));

	/*
	 * for ref: https://www.geeksforgeeks.org/parse-json-java/
	 *          https://stackoverflow.com/questions/41016764/parsing-nested-json-array-in-java
	 *          https://stackoverflow.com/questions/6697147/json-iterate-through-jsonarray#
	 *          https://www.w3schools.com/js/js_json_arrays.asp
	 * 
	 * 
	 */




	}

}
