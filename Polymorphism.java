class Animal{
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}
    class Pig extends Animal{
        public void animalSound(){
            System.out.println("This animal says : \"Wee Wee\"");
        }
    }
    class Dog extends Animal{
         public void animalSound(){
            System.out.println("This animal says : \"bow bow\"");
    }    
    }

    public class Polymorphism{
        public static void main(String[] args){
            Animal myAnimal = new Animal();
            Pig myPig = new Pig();
            Dog myDog = new Dog();

            myAnimal.animalSound();
            myPig.animalSound();
            myDog.animalSound();
            
        }
    }

