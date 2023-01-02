package OOP.OOP_Lec2;
 class A {
    String name;

    /**
     * @param name
     */
    public A(String name) {
        this.name = name;
    }
    
    }
public  class InnerClasses {// only public, abstract,final are allowed
// OUTSIDE CLASSES CAN NOT BE STATIC IT DOESN'T DEPEND ON ANY OTHER CLASS
/*
 * 
 * Static variables can be changed ( mutable) but they are stored as only one copy.
 *  Any change to them made will be reflected to the all methods using it.
 */

 
public static void main(String[] args) {
    A a=new A("Adil");// if inner class is not static it gives error bcz it depends on outer class
    A b=new A("Kunal");
   System.out.println(a.name);
   System.out.println(b.name);
}

}
