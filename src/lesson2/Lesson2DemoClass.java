package lesson2;

public class Lesson2DemoClass {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.age = 2;
        myDog.breed = "Chihuahua";
        myDog.color = "Dark";
        myDog.name = "Nora";

        Dog dog2 = new Dog();
        dog2.age = 4;

        Cat myCat = new Cat();

        myDog.VoiceDog("Gav!");
        myCat.voiceCat();
    }
}
