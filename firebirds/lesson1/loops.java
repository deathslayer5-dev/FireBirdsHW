import java.util.Scanner;
public class loops{
    public static void main(String[] args){
        for(int i = 5; i < 100; i+=3){
            System.out.println(i);
        }
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char[] arr = input.toCharArray();
        while(arr.length >0){
            if(arr.length ==1 || arr.length == 2){
                System.out.println();
                System.exit(0);
            }
            char[] temp = new char[arr.length-2];
            int index = 0;
            for(int i = 1; i < arr.length-1; i++){
                temp[index++] = arr[i];
            }
            arr = temp;
           System.out.println(new String(arr));
        }
    }
}

        
