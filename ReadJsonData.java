package src.main.java.booking;

public class ReadJsonData {

	package booking;

	import java.io.FileReader;
	import org.json.simple.JSONObject;
	import org.json.simple.parser.JSONParser;

	public class ReadJsonData {
		public static String origin, destination,startdate,todate,passengers;
		
		public static void main(String[] args) throws Exception 
		{
			JSONParser jsonparser= new JSONParser();
			FileReader fileread= new FileReader("data.json");
			Object obj = jsonparser.parse(fileread);
			JSONObject jobject = (JSONObject)obj;
			
			 String origin= (String) jobject.get("origin");
			 destination= (String) jobject.get("destination");

			 startdate= (String) jobject.get("startdate");

			 todate= (String) jobject.get("todate");
			 passengers= (String) jobject.get("Passengers");
		
			System.out.println(origin);
			System.out.println(destination);
			System.out.println(startdate);
			System.out.println(todate);
			System.out.println(passengers);
		}

	}


