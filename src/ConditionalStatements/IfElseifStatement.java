package ConditionalStatements;

public class IfElseifStatement {
    public static void main(String[] args) {
        int x=7;
        if(x<10){
            System.out.println(x+ "is less than 10");
        }else if((x>10) &&(x<20)){
            System.out.println(x+ "is greater than 10 but less than 20");
        }else if(x>20){
            System.out.println(x+ "is greater than 20");
        }
    }
}
