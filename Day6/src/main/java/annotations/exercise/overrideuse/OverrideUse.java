package annotations.exercise.overrideuse;
class Animal{
    // makeSound method
    void makeSound(){
        System.out.println("Makes Sound");
    }
}
class Dog extends Animal{
    // Override makeSound method
    @Override
    void makeSound() {
        System.out.println("Barks");
    }
}

public class OverrideUse {
    public static void main(String[] args) {
        // Object of dog class
        Dog dog = new Dog();
        // Calling makeSound method
        dog.makeSound();
    }
}
