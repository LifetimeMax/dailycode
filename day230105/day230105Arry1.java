import java.util.Scanner;
public class day230105Arry1 {
    public static void main(String[] args){
        //����һ��char���͵�26��Ԫ�ص����飬�ֱ����'A'-'Z����
        //ʹ��forѭ����������Ԫ�ز���ӡ��������ʾ:char������������'A'+2->'C'
        int i;
        char[] arr = new char[26];
        for (i = 0;i < arr.length ; i++){
            arr[i] = (char)('A' + i);
        }
        for (i = 0;i <= arr.length ; i++){
            System.out.println("��"+ (i+1) +"��Ԫ��Ϊ" + arr[i]);
        }
    }
}
