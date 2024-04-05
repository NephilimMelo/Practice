package practice;

import java.util.ArrayList;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] d = {"Parhat", "Dilara", "Love"};
		for(int i = d.length-1; i>=0; i--) {
			System.out.println(d[i]);
		}
		System.out.println("************************************************************************");
		
		ArrayList<String> p = new ArrayList<String>();
		p.add("Parhat");
		p.add("Dilara");
		p.add("Love");
		for(int i = p.size()-1; i>=0; i --) {
			System.out.println(p.get(i));
		}

	}

}
