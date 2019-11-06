public class RemoveDuplicate{

 
 public static void main(String args[]){
 
 RemoveDuplicate rd=new RemoveDuplicate();
 int [] arr={20,20,30,40,50,50};
 int [] arr1=new int[arr.length];
 
 for(int i =0 ; i<arr.length; i++)
{
if(arr[i]==arr[i+1])
{
 arr1[i]=arr[i];
}
 }
 
  for(int i=0;i<arr1.length;i++){
	  
	  System.out.print(arr1[i]);
	  
  }
}
}