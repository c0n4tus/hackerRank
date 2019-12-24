import java.util.Arrays;

public class ZeroBack {

    public static void main(String[] args) {
        int[] listN = {0,1,0,1,0,4,0};
        zeroBack(listN);
    }
    public static void  zeroBack(int listNo[]){
        int temp=0;
        int indexBck=listNo.length-1;
        for(int i=0;i<listNo.length;i++) {
            if(listNo[i] == 0 && i<indexBck){
                if(listNo[indexBck] ==0) {
                    while (listNo[indexBck] == 0) {
                        indexBck--;
                    }
                    if(indexBck>0){
                        temp=listNo[i];
                        listNo[i]=listNo[indexBck];
                        listNo[indexBck]=temp;
                        indexBck--;
                    }
                }else{
                    temp=listNo[i];
                    listNo[i]=listNo[indexBck];
                    listNo[indexBck]=temp;
                    indexBck--;
                }
            }
        }
       for (int i=0;i<listNo.length;i++){
           System.out.print(listNo[i]);
       }
    }
}