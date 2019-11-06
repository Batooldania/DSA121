import java.util.Arrays;
import java.util.Scanner;
public class SortingMatrix{
 public static void main(String args[]){
  int [][] arr={{3,5,1},{7,8,3}};
  int n=arr.length;
  for(int i =0; i<n; i++){
	  	  
	  for(int j =0 ;j<arr[i].length ; j++)
	  {
		 for(int k=0 ; k<arr[i].length-j-1;k++)
		 {if(arr[i][k]>arr[i][k+1])
		  {
			  int temp = arr[i][k];
			  arr[i][k] = arr[i][k+1];
			  arr[i][k+1]=temp;
			  
		  }
		  
		 } 
		 
	  }
	  
  }
  for(int i =0; i<n; i++){
	  
	  for(int j=0; j<arr[i].length; j++)
	  {

		  System.out.print(arr[i][j]+" ");
		  
	  }
	  System.out.println();
  }
 }
}