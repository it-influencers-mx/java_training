package com.accenture.chapter3;

public class StringPool {
	public static void main(String args[]) {
		
		//Ejemplo 1
		String name1 = "Emmet";
		String name2NewReference = new String("Emmet");
		String name3 = "Emmet";
		
		System.out.println("Ex 1: " +  (name1 == name2NewReference) ); 	 			// False
		System.out.println("Ex 2: " +  name1.equals(name2NewReference) ); 			// True
		System.out.println("Ex 3: " +  (name1 == name3) ); 							// True
		System.out.println("Ex 4: " +  (name1 == "Emmet") ); 						// True
		System.out.println("Ex 5: " +  (name1 == "Emm" + "et") ); 					// True
		System.out.println("Concat:" + (name1 == "Emm".concat("et")) ); 			// False, concat devuelve un nuevo String.
		System.out.println("Intern:" + (name1 == name2NewReference.intern()) ); 	// True
		
		//El método intern revisar si el String (La cadena) existe en el String Pool
		//Si la cadena existe, regresa la referencia de dicha cadena dentro del String Pool.
		//Si la cadena no existe, la misma es agregada al String Pool y se devuelve la referencia de dicha cadena creada.
		
		//Ejemplo 2 - Método intern() fuera del scope del exámen.
		String pl = new String("A");
		System.out.println("A" == pl);		//False
		String pl2 = pl.intern();			
		System.out.println("A" == pl);		//False
		System.out.println("A" == pl2);		//True
		System.out.println(pl == pl2);		//False
		
		//Ejemplo 3
		String[] strs = { "E", "m", "m", "e", "t"};
		String name4 = "";
		String name4a = null;

		for (String str : strs) {
			name4 += str;
			name4a += str;
		}

		System.out.println(name1 == name4); 					 // False
		System.out.println(name4 + " " + name1.equals(name4)); 	 // True
		System.out.println(name4a + " " + name1.equals(name4a)); // False name4a -> nullEmmet

		//Ejemplo 4
		String name5 = "Emmet";
		System.out.println(name1 == name5); 		// True
		System.out.println(name1.equals(name5)); 	// True
	}
}
