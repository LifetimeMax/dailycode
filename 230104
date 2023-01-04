import java.util.Scanner;
public class MulForExercise {
    public static void main(String[] args){
        Scanner mark = new Scanner(System.in);
        double totalScore = 0;
        for (int i=1;i<=3;i++){
            double sum = 0;
            int k = 0;
            for (int j=1;j<=5;j++) {
                System.out.println("请输入第" + i + "个班的第" + j + "个学生的成绩");
                double score =mark.nextDouble();
                if (score >=60){
                    k++;
                }
                sum = sum + score;
                System.out.println("sum=" + sum+"平均分"+ (sum/5));
            }
            totalScore += sum;
            System.out.println("第" + i +"个班级的合格人数为" + k);
        }
        System.out.println("所有班级的平均分为" + totalScore);
    }
}
