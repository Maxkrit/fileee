import java.util.Scanner;

public class labb03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLease insert a number : ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++){
            if (i % 5 != 0){
                System.out.print("|");
            }else{
                System.out.println("|");
            }
        }
        
    }
}
