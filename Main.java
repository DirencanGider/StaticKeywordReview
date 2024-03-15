public class Main {
    public static void main(String[] args) {

        StaticClass s1 = new StaticClass("Direncan");  //  3  //  Yeni alan ekleyince hata aldık. Parantez içini doldurduk.  //  10
        StaticClass s2 = new StaticClass("Murat");  //  4  //  Yeni alan ekleyince hata aldık. Parantez içini doldurduk.  //  11

        System.out.println("Obje Sayısı: " + StaticClass.obje_sayisi);  //  5
        System.out.println("Obje Sayısı: " + s1.obje_sayisi);  // s1 ve s2 obje referansları üzerinden de direkt erişebiliyoruz.  //  6
        System.out.println("Obje Sayısı: " + s2.obje_sayisi);  // s1 ve s2 obje referansları üzerinden de direkt erişebiliyoruz.  //  7


        toplama(3,4,5);  //  15

    }
    public static void toplama(int a,int b, int c) {  /* static olmayan bu metodu yazdık. Sonrasında yukarıdaki main metodu
                                                         içerisinde çağırdık. Hata verdi. Çünkü static bir main metodu içerisinde
                                                         static olmayan bir metodu çağıramayız.
                                                         Bu metodu static yaptıktan sonra sorun çözülmüş oldu.*/  //  14

        System.out.println(a + b + c);

    }

}
