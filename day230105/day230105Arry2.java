public class day230105Arry2 {
    public static void main(String[] args){
        //�����һ������int[]�����ֵ{4,-1,9,10,23}�����õ���Ӧ���±ꡣ
        int[] arr = {4,-1,23,9,10};
        int maxIndex =0 ;
        int max = arr[0];
        for ( int i = 0;i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("���ֵΪ"+max+"�±�Ϊ"+ maxIndex);
    }
}
