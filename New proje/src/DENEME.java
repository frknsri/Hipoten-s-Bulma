import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class DENEME {
    public static void main(String[] args) {

        // değişkenler
        double dikkenarA , dikkenarB ,hipotenusC ;

        // kullanıcılardan verileri all
        Scanner girdi = new Scanner(System.in);
        System.out.print("1 Kenarı Giriniz : ");
        dikkenarA = girdi.nextDouble();
        System.out.print("2 Kenarı Giriniz : ");
        dikkenarB = girdi.nextDouble();

        hipotenusC = Math.sqrt((dikkenarA * dikkenarA ) + (dikkenarB * dikkenarB));
        System.out.println("sonuç  : " + hipotenusC);








    }
}