package assigenments;

import java.util.Arrays;

public class AvgSalary {
    public static double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0;
        double min = salary[0];
        double max = salary[salary.length-1];
        int count = 0;
        for(int i = 1; i<salary.length-1; i++)
        {
            if(min != salary[i] && max != salary[i])
            {
                sum += salary[i];
                count++;
            }
        }
        return sum / count;
    }
    public static void main(String []args)
    {
        int []a = {8000,9000,2000,3000,6000,1000};
        System.out.println(average(a));
    }
}
