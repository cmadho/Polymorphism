package com.training.apps;

import com.training.domains.NewShowRoom;
//import com.training.domains.ShowRoom;
import com.training.ifaces.Automobile;
import java.util.*;
public class Application {
	
	
	public static void main(String[] args) {
		
		NewShowRoom showRoom = new NewShowRoom();
		Automobile polyAuto = null;
 		Scanner sc = new Scanner(System.in);
 		
		System.out.println("Enter the value of the key :");
		int key = sc.nextInt();
		
		polyAuto = showRoom.getItem(key);
		
		showRoom.printQuote(polyAuto);
		
		
		sc.close();
		
		
		
		
		
		
		
		
	}

}
