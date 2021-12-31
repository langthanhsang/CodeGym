package th;

public class AnimalFectory {
    public Animal getAnimal(String type){
        if("canine".equals(type)){
            return new Dog();
        }else{
            return  new Cat();
        }
    }
}
