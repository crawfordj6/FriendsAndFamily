/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friendsandfamily;

//import java.io.BufferedReader;
import java.util.Scanner;

/**
 *
 * @author Julia Crawford
 */
public class FriendsAndFamily {
    //Declares all varibles used within the program
    public static int time;
    public static String input;
    public static String name;
    public static String relation;
    public static Scanner sc = new Scanner(System.in);
    public static int t;
    public static int size;
    public static final String RED = "\u001B[31m";
 
    

    public static void main(String[] args) {
        //Declare array and objects
        Object[] friendsAndFamily;
        Friend fri;
        Family fam;
        getSize(sc);
        //specifies the number of elements to allocate
        friendsAndFamily = new Object[size];
        //for loop runs for the number of friends and family entered
        for (int i = 0; i < friendsAndFamily.length; i++) {  
        //Will prompt usere for input and collect data using method    
        t = (friendOrFamily(sc));
        switch (t) {
            case 0:
                fri = new Friend(getName(sc,t),getTimeKnown(sc,name));
                friendsAndFamily[i] = (fri.toString());
                break;
            case 1:
                //Assign fam to new Family object
                fam = new Family(getName(sc,t), getRelation(sc, name));
                //friendsAndFamily[i] = new String(fam.toString());
                friendsAndFamily[i] = (fam.toString());
          
                break;
            default:
                System.exit(0);
                // break;
                //we may want to use enhanced for loop to automate naming
        }
       

        }
         //outside of loop, call display method to pass the object array
         display(friendsAndFamily);
    }
    

    public static int getSize(Scanner sc) {
        System.out.print("(Warning: When prompted for choice of 'friend' or 'family',"
                + "\nanything other than friend or family will end the program)\n");
        //create int size based off of user input
        //validation loop that repeats until size > 0
        System.out.println("");
        do {
          System.out.print("How many friends and family do you wish to enter? --> ");
          size = sc.nextInt();
        }while(size <= 0);
        return size;
    }

// create object array sized based off of user input
//return object[];    
    public static int friendOrFamily(Scanner sc) {
       
        //Prompts user to enter family or friend
        System.out.print("\nIs this a friend or family member? --> ");
        sc = new Scanner(System.in);
        //String input = sc.next();
        input = sc.next();
        int type;
        //the following could comment outi
        //should we use a case or if?
        switch(input.toLowerCase()){
         //(input.equalsIgnoreCase
         case "friend":
            type = 0;
            break;
            //return type;
         case "family":
               // (input.equalsIgnoreCase("family"));
            input = "family member";
            type = 1;
            break;
            //return type;
            //else
            
            default:
            System.out.println(RED + "Invalid input. Program ending.");   
            type = 2;
            break;
            //return type;
        }  //return type;//break;
        return type;
    }
    ///class constructor for FRiendsAndFamily?

    public static String getName(Scanner sc, int t) {
     
       switch(t){
         //(input.equalsIgnoreCase
         case 0:
             input = "friend";
             //System.out.print("Enter the name of this friend --> ");
            break;
         case 1:
            input = "family member";
           //System.out.print("Enter the name of this family member --> ");
            break;
            //return type;
            //else
            
            default:
            
            System.exit(0);
            break;
       }
        System.out.print("Enter the name of this " + input + " --> ");
        sc = new Scanner(System.in);
        name = sc.next();
        name =  name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        return name;
    }

    public static String getRelation(Scanner sc, String n) {
        name = n;
        System.out.print("Enter your relation to " + name + " --> ");
        sc = new Scanner(System.in);
        //String relation;
        relation = sc.next();
      //  relation =  relation.toLowerCase();
        return relation;
    }

    public static int getTimeKnown(Scanner sc, String n) {
        System.out.print("How long have you known " + n + "? --> ");
        sc = new Scanner(System.in);
        time = sc.nextInt();
        //perhaps... use validate time known method here
        return time;
    }
    public static void display(Object[] friendsAndFamily) {
        System.out.println("");
        for (int i = 0; i < friendsAndFamily.length; i++) {
            if(i == 0){
                System.out.print(friendsAndFamily[i]);
            }
            else if (i == friendsAndFamily.length) {
                System.out.print(friendsAndFamily[i]);
            }
            else
                System.out.println("\n" + friendsAndFamily[i]);
        }
        System.out.println("\n");
    }
}

