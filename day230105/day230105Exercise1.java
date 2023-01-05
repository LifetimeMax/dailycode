//1.编程实现如下功能
//某人有100,000元,每经过一次路口，需要交费,规则如下:1)当现金>50000时,每次交5%
//2)当现金<=50000时,每次交1000
//编程计算该人可以经过多少次路口,要求:使用while break方式完成
public class day230105Exercise1 {
    public static void main(String[] args){
        double store = 100000;
        int i = 0;
        double change = 0;
        while (true){
            if (store > 50000){
                store = store - (store * 0.05);
                i++;
            }else if(store >= 1000) {
                store = store - 1000;
                i++;
            }else{
                break;
            }
        }
        System.out.print("i="+i);
    }
}
