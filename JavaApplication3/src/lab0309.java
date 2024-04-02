import java.util.Scanner;

public class lab0309 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int oddnum = 0, evennum = 0;
        while (true){
            int num = input.nextInt();
            if (num == -1){
                break;
            }else{
                if (num % 2 == 0){
                    evennum += 1;
                }else{
                    oddnum += 1;
                }
            }
        }
    System.out.print("Odd number = "+oddnum+" and Even number = "+evennum);
    }
}
