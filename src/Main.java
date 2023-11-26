import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // değişkenleri tanımlayalım
        double armut = 2.14 , elma = 3.67 , domates = 1.11, muz = 0.95, patlican= 5;
        double armutTutar, elmaTutar, domatesTutar, muzTutar, patlicanTutar, total;

        Scanner pro = new Scanner(System.in);
        System.out.println("Kaç kilo armut aldınız? : ");
        armutTutar = pro.nextDouble();

        System.out.println("Kaç kilo elma aldınız? : ");
        elmaTutar = pro.nextDouble();

        System.out.println("Kaç kilo domates aldınız? : ");
        domatesTutar = pro.nextDouble();

        System.out.println("Kaç kilo muz aldınız? : ");
        muzTutar = pro.nextDouble();

        System.out.println("Kaç kilo patlıcan aldınız? : ");
        patlicanTutar = pro.nextDouble();

        total = (armutTutar*armut) + (elmaTutar*elma) + (domatesTutar*domates) + (muzTutar*muz) + (patlicanTutar*patlican);

        System.out.println("Toplam tutar: "+ total);


    }
}