//�ж�һ�������Ƿ���ˮ�ɻ�����
//��νˮ�ɻ�����ָһ��3λ���������λ�����������͵����䱾��
//����:153 = 1*1*1 + 3*3*3 + 5*5*5
import java.util.Scanner;
public class day230105Exercise4 {
    public static void main(String[] args){
        int a = 0,b = 0,c = 0;
        System.out.println("������һ������");
        Scanner myScanner = new Scanner(System.in);
        int i = myScanner.nextInt();
        a = i % 10;
        b = (i % 100)/10;
        c = i / 100;
        if (a * a * a + b * b * b + c * c * c == i){
            System.out.println("������Ϊˮ�ɻ���");
        }
        System.out.println("a="+ a);
        System.out.println("b="+ b);
        System.out.println("c="+ c);
        System.out.println("i="+ i);
    }
}
