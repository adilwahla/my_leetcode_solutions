package OOP.OOP_Lect_03;

public class Main {
     public static void main(String[] args) {
        // Box obj=new Box(5.7,4.9,3.8);
        // Box obj1=new Box(obj);
       // System.out.println(obj.weight);// parent class can't acess child properties
        // System.out.println("Height="+obj1.h+" Length="+obj1.l+" Width="+obj1.w+" ");
    //    BoxWeight obj2=new BoxWeight(1.1,1.2,1.3,1.4);
    //    System.out.println(obj2.h+" "+obj2.weight);

    /*
     * 
A Superclass Variable Can Reference a Subclass Object:
It is important to understand that it is the type of the reference variable—not the type of the object that it refers
to—that determines what members can be accessed.
When a reference to a subclass object is assigned to a superclass reference variable, you will have access only to
those parts of the object defined by the superclass.

plainbox      =  weightbox;
(superclass)     (subclass)

SUPERCLASS ref = new SUBCLASS();    // HERE ref can only access methods which are available in SUPERCLASS
     */
   // Box box4=new BoxWeight(3, 4, 5, 11);
    //System.out.println(box4.weight);// weight can't be accessed error can't use weight bcz it is the refrence class variable that determinea which propertieas can be accessed
    
    
    /*
     *CHILD REFRENCING TO PARENT object IS NOT ALLOWED? 
     Reason: super class doesnt know about below classes & inorder to access the 
     variables they must be initialized first thats why java doesn't allows
     */
//BoxWeight box5= new Box(0, 0, 0)
BoxWeight obj=new BoxWeight(1,2,3,4);
//System.out.println(obj.weight);
}
}
