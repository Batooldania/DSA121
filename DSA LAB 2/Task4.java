public class Task4{
	double average=0;
 public double average(double [] arr){
	 
  for(int i =0 ;i < arr.length; i++)
	 
  {
   average=(average+arr[i])/arr.length;
  }
  return average;
 
 
 }
 
 public static void main(String args[])
 {
 Task4 t1=new Task4();
 double[] arr={2,2.4,3.4,5.5};
  System.out.print(t1.average(arr));
 
 }
 
}