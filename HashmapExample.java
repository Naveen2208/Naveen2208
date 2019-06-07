package exercises;

import java.util.HashMap;
import java.util.Map;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class HashmapExample {

	
	public static void main(String[] args) {
		HashMap<Integer,String> hashmap_list=new HashMap<Integer,String>();
		hashmap_list.put(1, "Naveen");
		hashmap_list.put(2, "Praveen");
		hashmap_list.put(3, "Chinnu");
		hashmap_list.put(4, "Abhishek");
		hashmap_list.put(5, "Akhil");
		hashmap_list.put(6, "Lithin");
System.out.println("Branch Set");
		System.out.println("The names are:");
for(Map.Entry me: hashmap_list.entrySet()) {
	System.out.println(me.getKey()+" "+me.getValue());
}
hashmap_list.putIfAbsent(7, "Sai");
System.out.println("The new list of names are:");
for(Map.Entry me: hashmap_list.entrySet()) {
	System.out.println(me.getKey()+" "+me.getValue());
}
HashMap<Integer,String> map=new HashMap<Integer,String>();  
map.put(8,"Ravi");  
map.putAll(hashmap_list);  
System.out.println("New list of names after copying are:");
for(Map.Entry me: map.entrySet()) {
	System.out.println(me.getKey()+" "+me.getValue());
	}
map.replace(2, "Manoj");
System.out.println("The new list after changing the value:");
for(Map.Entry me: map.entrySet()) {
	System.out.println(me.getKey()+" "+me.getValue());
	}
	}
}
