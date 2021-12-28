package abstractClassAndInterface.animal;

import abstractClassAndInterface.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken : cluck - cluck";
    }

    @Override
    public String howToEat() {
        return "cound be fried";
    }
}