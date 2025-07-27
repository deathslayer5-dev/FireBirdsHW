package lesson3;
public class student extends person{
    public int grades;
    public student(String name, int age, float netIncome, int grades){
        super(name,age,netIncome);
        this.grades = grades;
    }
    @Override
    public void Intro(){
        System.out.printf("My name is %s, I am %d, I only have a %d.%n",name,age,grades);
    }
    public void disappointment(){
        System.out.printf("Aww man, I only got a %d on my test, gosh dang it!%n",grades);
    }
}
