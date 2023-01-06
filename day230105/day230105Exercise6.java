// 输出小写的a-z以及大写的Z-A
public class day230105Exercise6 {
    public static void main(String[] args){
        for (char c1 = 'a';c1 <= 'z';c1++){
            System.out.print(c1);
        }
        System.out.println();
        for (char c2 = 'Z';c2 >= 'A';c2--){
            System.out.print(c2);
        }
    }
}
