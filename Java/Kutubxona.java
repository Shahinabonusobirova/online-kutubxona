import java.util.Scanner;
public class Kutubxona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomlar = {
            "Otkan kunlar",
            "Mehrobdan chayon",
            "Kecha va kunduz",
            "Shum bola",
            "Sariq devni minib",
            "Dunyoning ishlari"
        };

        String[] mualliflar = {
            "Abdulla Qodiriy",
            "Abdulla Qodiriy",
            "Cholpon",
            "Gafur Gulom",
            "Xudoyberdi Toxtaboyev",
            "Otkir Hoshimov"
        };

        String[] malumotlar = {
            "O'zbek romanchiligining ilk namunalaridan biri.",
            "Tarixiy voqealar asosida yozilgan mashhur roman.",
            "Jamiyat hayoti va inson taqdiri tasvirlangan roman.",
            "Bolalik va sarguzashtlarga boy qiziqarli asar.",
            "Bolalar adabiyotining qiziqarli namunasi.",
            "Ona mehri va hayotiy xotiralar haqida asar."
        };

        System.out.println("=== BADIY ASARLAR KUTUBXONASI ===");
        System.out.println("1. Barcha asarlarni ko'rish");
        System.out.println("2. Asar qidirish");
        System.out.print("Tanlovni kiriting: ");
        int tanlov = sc.nextInt();
        sc.nextLine();

        if (tanlov == 1) {
            for (int i = 0; i < nomlar.length; i++) {
                System.out.println("\nAsar nomi: " + nomlar[i]);
                System.out.println("Muallif: " + mualliflar[i]);
                System.out.println("Ma'lumot: " + malumotlar[i]);
            }
        } else if (tanlov == 2) {
            System.out.print("Qidirilayotgan asar nomini kiriting: ");
            String qidiruv = sc.nextLine().toLowerCase();

            boolean topildi = false;

            for (int i = 0; i < nomlar.length; i++) {
                if (nomlar[i].toLowerCase().contains(qidiruv)) {
                    System.out.println("\nAsar nomi: " + nomlar[i]);
                    System.out.println("Muallif: " + mualliflar[i]);
                    System.out.println("Ma'lumot: " + malumotlar[i]);
                    topildi = true;
                }
            }

            if (!topildi) {
                System.out.println("Bunday asar topilmadi.");
            }
        } else {
            System.out.println("Noto'g'ri tanlov kiritildi.");
        }

        sc.close();
    }
}