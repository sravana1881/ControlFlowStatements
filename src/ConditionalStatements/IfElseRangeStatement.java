package ConditionalStatements;

public class IfElseRangeStatement {
    public static void main(String[] args) {
        int x=18;
        if((x<10) || (x>20)){
            System.out.println(x + "is out of range");
        }if((x>=10) && (x<=20)){
            System.out.println(x + "is in range");
        }
    }
}
