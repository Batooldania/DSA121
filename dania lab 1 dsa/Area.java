public class Area{
float area;
  
 Area(float length,float width){
 area=length*width;
 }
 public float returnArea(){
  return area;
 }
 
}
public class Main{
 public static void main(String args[])
 {
 Area a1=new Area(2,3);
  System.out.print(a1.returnArea);
 }

}


