package HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		
		String str="aabbcde".toLowerCase();
		
		Map<Character,Integer>map=new LinkedHashMap<>();
		
		for(char c:str.toCharArray()) {
			if(Character.isLetter(c)) {
				map.put(c, map.getOrDefault(c, 0)+1);
			}
		}
		
		for(char c:str.toCharArray()) {
			if(Character.isLetter(c)&& map.get(c)<2)
			{
				System.out.println("first nonrepeated character: "+c);
				break;
			}
			
			/*  if(map.get(ch) == 1) {
			        System.out.println(ch);
			        break;*/
		}
	}

}
