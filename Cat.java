public class Cat extends Pet {

    private int degreeOfFluffiness;

    public Cat(String name, String colour, int dof) {
       super(name, colour);
       this.degreeOfFluffiness = dof;
    }

    public String makeNoise(){
        return "meow meow";
    }

    public String introduction(){
        return "Meow " + super.introduction();
    }

    public String toString(){
        return "I'm a cat, my name is " + name;
    }

    public void purr(){
        System.out.println("purr purr");
    }
}
