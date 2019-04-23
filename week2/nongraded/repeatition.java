/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   int num = 13 * 7 * 23;
       int a = 1;
       while (a <= num/2) {
          if (num%a == 0) {
              System.out.print(a + " ");
            }
        }
       System.out.println(" ");
	}
}
