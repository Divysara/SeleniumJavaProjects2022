package JsonfileTest;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWriteTest {

	/*what is jason?
	 * jason stands for javascript object Notation
	 * it is nothing but saving json objects in a file with .json extension.
	 * we use web for searching all the informations like to check weather, cricket score, gold market rate etc.
	 * we send request to the browser and we get response from the server.. 
	 * jason acts as network mediator to send and receive the response
	 * its a light weight data-interchange format
	 * its self describing and easy to understand
	 * its language independent.
	 * 
	 * 
	 */
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//1.create jsonobject
		JSONObject jsonObject = new JSONObject();
		
		//2.add objects using put method in the format of key-value pair
		jsonObject.put("Name", "Dhivya");
		jsonObject.put("Address", "Lincoln");
		jsonObject.put("Age", 38);
		
		//3.to add an array, first create array
		JSONArray array = new JSONArray();
		array.add("Friendly");
		array.add("Nurturer");
		
		//4.now add the array object to the jsonobject
		jsonObject.put("Qualities", array);
		
		//5.after adding we need a file to store or save the json objects. for that we use filewriter class.
		FileWriter filewriter= new FileWriter("Dhivya.json");
		filewriter.write(jsonObject.toJSONString());
		filewriter.close();
		

		
		
	}

}
