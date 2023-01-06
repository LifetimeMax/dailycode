//求出1-1/2+1/3-1/4.....1/100的和
public class day230105Exercise7 {
    public static void main(String[] srgs){
        double sum = 0;
        for (int i = 1;i <= 100;i++){
            if (i % 2 == 0){
                sum = sum - 1.0/(i);
            }
            if (i % 2 != 0){
                sum = sum + 1.0/(i);
            }
        }
        System.out.print(sum);
    }
}
