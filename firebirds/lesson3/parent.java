package lesson3;
public class parent extends person{
    private int trust;
    public student child;
    public parent(String name, int age, float netIncome,int trust, student child){
        super(name,age,netIncome);
        this.trust = trust;
        this.child = child;
    }
    public void reaction(int grades){
        if(trust >= 8){
            System.out.println("You tried you best.");
        }else if(grades >= 90 && trust <=5){
            System.out.println("You didn't get 100, all because of those video games you keep playing.");
        }else{
            System.out.println("I guess you did okay...");
        }
    }
    @Override
    public void Intro(){
        System.out.printf("I am %s, I am %d, I make %f, and I am the parent of %s.%n",name,age,netIncome,child.name);
    }
}

