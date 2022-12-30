
package OOP.OOP_Lec2;

public class Static_initialization {
    //this is demo to show  inirialization of static variables 
static int a =4;
static int b;
int c=3;
/*
 * STATIC BLOCK RUNS ONLY ONCE WHEN FIRST OBJECT IS CREATED OR FIRST TIME CLASS GETS LOADED
 * 
 */
//this is statioc block
static {
    System.out.println("I am in static block");
    b=a*5;
    
}



    public static void main(String[] args) {
        Static_initialization obj=new Static_initialization();
        System.out.println(Static_initialization.a+" "+Static_initialization.b +" "+obj.c);
        Static_initialization obj2=new Static_initialization();
        Static_initialization.b +=2;
        System.out.println(Static_initialization.a+" "+Static_initialization.b);
        
    }
}
