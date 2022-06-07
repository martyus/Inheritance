import java.util.ArrayList;
import java.util.List;

public class PetApplication {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Agnes", "grey", 3);
        Dog dog1 = new Dog("Betty", 65, 7, "black", "rubber duck");
        GoldFish gf1 = new GoldFish("Goldie");

//        System.out.println(cat1.introduction());
//        System.out.println(dog1.introduction());
//        System.out.println(gf1.introduction());
//
//        System.out.println(gf1.makeNoise());
//        System.out.println(dog1.makeNoise());
//        System.out.println(cat1.makeNoise());
//
//
//        System.out.println(cat1);

        Pet pet = cat1;

        //will fail
        //Dog newDog = (Dog) pet;

        // too generic
        // Pet pet1 = new Pet("Martina", "white");

        // declare type vs. run-time type
        //pet.purr();
        //introduce(pet);

//        introduce(cat1);
//        introduce(gf1);
//
//
//        makeNoisePet(cat1);
//        makeNoisePet(gf1);
//        makeNoisePet(dog1);
//
//        makeNoisePet(pet);

//        Pet[] pets = {dog1, cat1, gf1};
//        for(int i=0; i< pets.length; i++){
//            System.out.println(pets[i]);
//        }
    }

    public static void introduce(Pet p){
        System.out.println(p.introduction());
    }

    public static void makeNoisePet(Pet p){
        System.out.println(p.makeNoise());
    }

}
