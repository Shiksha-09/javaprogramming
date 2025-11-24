// Rightangle triangle

// public class Rightangle{
//     public static void main (String args[]){
//         for(int r=1;r<=5;++r){
//             for(int c=1;c<=5;++c){
//                 if(c<=r){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//         }
//     }
//        System.out.println();
// 

// InvertedLeft

// public class Rightangle{
//     public static void main (String args[]){
//         for(int r=1;r<=5;++r){
//             for(int c=1;c<=5;++c){
//                 if(c>=r){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//         }
//     }
//        System.out.println();
// 

//Leftangle

// public class Rightangle{
//     public static void main (String args[]){
//         for(int r=1;r<=5;++r){
//             for(int c=1;c<=5;++c){
//                 if(c>=6-r){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//         }
//     }
//        System.out.println();
// 

// Inverted right
// public class Rightangle{
//     public static void main (String args[]){
//         for(int r=1;r<=5;++r){
//             for(int c=1;c<=5;++c){
//                 if(c<=6-r){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//         }
//     }
//        System.out.println();
// 

//repeated Number

// public class Rightangle{
//     public static void main (String args[]){
//         for(int r=1;r<=5;++r){
//             for(int c=1;c<=5;++c){
//                 if(c<=r){
//                     System.out.print(r);
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//         }
//     }
//        System.out.println();
// 

//continue

// public class Rightangle{
//     public static void main (String args[]){
//         for(int r=1;r<=5;++r){
//             for(int c=1;c<=5;++c){
//                 if(c<=r){
//                     System.out.print(c);
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//         }
//     }
//        System.out.println();
// 

//Fifteen

// public class Rightangle{
//     public static void main (String args[]){
//         int i=0;
//         for(int r=1;r<=5;++r){
//             for(int c=1;c<=5;++c){
//                 if(c<=r){
//                     System.out.print(++i);
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//         }
//     }
//        System.out.println();
// 

//Alphabets

public class Rightangle {
    public static void main(String args[]) {
        char i = 'a';
        for (int r = 1; r <= 5; ++r) {
            for (int c = 1; c <= 5; ++c) {
                if (c <= r) {
                    System.out.print(i++);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}