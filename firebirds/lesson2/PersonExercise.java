package lesson2;
import java.util.Random;
public class PersonExercise{
    public static void relation(person person1, person person2){
        String[] relations = {"friends", "colleagues", "enemies", "siblings"};
        Random rand = new Random();
        System.out.printf("The relationship between %s and %s are %s.", person1.name,person2.name,relations[rand.nextInt(relations.length)]);
    }
    public static void main(String[] args){
        person david = new person("David", 21, 40000f);
        david.Intro();
        person mane = new person("Mane", 31, 23000f);
        System.out.println(mane.getNetworth(25000));
        person Dan = new person("Dan",45, 890000f);
        Dan.wrongMultipli(200d,300d);
        person Bob = new person("Bob",18,299900f);
        Bob.jumpToYear(2030);
        person Jayden = new person("Jayden", 21, 9000f);
        Jayden.Intro();
    }
}
        
