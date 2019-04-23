/**
 * Do not change the method or class
 * declarations.
 */
 
public class Main {

	public static void main(String[] args) {
	
	    int nOne = 2;
	    int nTwo = 3;
	    int result = 1;
	    int limit = 1000;
	    
	    while(result < limit){
	        System.out.println(result);
	        result = nOne * nTwo;
	        nOne++;
	        nTwo = nTwo *2;
	    }
	
	}
}
