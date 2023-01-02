package OOP.OOP_Lec2;

public class Main {
public static void main(String[] args) {
    Singleton obj=Singleton.getInstance();
    Singleton obj1=Singleton.getInstance();
    Singleton obj2=Singleton.getInstance();

    // all 3 variables are just refrencing to 1 single object on memory
}
}
