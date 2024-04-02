import java.util.Scanner;

public class lab0307 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("กรุณาระบุความสูงตึก : ");
        int num = input.nextInt();
        int i = 0;
        while (true){
            if (i == num){
                break;
            }else{
                System.out.println("#-#-#-#-#");
                i += 1;
            }
        }
    }
        
}
