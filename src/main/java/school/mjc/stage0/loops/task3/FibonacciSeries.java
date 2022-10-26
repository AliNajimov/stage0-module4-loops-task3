package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int f0=0;
        int f1=1;
        int temp=0;
        System.out.println(f0);
        System.out.println(f1);
        for(int i=2;i<lastFibonacci;i++){
            temp=f0+f1;
            f0 = f1;
            f1=temp;
            System.out.println(temp);
        }
    }
}
