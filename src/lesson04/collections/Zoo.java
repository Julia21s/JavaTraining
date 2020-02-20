package lesson04.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Zoo {
    ArrayList<String>  pets = new ArrayList<String>();
    String zooName;

    public static void main(String[] args) {

        String[] wildAnimals = {"Wolf", "Fox", "Monkey"};
        Zoo privateZoo = new Zoo("Thailand zoo", wildAnimals);
        Zoo anotherZoo = new Zoo("London zoo", null);
        privateZoo.addNewAnimal("Hamster");
        privateZoo.addNewAnimal("Fox");
        privateZoo.addNewAnimal("Fish");
        privateZoo.addNewAnimal("Wolf");
        privateZoo.addNewAnimal("Wolf");
        privateZoo.addNewAnimal("Deer");
        privateZoo.addNewAnimal("Bear");
        System.out.println("Before moving animals: " + privateZoo.toString());
        // moving Wolf to another Zoo
        privateZoo.moveAnimalToAnotherZoo(1,anotherZoo);
        privateZoo.moveAnimalToAnotherZoo(2,anotherZoo);

        System.out.println("Before sorting: " + privateZoo.toString());
        System.out.println("Now with Iterator: ");
        Iterator iterator = privateZoo.pets.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
       // Now let's sort animals
        privateZoo.sortAnimals();
        System.out.println("After sorting: "+ privateZoo.toString());
        iterator = privateZoo.pets.iterator();
        System.out.println("After sorting with Iterator : ");
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }

    public Zoo(String zooName, String[] pets) {
        this.zooName = zooName;
        try {
            for (String animalName : pets) {
                this.pets.add(animalName);
                System.out.printf("A new pet %s has been added in constructor to %s%n", animalName, zooName);
            }
        }
        catch(NullPointerException e){
            System.out.println("No animals in the zoo " + this.zooName);
        }
    }

    void addNewAnimal(String animalName){
        pets.add(animalName);
        System.out.printf("A pet %s has been added to %s%n", animalName, this.zooName);
    }

    void moveAnimalToAnotherZoo(int i, Zoo newZoo){
        String animalName = pets.get(i);
        pets.remove(i);
        System.out.printf("A pet %s has been moved away from %s%n", animalName, this.zooName);
        newZoo.addNewAnimal(animalName);

        if (this.pets.contains(animalName)){
            System.out.printf("There still is animal %s in the zoo%n", animalName, zooName);
            } else {
            System.out.printf("No more %s animals left%n", animalName);
        }

    }

    void  sortAnimals(){
        Collections.sort(this.pets);
    }

    @Override
    public String toString() {
        return "Zoo{" + "zooName='" + zooName +
                ", pets=" + pets + '\'' +
                '}';
    }


}
