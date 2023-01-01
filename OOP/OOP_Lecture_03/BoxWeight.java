package OOP.OOP_Lect_03;

public class BoxWeight extends Box {
    double weight;
    BoxWeight(){
        this.weight=-1.0;
    }

    public BoxWeight(double l, double h, double w, double weight) {
   //     super(l, h, w);// what is this? it says call the parent class constructor
        // used to initialize parent class constructor
        System.out.println(super.weight);
        this.weight = weight;
    }

    
}
