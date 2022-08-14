package socket;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] allOut = {1,5,6,7,3,43,25,654,342,66,998,76};
        int pw = 654;
        System.out.println(Arrays.toString(allOut));
        for(int i=0;i< allOut.length;i++){
            if(allOut[i]==pw){
                allOut[i] = allOut[allOut.length-1];
                allOut = Arrays.copyOf(allOut,allOut.length-1);
                break;
            }
        }

        //将pw从allOut中删除


        System.out.println(Arrays.toString(allOut));
    }
}
