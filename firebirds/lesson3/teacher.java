package lesson3;
public class teacher extends person{
    private String education;
    public int amiability;
    public teacher(String name, int age, float netIncome, String education, int amiability){
        super(name,age,netIncome);
        this.education = education;
        this.amiability = amiability;
    }
    public void powerOf(int a, int b){
        int sum = a;
        for(int i =1; i < b; i++){
            sum*=a;
        }
        System.out.println(a);
    }
    @Override
    public void Intro(){
        System.out.printf("I am %s, I am %d, my netIncome is %f and I specialise in %s.%n",name,age,netIncome,education);
    }
    public void report(int grades, parent par){
        if(amiability >=8){
            par.reaction(90);
        }else if( amiability < 8 && amiability > 4){
            par.reaction(70);
        }else{
            par.reaction(60);
        }
    }
}
