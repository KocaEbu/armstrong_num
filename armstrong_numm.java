import java.util.Scanner;

public class armstrong_numm {
    public static void main(String[] args) {

        int num,bas,tot=0;

        Scanner input=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        num= input.nextInt();


        while(num !=0 ) {

            bas=num%10;
            num=num/10;
            tot= tot+bas;


        }

        System.out.println("Basamaklar toplami : "+tot);



    }
}
