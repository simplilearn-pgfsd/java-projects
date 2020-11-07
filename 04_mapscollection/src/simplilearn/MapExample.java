package simplilearn;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Tim");
		hashMap.put(2, "Mary");
		hashMap.put(3, "Catle");
		System.out.println("The elements of HashMap are");

		for(Map.Entry<Integer, String> e:hashMap.entrySet()) {
			System.out.println(e.getKey() + "\t" + e.getValue());
		}
		
		Hashtable<Integer, String> hashTable = new Hashtable<>();
		hashTable.put(4, "Tim");
		hashTable.put(5, "Mary");
		hashTable.put(6, "Catle");
		System.out.println("The elements of Hashtable are");

		for(Map.Entry<Integer, String> e:hashTable.entrySet()) {
			System.out.println(e.getKey() + "\t" + e.getValue());
		}
		
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(8, "Tim");
		treeMap.put(7, "Mary");
		treeMap.put(9, "Catle");
		System.out.println("The elements of treeMap are");

		for(Map.Entry<Integer, String> e:treeMap.entrySet()) {
			System.out.println(e.getKey() + "\t" + e.getValue());
		}
		
	}

}
