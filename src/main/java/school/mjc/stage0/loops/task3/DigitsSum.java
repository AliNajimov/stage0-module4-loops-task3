package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum=0;
        for(int i=t;i>0;i/=10){
            sum+=t%/10;
        }
        System.out.println(sum);

    }
}
