/*
 * Project: Marbles.java
 * Description: A String array containing the names of marble colors
 * Name: Aaron Snowberger
 * Date: Oct 13, 2015
 */

public class Marbles {
  
  public static void main( String[] args ) {
    
    // 1. Create a String array to hold the names of marble colors
    // 2. Assign "names" to the String array indecies 
    // 3. Print the String array names
    String[] colors = { "neon green", "red hot", "red", "orange", "puke green" };
    for( int i = 0; i < colors.length; i++) {
      System.out.println( colors[i] );
    }
    
  } // END main()
  
} // END class Marbles