import java.util.Scanner;
public class Pemilihan2Percobaan214 {
    public static void main(String[] args){
        Scanner input14 = new Scanner(System.in);
        float sudut1,sudut2,sudut3,totalsudut;

        System.out.println("Masukkan sudut1: ");
        sudut1 = input14.nextFloat();
        System.out.println("Masukkan sudut2: ");
        sudut2 = input14.nextFloat();
        System.out.println("Masukkan sudut3: ");
        sudut3 = input14.nextFloat();

        totalsudut = sudut1+sudut2+sudut3; 
     
        if (totalsudut == 180){
        } else if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
        } else if ((sudut1 == sudut2)&&( sudut2 == sudut3)) {
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
        } else if ((sudut1 == sudut3)||(sudut2 == sudut3)||(sudut1 == sudut2)) {
                System.out.println("Segitiga tersebut adalah segitiga sama Kaki");
        } else {
                System.out.println("segitiga sembarang");
    }
  }
}
 
