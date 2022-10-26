package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        if(t<0){
            t*=-1;
        }
        int sum=0;
        int res=0;
        for(int i=t;i>0;i/=10){
            res = i%10;
            sum+=res;
        }
        System.out.println(sum);

    }
}
