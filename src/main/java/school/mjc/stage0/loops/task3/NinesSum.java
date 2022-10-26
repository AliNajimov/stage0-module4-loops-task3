package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum=0;
        for (int i=1;i<=lengthOfLastNumber;i++){
            sum+=9*(10*i);
        }
        System.out.println(sum);

    }
}
