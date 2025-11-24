
public class Temp {
   int temp;
   Scanner obj=new Scanner(System.in);
   System.out.print("enter temperature : ");
   temp=obj.nextInt();
    int option;
    int c;

    System.out.println("Enter option : ");
     option=obj.nextInt();
   if(option==1){
  
     c=(temp-32)*5/9;
      
     if(c>0 && c<=10){
        System.out.println("Very cold");
     }
     else if(c>10 && c<=20){
        System.out.println("Cold");
     }
     else if(c>20 && c<=30){
        System.out.println("Hot");
     }
     else if(c>=40){
        System.out.println("Hotter");
     }
     else {
        System.out.println("Invalid");
     }

   }

}
