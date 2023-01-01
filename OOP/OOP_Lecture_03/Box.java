package OOP.OOP_Lect_03;
/*
 * INHERITANCE 
 */
public class Box {
private  double l;  // private member ? only accessbile in this class
  double h;
  double w;
  double weight=99;
  
  Box(){
    this.l=-1;
    this.h=-1;
    this.w=-1;

  }
  //cube
  Box(double side){
    super();// refers to obj class 
    this.l=side;
    this.h=side;
    this.w=side;
  }

 Box(double l, double h, double w) {
    this.l = l;
    this.h = h;
    this.w = w;
}
Box(Box old){
    this.h=old.h;
    this.l=old.l;
    this.w=old.w+2;
}
void information(){
    System.out.println("Box is running...!");
}
  
}
