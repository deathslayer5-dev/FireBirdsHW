import java.util.Map;
import java.util.Scanner;
public class FruitStand{
    public static void main(String[] args){
        Map<String,Float> fruits = Map.of("Apple",2.0f,"Banana",1.25f,"Orange",1.5f,"Cherry",3.0f,"Lemon",0.25f);
        Map<String,Float> beverage = Map.of("Coke",1f,"Orange Juice",0.5f,"Beer",2f);
        System.out.println("What would you like, fruits or beverages? f/b");
        Scanner scan = new Scanner(System.in);
        char input = scan.next().charAt(0);
        while(input != 'f' && input != 'b'){
            System.out.println("Invalid Input, try again.");
            input = scan.next().charAt(0);
        }
        switch (input){
            case 'f':
                for(Map.Entry<String,Float> entry : fruits.entrySet()){
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
                System.out.println("What would you like out of these options");
                String inputf = scan.nextLine();
                while(!fruits.containsKey(inputf)){
                    System.out.println("Invalid input, try again.");
                    inputf = scan.nextLine();
                }
                System.out.printf("That would be %f.2 dollars%n", fruits.get(inputf));
                break;
            case 'b':
               for(Map.Entry<String,Float> entry : beverage.entrySet()){
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
                System.out.println("What would you like out of these options");
                String inputb = scan.nextLine();
                while(!beverage.containsKey(inputb)){
                    System.out.println("Invalid input, try again.");
                    inputb = scan.nextLine();
                }
                System.out.printf("That would be %f.2 dollars%n", beverage.get(inputb));
                break;
        }
    }
}
