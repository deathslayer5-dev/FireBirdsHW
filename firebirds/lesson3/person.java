package lesson3;
public class person{
    public String name;
    public int age;
    public float netIncome;
    public person(String name, int age, float netIncome){
        this.name = name;
        this.age = age;
        this.netIncome = netIncome;
    }
    public void Intro(){
        System.out.printf("I am %s, and I am %d, my netIncome is %f.%n",name,age,netIncome);
    }
    public void wrongMultipli(double a, double b){
        double Wanswer = a*b- 2;
        System.out.printf("I can do multiplication, the answer is %f.%n",Wanswer);
    }
    public void jumpToYear(int year){
        int currentYear = 2025;
        int timePassed=year-currentYear;
        int correctedAge = age+timePassed;
        System.out.println(correctedAge);
    }
    public double getNetworth(double monthlySpending){
        return netIncome-monthlySpending*12;
    }
}
