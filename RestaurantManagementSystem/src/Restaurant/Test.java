package Restaurant;

import java.util.Scanner;

public class Test {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to use restaurant management system!");
		System.out.println();
		Restaurant r = new Restaurant();
		r.print();
		System.out.println();
		
		
		while(true) {
			System.out.println("Please enter \"Reserve\" or \"Cancel\": ");
			String reserve = s.next(); //receive users demand
			if("reserve".equals(reserve.toLowerCase())) {
				System.out.println("Please enter the table number: ");
				String id = s.next();
				r.check(id);
				r.reserve(id);
				r.print(); 				
				System.out.println();	
				System.out.println("\"Continue\" or \"Exit\" ?");
				String c =s.next();
				if("exit".equals(c.toLowerCase())){
				System.out.println("Thanks for your visit!");
				break;
				}
			} else if("cancel".equals(reserve.toLowerCase())) {
				System.out.println("Please enter the table number: ");
				String id = s.next();
				r.check(id);
				r.cancel(id);
				r.print(); 
				System.out.println();
				System.out.println("\"Continue\" or \"Exit\" ?");
				String c =s.next();
				if("exit".equals(c.toLowerCase())){
				System.out.println("Thanks for your visit!");
				break;
				}
			}else {				
				System.out.println("Please enter the valid coice! ");
			}
		}
	}
}
