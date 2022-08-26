package collectionsprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintUniqueCharacter {
	
	public static void main(String[] args) {
	String  text="babu";
	char[] ch = text.toCharArray();
	Set<Character> set = new HashSet<Character>();
	for (Character each : ch) {
		set.add(each);
	}System.out.println(set);
	List<Character> list = new ArrayList<Character>(set);
	for (int i = 0; i < list.size(); i++) {
		int count=0;
		for (int j = 0; j < ch.length; j++) {
			if(list.get(i)==ch[j]) {
				count++;
				
			}
		}if(count==1) {
			
			System.out.println(list.get(i));
		}
	}
}
}
	