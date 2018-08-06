package com.turvo.javaPro;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class wtiteTojson {
	public static void main(String[] args) throws IOException {

		JSONObject obj = new JSONObject();
		obj.put("Name", "phanindra");
		obj.put("rank", 1);

		JSONArray officeAddress = new JSONArray();
		officeAddress.add("Company :Turvo Inc");
		officeAddress.add("Building Name:Kapil Towers,Gacchibowli");

		obj.put("officeAddress", officeAddress);

		JSONObject obj1 = new JSONObject();
		obj1.put("Name", "phanindra");
		obj1.put("rank", 1);

		JSONObject Obj0 = new JSONObject();
		Obj0.put("key1", obj1);
		Obj0.put("key2", "voyager2 in space");

		JSONArray skillSet = new JSONArray();

		skillSet.add(Obj0);

		skillSet.add("Technology: java");
		skillSet.add("Experience: 4 years");

		JSONObject newobj = new JSONObject();

		newobj.put("test1", "value1");
		newobj.put("test2", "value2");

		skillSet.add(newobj);

		obj.put("skillSet", skillSet);

		FileWriter filewriter = new FileWriter(
				"/Users/turvo/Desktop/jsonExample1.json");
		try {

			filewriter.write(obj.toString());

		} catch (Exception e) {

		} finally {
			filewriter.flush();
			filewriter.close();

		}

	}
}
