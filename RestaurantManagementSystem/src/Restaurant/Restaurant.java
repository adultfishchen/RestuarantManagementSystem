package Restaurant;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Restaurant {

	
	Reservation [] [] reserve;
	
	//initialize table number and type
	public Restaurant()
	{
		reserve = new Reservation[5][10];
		//1,2 walkside (101,102...110) ; 3,4 beside windows ; 5 private room
		for(int  i =0 ; i<reserve.length ; i++) {
			for(int j = 0 ; j<reserve[i].length ; j++) {
				if(i == 0 || i==1) {
					reserve[i][j] = new Reservation((i+1)*100+j+1+"","Walkside",false);
				}
				if(i == 2 || i==3) {
					reserve[i][j] = new Reservation((i+1)*100+j+1+"","Windowside",false);
				}
				if(i == 4) {
					reserve[i][j] = new Reservation((i+1)*100+j+1+"","Private",false);
				}
			}
		}
	}	
	
	//view table situation
		public void print() {
			for(int  i =0 ; i<reserve.length ; i++) {
				for(int j = 0 ; j<reserve[i].length ; j++) {
					System.out.print(reserve[i][j] + " ");
				}
				System.out.println();
			}
		}
		
	//reserve a table	
	public void reserve(String id) {
		for (int i = 0 ; i < reserve.length ; i++) {
			for (int j = 0 ; j < reserve[i].length ; j++) {				
				if(reserve[i][j].getId().equals(id) && reserve[i][j].isUse() == false) {
					//show the table is unavailable
					reserve[i][j].setUse(true);
					System.out.println("Successfully reserve " + id + "!" );
					System.out.println();
					break;
				} 
				if (reserve[i][j].getId().equals(id) && reserve[i][j].isUse() == true){
					System.out.println("Sorry! " + id + " has been occupied!");
					System.out.println();
					break;
				}
			}
	}
}	
	//cancel a reservation
	public void cancel(String id) {
		for (int i = 0 ; i < reserve.length ; i++) {
			for (int j = 0 ; j < reserve[i].length ; j++) {
				if(reserve[i][j].getId().equals(id) && reserve[i][j].isUse() == true) {
					//show the table is available
					reserve[i][j].setUse(false);
					System.out.println("Successfully cancel " + id + "!" );
					System.out.println();
					break;
				} 
				if (reserve[i][j].getId().equals(id) && reserve[i][j].isUse() == false){
					System.out.println("Sorry! " + id + " has not been occupied!");
					System.out.println();
					break;
				} 				
			}
		}
	}
	
	//check input is within the range
	public void check(String id) {
		Pattern pattern = Pattern.compile("^[0-5]+[0-1]+[0-9]");  
		Matcher matcher = pattern.matcher(id);		
				if (!(matcher.find())){
					System.out.println("Please enter a valid table number!");
					System.out.println();
			
		}
	}
}
	
	


