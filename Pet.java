public class Pet {
    protected String name;
    protected double height;
    protected double weight;
    protected String colour;

    public Pet(String name, String colour){
        this.name = name;
        this.colour = colour;
    }

    public String introduction(){
        return "My name is " + name;
    }

    public String makeNoise(){
        return "";
    }
}
