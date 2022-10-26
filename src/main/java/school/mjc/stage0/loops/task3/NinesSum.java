package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum=0;
        int temp=0;
        for (int i=0;i<=lengthOfLastNumber;i++){
            temp = (int) Math.pow(10,i);
            sum += (sum+temp*9);
        }
        System.out.println(sum);

    }
}
