public class Dog extends Pet{

    private String faveToy;

    public Dog(String name, double height, double weight, String colour, String faveToy) {
        super(name, colour);
        this.height = height;
        this.weight = weight;
        this.faveToy = faveToy;
    }

    //overriding
    public String makeNoise(){
        return "woof woof ";
    }

    public String introduction(){
        return "Woof " + super.introduction();
    }
}
