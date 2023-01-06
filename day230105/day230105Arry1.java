import java.util.Scanner;
public class day230105Arry1 {
    public static void main(String[] args){
        //创建一个char类型的26个元素的数组，分别放置'A'-'Z‘。
        //使用for循环访问所有元素并打印出来。提示:char类型数据运算'A'+2->'C'
        int i;
        char[] arr = new char[26];
        for (i = 0;i < arr.length ; i++){
            arr[i] = (char)('A' + i);
        }
        for (i = 0;i <= arr.length ; i++){
            System.out.println("第"+ (i+1) +"个元素为" + arr[i]);
        }
    }
}
