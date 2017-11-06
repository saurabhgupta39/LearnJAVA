package LearnJAVA;

import java.util.HashMap;
import java.util.Map;

public class StringOpearation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringOpearation op = new StringOpearation();
		System.out.println(op.getMaxOccurringChar("saurabh"));

	}
	
	
	public Character getMaxOccurringChar (String strInput) {
		Map<Character, Integer> mapChars = new HashMap<Character, Integer>();
		int max =0;
		Character maxChar = null;
		for (int i=0; i<strInput.length(); i++) {
			if (isKeyPresent(mapChars, strInput.charAt(i))) {
				mapChars.put(strInput.charAt(i), mapChars.get(strInput.charAt(i)).intValue()+1);
			} else{
				mapChars.put(strInput.charAt(i), 1);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : mapChars.entrySet()) {
			if (max < entry.getValue()) {
				max = entry.getValue();
				maxChar = entry.getKey();
			}
		}
		return maxChar;
	}
	
	private boolean isKeyPresent(Map<Character, Integer> map, Character ch) {
		
		for (Character key : map.keySet()) {
			if (key == ch) {
				return true;
			}
		}
		return false;
	}

}
