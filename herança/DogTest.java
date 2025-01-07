package herança;

class Animal{
    public void eat () {
        System.out.println("The animal eats.");
    }
}

class Dog extends Animal {
    public void bark (){ 
        System.out.println("The dog barks.");
    }
}

public class DogTest{
    public static void main(String[] args){

        Dog pinscher = new Dog();

        pinscher.eat();

        pinscher.bark();

    }
}