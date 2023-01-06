import java.util.Scanner;
//实现判断一个整数，属于哪个范围:大于0;小于0;等于0
public class day230105Exercise2 {
    public static void main(String[] args){
        int i;
        System.out.print("请输入一个整数");
        Scanner myScanner = new Scanner(System.in);
        i = myScanner.next().charAt(0);
        if (i > 0){
            System.out.println("大于0");
        } else if (i < 0) {
            System.out.println("小于0");
        }else if(i == 0){
            System.out.println("等于0");
        }
    }
}
