import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class PalindromeChecker extends PApplet {

public void setup()
{
  String lines[] = loadStrings("palindromes.txt");
  println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      println(lines[i] + " IS a palindrome.");
    }
    else
    {
      println(lines[i] + " is NOT a palindrome.");
    }
  }
}

public boolean palindrome(String word)
{
  //your code here
  String nString = new String();
  nString = convert(reverse(word));
  if (nString.equals(convert(word))) 
    return true;
  else 
    return false;
}
public String reverse(String str)
{
    String sNew = new String();
    //your code here
    for (int i = str.length() - 1; i > - 1; i--)
      sNew += str.substring(i, i + 1);
    return sNew;
}

public String convert(String str) {
  String sNew = new String();
  for(int i = 0; i < str.length(); i++)
    if(Character.isLetter(str.charAt(i)) == true)
      sNew += str.charAt(i);
  return sNew.toLowerCase();
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "PalindromeChecker" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
