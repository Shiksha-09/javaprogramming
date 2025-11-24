public class Daimond {
    public static void main(String[] args) {
        // for (int r = 1; r <= 5; ++r) {
        //     for (int c = 1; c <= 9; ++c) {
        //         if ((c >= 6 - r && c <= 4 + r) && (c >= r && c <= 10 - r)) {
        //             System.out.print("*");
        //         } else
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }


        int a=0;
        for(int r=1;r<=9;++r){
            a=(r<=5)?++a:--a;
            for(int c=1;c<=9;++c){
              if(c>=6-r && c<=4+r)
              System.out.print("*");
              else
              System.out.print(" ");
            }
            System.out.println();
        }
    }
}
