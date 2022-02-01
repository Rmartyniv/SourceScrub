package com.sourcescrub.dev;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Iterator;

public class LoginTestData {

	JSONParser parser = new JSONParser();
	{
		try {
			Object obj = parser.parse(new FileReader("src/test/java/LoginTestData.json"));

			// A JSON object. Key value pairs are unordered. JSONObject supports
			// java.util.Map interface.
			JSONObject jsonObject = (JSONObject) obj;

			// A JSON array. JSONObject supports java.util.List interface.
			JSONArray username = (JSONArray) jsonObject.get("username");
			JSONArray password = (JSONArray) jsonObject.get("password");
			JSONArray devidentityurl = (JSONArray) jsonObject.get("devidentityurl");
			// An iterator over a collection. Iterator takes the place of Enumeration in the
			// Java Collections Framework.
			// Iterators differ from enumerations in two ways:
			// 1. Iterators allow the caller to remove elements from the underlying
			// collection during the iteration with well-defined semantics.
			// 2. Method names have been improved.

			@SuppressWarnings({ "unchecked", "unused" })
			Iterator<JSONObject> iterator = username.iterator();
			@SuppressWarnings("unchecked")
			Iterator<JSONObject> iterator1 = password.iterator();

			@SuppressWarnings({ "unchecked", "unused" })
			Iterator<JSONObject> iterator2 = devidentityurl.iterator();

			while (iterator1.hasNext()) {
				System.out.println(iterator1.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
