package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum=0;
        int temp=9;
        if(lengthOfLastNumber>0){
            for (int i=1;i<lengthOfLastNumber;i++){
            temp = temp*10+9;
            sum +=temp;
        }
            System.out.println(sum+9);
        } else {
            System.out.println(sum);
        }

    }
}
