import java.util.Scanner;
public class havasicaklik {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık giriniz");
        heat = input.nextInt();
        if (heat < 5) {
            System.out.print("Kayak Yapabilirsiniz");
        } else if ( heat <= 25) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } if ( heat >= 10 ) {
            System.out.println("Pikniğe gidebilirsiniz");
        } if (heat <= 15 ) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else {
         System.out.println("Sinemaya gidebilirsiniz");
        }
    }
}

