package dev.lpa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal("wolf","big",300);
        Dog dog = new Dog("wolf","big",100);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals= new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepherd","big",150));
        animals.add(new Fish("Goldfish","small",1));
        animals.add(new Fish("Barracuda","big",75));
        animals.add(new Dog("Plug","small",20));

        for(Animal animal:animals) {
            doAnimalStuff(animal);
        }
    }

    public static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");
    }
}
