package OOP.OOP_Lect_03.Polymorphism.Override;

public class ObjectPrint {// by default extends object class
//even it has not been mentioned[ObjectPrint extends object{}]  
int num;

public ObjectPrint(int num) {
    this.num = num;
}



    /* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
// every calss extends obj class so obj class is super class it has toString()
@Override  // this method will override the super class OBJECT class method to string 
public String toString() {
    return "ObjectPrint [num=" + num + "]"; // pretty //printing 
}



    public static void main(String[] args) {
        ObjectPrint obj=new ObjectPrint(5);
        System.out.println(obj);
     }

}
