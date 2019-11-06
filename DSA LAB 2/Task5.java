import java.util.Arrays;
import java.util.Scanner;
public class Task5{
 

Scanner input=new Scanner(System.in);

public int secondLarge(int [] arr){
    int max=arr[2];
	int secondmax=arr[2];
  for(int i=0;i<arr.length; i++){
	  
    if(max<arr[i])
	{
	secondmax = max;
	max = arr[i];
	}
	else if(arr[i]> secondmax){
		secondmax=arr[i];
	}
  }
  return secondmax;
}
public static void main(String args[])
{
	int [] arr={2,3,4,5,1,7,12,18,17};
	Task5 t5=new Task5();
	System.out.print(t5.secondLarge(arr));
  
 
  
  


}
}