package simplilearn;

import java.util.*;

public class AllCollectionTypes {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList(); heterogeneous
		ArrayList<String> cities = new ArrayList<>();
		cities.add("bengaluru");
		cities.add("delhi");
		System.out.println(cities);
		
		/// create  an instance of Vector
		Vector<Integer> vector = new Vector<>();
		vector.add(1010);
		vector.add(2020);
		System.out.println(vector);
		
		
		// create an instance of LinkedList
		LinkedList<String> names = new LinkedList<>();
		names.add("vinodh");
		names.add("mahendra");
		// Use iterator to traverse a LinkedList
		Iterator<String> i = names.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	
		
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(101);
		hashSet.add(103);
		hashSet.add(102);
		hashSet.add(104);
		System.out.println(hashSet);
		//Use ForEach loop to traverse a collection (Set,List and Map)
		System.out.println("using for each");
		for(Integer element: hashSet) {
			System.out.println(element);
		}
		
		LinkedHashSet<Integer> set = new  LinkedHashSet<>();
		set.add(101);
		set.add(103);
		set.add(104);
		set.add(102);
		System.out.println(set);
		
		
		 
	}
	

}
