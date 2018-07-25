package animals;

public class Animals {
    public static void main (String[] args) {
        Animal[] myAnimals = new Animal[5];
        Cat fluffy = new Cat();
        Animal roni = new Dog();
        myAnimals[0] = fluffy;
        myAnimals[1] = roni;
        myAnimals[0].makeNoise();
        myAnimals[1].makeNoise();
        fluffy.doOnlyForCat();
    }
}
