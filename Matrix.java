/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Matrix
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		char[][] a= new char[m][n];
		String[] s;
		
		for(int i=0; i<m; i++){
		    s = br.readLine().split(" ");
		    //System.out.println(s);
		    String ness="";
	        for (String k:s) {
	            ness=ness+k;
	        }
	        //System.out.println(ness);
	        char[] cness = ness.toCharArray();
	        
		    for (int j=0; j<n; j++) {
		        
                
                a[i][j] = cness[j];
		    }
		    
		}
		
		//display a
		
		
		for (int i=0; i<m; i++ ) {
		    
		    for (int j=0; j<n; j++) {
		        System.out.print(a[i][j]);   
		    }
		    System.out.println();
		}
		
		
		String pat = br.readLine();
	    System.out.println("pattern "+pat);
		
	}
}
