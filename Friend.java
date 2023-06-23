/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friendsandfamily;

/**
 *
 * @author Alec
 */
public class Friend {
    private static String name;
    public static int timeKnown; //assign to timeKnown method
    //pass tk
    
  //  public Friend() {
    //    name = "N/A";//set the initial value for class attribute
      //  timeKnown = 0;
    //}
    
public Friend(String n, int tk){
    //name = n.charAt(0).toUpperCase() + n.slice(1) + ;
    name = n;
    timeKnown = tk;
}
public int validateTimeKown (int tk){
  //inverted if statement in order to ensure time known is greater than 0
   tk = 0;
  if (timeKnown >= 0)timeKnown = tk; else {
      timeKnown = 0;
}
return tk;
}
@Override
public String toString()
{
    return "You have known " + name + " for " + timeKnown + " years.";
}
}