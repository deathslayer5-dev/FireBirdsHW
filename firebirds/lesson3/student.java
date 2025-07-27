package lesson3;
public class student extends person{
    private int grades;
    public student(String name, int age, float netIncome, int grades){
        super(name,age,netIncome);
        this.grades = grades;
    }
    @Override
    public void Intro(){
        System.out.printf("My name is %s, I am %d, I only have a %c.%n",name,age,grades);
    }
    public void disappointment(){
        System.out.println("Aww man, I only got a " + grades +"% on my test, gosh dang it!");
    }
}
