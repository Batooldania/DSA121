import java.util.Arrays;
public class Task3{
   public static void main(String args[]){
   //Declaring arrays of float datatypes
   float[] arr1=new float[30];
   float[] arr2=new float[40];
   
   //Giving values to arrays
   for(int i=0;i<arr1.length ; i++){
   arr1[i]=i;
   }
   
   for(int j=0; j<arr2.length; j++){
   arr2[j]=j;   
   }
   
   //Printing Arrays
 System.out.print("Printing both arrays");
for(int i =0 ;i<arr1.length; i++){
	System.out.print(arr1[i]+" ");
}
System.out.println("Printing next arrays");
for(int j=0; j<arr2.length ; j++){
	System.out.print(arr2[j]+" ");
	
}

System.out.println("Printing second array");

System.out.print(Arrays.equals(arr1,arr2));
 }
}