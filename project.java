import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("press 1 to change nis to dollars");
        System.out.println("press 2  to change dollars to nis");
        System.out.println("press 3 to change euro to nis");
        System.out.println("press 4 to change nis to euro");
        System.out.println("press 0 to exit");
int number=scanner.nextInt();
if(number==1) {
    System.out.println("enter  how mach nis you want to change to dollars");
int change1=scanner.nextInt();
        System.out.println(change1*3.5);
        System.out.println("you change"+ change1 );}
        else if (number==2){
        System.out.println("enter how mach dollars you want to change to nis");
          int change2=scanner.nextInt();
        System.out.println(change2*3.5);
        System.out.println("you change "+ change2);}
        else if (number ==3) {
        System.out.println("enter how mach euro you want to change to nis");
         int change3=scanner.nextInt();
        System.out.println(change3*3.6);
        System.out.println("you change"+change3);}
        else if (number==4){
        System.out.println("enter how mach nis you want to change to euro");
        int change4=scanner.nextInt();
        System.out.println(change4/3.6);
        System.out.println("you change"+change4);}
        else if (number==0);{
        System.out.println("goodbye");}
    }
}
