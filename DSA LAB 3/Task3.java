import java.util.Arrays;
public class Task3{

public static void main(String args[])
  { 
 char [] arr={'D','A','N','I','A'};
 Arrays.sort(arr);
 char target='M';
 int upperbound=arr.length;
 int lowerbound=1; 
   Task3 t3=new Task3();
  System.out.print( t3.binarySearch(arr,target,upperbound,lowerbound));
   }
public int binarySearch(char [] arr ,char target, int upperbound,int lowerbound){

while(lowerbound <=upperbound)
{
if(upperbound<lowerbound)
{
   break;
}
int midpoint= lowerbound +(lowerbound+upperbound)/2;
if(arr[midpoint]<upperbound)
{
   midpoint=lowerbound-1;

   }
   if(arr[midpoint]>lowerbound)
   {
   midpoint=lowerbound+1;
   
   }
   if(arr[midpoint]==target)
   {
   return midpoint;
   }
 
}
  return -1;

}



}