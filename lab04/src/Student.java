
public class Student {
    public String name;
    public double mScore;
    public double fScore;
    
    public void showgrade(){
        double s = (mScore*0.4)+(fScore*0.4)+20;
        if (s < 50){
            System.out.print("Your grade: F.");
        }else if (s >= 50 && s < 60){
            System.out.print("Your grade: D.");
        }else if (s >= 60 && s < 70){
            System.out.print("Your grade: C.");
        }else if (s >= 70 && s < 80){
            System.out.print("Your grade: B.");
        }else if (s >= 80){
            System.out.print("Your grade: A.");
        }
    }
}
