package th;

public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFectory animalFectory = new AnimalFectory();

        Animal a1 = animalFectory.getAnimal("feline");
        System.out.println("a1 sound: " + a1.makeSound());
        Animal a2 = animalFectory.getAnimal("canine");
        System.out.println("a2 sound : " + a2.makeSound());
    }
}
