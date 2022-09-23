package JsonfileTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadTest {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		//steps to read a Json:
		//1.create object for JSON parser
		JSONParser jsonparser = new JSONParser();
		
		//2. File reader - Read from the ".json file"
		FileReader filereader = new FileReader("Dhivya.json");
		
		//3.parse the read file using parse() and store it in object class. as it returns object.
		Object parsedObject = jsonparser.parse(filereader);
		
		//4.To get the json objects we convert the object to json object and we use get method to retrieve the data
		
		JSONObject jsonObject = (JSONObject)parsedObject;
		
		
		//5.use get method that belongs to jsonobject class and and store them in the respective datatypes after typecasting..
		String name  = (String) jsonObject.get("Name");
		String address = (String) jsonObject.get("Address");
		Long age = (Long)jsonObject.get("Age");
		JSONArray array  = (JSONArray)jsonObject.get("Qualities");
		
		//6.to fetch data from Json Array use iterator() and iterate them.
		Iterator iterator = array.iterator();
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+ age);
		System.out.println("Address is : "+ address);
		while(iterator.hasNext())

			System.out.println("Qualities: "+ iterator.next());
		
	}

}
