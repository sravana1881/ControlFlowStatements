package ForLoop;

public class NaturalNumbersSumForLoop {
    public static void main(String[] args) {
        int sum = 0;
        int n=1000;
        for(int i=0; i<=n; i++){
            sum+=i;
            System.out.println(sum);
        }
    }
}
