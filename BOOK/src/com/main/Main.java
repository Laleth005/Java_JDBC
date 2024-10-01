package com.main;

import com.lalethbook.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inv = new Inventory();
        //inv.show();
    

        bookshop b= new bookshop();
        Login l = new Login();
        User u = new User();
       int op1;
      
        do {
            System.out.println("Enter an option (-1 to exit):");
            op1 = sc.nextInt();  // Prompt for the option before the switch

            switch (op1) {
                case 1:
                    System.out.println("Enter book details:");
                   
                    b.setName(sc.next());
                    b.setShop_name(sc.next());
                    b.setBook_name(sc.next());
                    b.setAuthor(sc.next());
                    b.setPrice(sc.nextInt());
                    inv.add(b);  
                    break;

                case 2:
                	System.out.println("Enter id to be updated:");
                	String idup=sc.next();
                	b.setCust_id(idup);
                	System.out.println("Enter Name: ");

					String name=sc.next()+sc.nextLine();

					b.setName(name);
					inv.update(b);
                    break;

                case 4:
                    System.out.println("Enter id to be deleted:");
                    String it = sc.next();
                    inv.remove(it);  
                    break;

                case 5:
                    inv.show(); 
                    break;

                case -1:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid menu option.");
                    break;
            }
        } while (op1 != -1); 

    
}
}