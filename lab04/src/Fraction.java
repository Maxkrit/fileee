
public class Fraction {
    public int topN;
    public int btmN;
    
    public String toFraction(){
        return String.format("%d/%d", topN, btmN);
    }
    public String toFloat(){
        double result = (double) topN / btmN;
        return String.valueOf(result);
    }
    public void addFraction(Fraction f){
        if (btmN == f.btmN){
            topN = topN + f.topN;
        }else{
            topN = topN * f.btmN + f.topN * btmN;
            btmN = btmN * f.btmN;
        }
    }
}
