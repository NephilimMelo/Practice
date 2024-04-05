package practice;

import java.util.ArrayList;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] d = {1,2,3,4,5,6,7,8};
		
		for(int i = d.length -1; i>=0; i --) {
			System.out.println(d[i]);
		}
		
		System.out.println("*******************************");
		
		ArrayList<Integer> p = new ArrayList<Integer>();
		p.add(1);
		p.add(2);
		p.add(3);
		p.add(4);
		p.add(5);
		p.add(6);
		p.add(7);
		for(int i = p.size()-1; i>=0; i--) {
			System.out.println(p.get(i));
		}
		
				
		
		

	}

}
