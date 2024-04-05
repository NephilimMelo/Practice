package practice;

import java.util.ArrayList;

public class DoubleOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] p = { 1, 2, 3, 4, 5, 6, 7, 8 };
		for (int i = 0; i < p.length; i++) {
			if (p[i] % 2 == 0) {
				System.out.println(p[i] + " is double");
			} else {
				System.out.println(p[i] + " is odd");
			}

			System.out.println("********************************************************************");

			ArrayList<Integer> d = new ArrayList<Integer>();
			d.add(1);
			d.add(2);
			d.add(3);
			d.add(4);
			d.add(5);
			d.add(6);
			d.add(7);
			d.add(8);
			for (int k = 0; k < d.size(); k++) {
				if (d.get(k) % 2 == 0) {
					System.out.println(d.get(k) + " is double");
				} else {
					System.out.println(d.get(k) + " is odd");
				}

			}

		}

	}

}
