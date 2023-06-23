/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friendsandfamily;

/**
 *
 * @author Julia Crawford
 */
public class Family {
    private static String name;//is instance static or no? WE HAVE CREATED CLASS ATTRIBUTE
    private static String relation;

//no default constructor ?? BUT for the purpose of the demo... We set a default to test
    //Overloaded constructor (If the user creates an object wiht these values
    //WE give the family member these values
public Family(String n, String r) {
 
 name = n;
 relation = r;
 
} 
@Override

//toString method returning neatly formatted string
public String toString(){
    //String name2;
  //name2 = name.charAt(0).toUpperCase() + name.slice(1);
  //console.log(name);
  
  relation = relation.toLowerCase();
  return name + " is part of your family, the relationship is " + relation + ".";
 
}
}
