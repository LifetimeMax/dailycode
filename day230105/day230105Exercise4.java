//判断一个整数是否是水仙花数，
//所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
//例如:153 = 1*1*1 + 3*3*3 + 5*5*5
import java.util.Scanner;
public class day230105Exercise4 {
    public static void main(String[] args){
        int a = 0,b = 0,c = 0;
        System.out.println("请输入一个整数");
        Scanner myScanner = new Scanner(System.in);
        int i = myScanner.nextInt();
        a = i % 10;
        b = (i % 100)/10;
        c = i / 100;
        if (a * a * a + b * b * b + c * c * c == i){
            System.out.println("该整数为水仙花数");
        }
        System.out.println("a="+ a);
        System.out.println("b="+ b);
        System.out.println("c="+ c);
        System.out.println("i="+ i);
    }
}
