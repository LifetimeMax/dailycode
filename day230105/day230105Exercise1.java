//1.���ʵ�����¹���
//ĳ����100,000Ԫ,ÿ����һ��·�ڣ���Ҫ����,��������:1)���ֽ�>50000ʱ,ÿ�ν�5%
//2)���ֽ�<=50000ʱ,ÿ�ν�1000
//��̼�����˿��Ծ������ٴ�·��,Ҫ��:ʹ��while break��ʽ���
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
