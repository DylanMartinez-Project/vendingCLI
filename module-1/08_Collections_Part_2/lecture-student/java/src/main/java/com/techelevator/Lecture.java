package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();



		// DECLARE MAP WITH KEY SRING AND VALUE STRING

			Map <String, String > nameToZip = new HashMap< String, String>();


			// add 3 items to map

		nameToZip.put(" David", "44120");
		nameToZip.put("Dan", "44124");
		nameToZip.put("Elizabeth", "44012");
		System.out.println(" The map has " + nameToZip.size()+ " key-value pairs");


		String davidZip = nameToZip.get("David");  // returns 44120
		String danZip = nameToZip.get("Dan");
		String elizZip = nameToZip.get("Elizabeth");

		System.out.println(" David lives in " + davidZip);
		System.out.println("Dan lives in " + danZip);
		System.out.println("Eliz lives in " + elizZip);


		boolean containsEliz = nameToZip.containsKey("Elizabeth");
		boolean cpntainsAndrew = nameToZip.containsKey("Andrew");

		System.out.println("Contains Elizabeth " + containsEliz);
		System.out.println("Contains Andrew "+ cpntainsAndrew);

		boolean contains44124 = nameToZip.containsValue("44124");
		System.out.println("Someone in 44124 " + contains44124);

		nameToZip.remove("Dan");
		System.out.println(nameToZip);


for (Map.Entry<String, String> nameZip: nameToZip.entrySet() ){
	System.out.println(nameZip.getKey() +" lives in " + nameZip.getValue());
}

		System.out.println("EXAMPLES OF KEY SETS");

	Map<Integer, String> employees = new HashMap< Integer, String>();

	employees.put (1000, "Steve");
	employees.put(2000, "Alice");
	employees.put(3000, "Terry");

	Set<Integer> employeeId = employees.keySet();
	for (Integer id : employeeId){
		String mapValue = employees.get(id);

		System.out.println(mapValue);
	}

	}

}
