import java.util.Scanner;
//ʵ���ж�һ�������������ĸ���Χ:����0;С��0;����0
public class day230105Exercise2 {
    public static void main(String[] args){
        int i;
        System.out.print("������һ������");
        Scanner myScanner = new Scanner(System.in);
        i = myScanner.next().charAt(0);
        if (i > 0){
            System.out.println("����0");
        } else if (i < 0) {
            System.out.println("С��0");
        }else if(i == 0){
            System.out.println("����0");
        }
    }
}
