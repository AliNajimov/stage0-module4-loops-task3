package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int temp = Math.max(first,second);
        int res=0;
        for (int i=temp;i>0;i--){
            if(first%i==0&&second%i==0){
                res=i;
                break;
            }
        }
        System.out.println(res);
    }
}
