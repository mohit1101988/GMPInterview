import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class Puzzle {

	public static void main(String[] args) {
		
		
		/*
		* Adding new comment line
		 * Take the input array
		 * Get the size of the array
		 * For each element, pair it with all other elements of the array and store their sum in a key value pair
		 * Store above in a hash map
		 * compare the values of each  
		 * give out the result
		 * Extra Line Comment: Need to be ignored
		 * Another extra line: Need to be ignored
		 * Next Comment Line: Need to be ignored
		 * More Details added to Comment Line 4: Need to be ignored
		 * Zomato Changes for OTP/ TOTP: Need to be ignored
		 * Swiggy Changes For Add User Flow & Login: Need to be ignored
		 * IRCTC New API Integrations: Need to be ignored
		 */

		int []input = {1,4,2,3,8,9,5};
		int length = input.length;
		
		//To put all addition pairs and their values in a hashTable
		Hashtable<String, Integer> myData  = new Hashtable<String, Integer>() ; 
		
		for (int i = 0; i < length; i++) {
			for (int j = i+1; j < length; j++) {
				myData.put(input[i]+"+"+input[j], input[i]+input[j]);
			}
		}
		
		//To be used for printing out the Hashtable entries, if needed
		
		/*for (Map.Entry<String, Integer> entry : myData.entrySet()) {
		    String key = entry.getKey();
		    Integer value = entry.getValue();

		    System.out.println ("Key: " + key + " Value: " + value);
		}*/
		
		//For comparing the values and printout the result
		
		for(Map.Entry<String, Integer> entry1: myData.entrySet()) {
			   String key1 = entry1.getKey();
			   int value1 = entry1.getValue();
			   for(Map.Entry<String, Integer> entry2: myData.entrySet()) {
				   String key2 = entry2.getKey();
				   int value2 = entry2.getValue();
				   if (key1.hashCode() > key2.hashCode()){
			    	   if(value1 == value2){
			    		   System.out.println(entry1.getKey()+" is equal to "+entry2.getKey());
			    	   }
			       }

			   }
			}
		
	
		
	}

}
