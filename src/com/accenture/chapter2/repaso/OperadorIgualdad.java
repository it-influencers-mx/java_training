package com.accenture.chapter2.repaso;

public class OperadorIgualdad {

	public static void main(String[] args) {

		int x = 1;
		double y = 1.0;
		char w = 'a';
		String string = "string";
		int o1 = 1;
		boolean x1 = true;
		boolean y1 = false;

		if (x == y) { }
		if (w != y) { }

		boolean w1 = o1 > 2 && x1;
		if (x1 == y1) { }
		if (w1 != false) { }
		if (string == null) { }
		if (string == w) { }

		/////////////////////
		Object o2 = new Object();
		Integer x2 = new Integer(1);
		Integer y2 = new Integer(1);
		String s2 = "";

		if (o2 == x2) { }
		if (x2 == y2) { }
		System.out.println(x2 == y2);

		if (s2 == x2) { }
		if (s2 == o2) { }

		boolean x3 = true == 3;
		boolean y3 = false != "";
		boolean w4 = 3 == "";

		boolean p4 = false;
		boolean x4 = (p4 = true);

		int w4 = 1;
		if(w4 = 1) {}

		boolean test = null == null;
	}

}
