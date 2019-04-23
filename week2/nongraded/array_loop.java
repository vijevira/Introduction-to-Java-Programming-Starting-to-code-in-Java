/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int[] array = new int[] {11, 22, 33, 44, 44};
double average = 0;
double sum = 0;
int count = 0;
for (int element : array){
    if (element % 2 != 0) {
        count++;
        sum += element;
    }
}
if (count > 0){
    average = sum / count;
}
System.out.println(average);
	}
}
