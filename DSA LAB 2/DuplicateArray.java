import java.util.Arrays;
class DuplicateArray{
 public static void main(String args[]){
   int [] arr={20, 20, 30, 40, 20};
   Arrays.sort(arr);
  
   int [] arr1=new  int[arr.length];
   for(int i=0 ; i<arr.length ; i++)
   {
       if(i==arr.length-1){
		   System.out.print(arr[i]);
		   break;
	   }
    if(arr[i]!= arr[i+1])
	{
		
		System.out.print(arr[i]);
	}
	

       }   
   
 
 }
}