package lesson3;
public class PTConference{
    public static void main(String[] args){
        student bob = new student("Bob",14,0f,70);
        teacher dave = new teacher("Dave",30,300000f,"Computer Engineering",8);
        parent ava = new parent("Ava",28,40000f,8,bob);
        bob.Intro();
        dave.Intro();
        ava.Intro();
        dave.report(bob.grades,ava);
        bob.disappointment();
    }
}
