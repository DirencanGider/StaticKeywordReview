// Hatırlatma: static anahtar kelimesi class'a özgüdür.
public class StaticClass {
    public static int obje_sayisi = 0;  /*  Bu static anahtar kelimesi ile yazılan her bir değişken, obje oluşturmaya gerek
                                            gerek kalmadan classa özgü olduğu için direkt olarak oluşturuluyor. */  //  1
    private static String isim;  // Yeni bir alan ekledik.  //  8  //  Aşağıdaki static metod hata verince bu alanı static yaptık.  //  13

    public StaticClass(String isim) {  // Yeni alanı ekledikten sonra parantez içine de isim'i ekledik.  //  9
        this.isim = isim;  //  10
        obje_sayisi++;  //  Her obje oluşturulduğunda otomatik olarak 1 arttırılacak.  //  2

    }
    public static String getIsim() {  /*  Bu metodu yazdık ve hata aldık. Çünkü metod static fakat yukarıda oluşturduğumuz
                                          "isim" adlı alan static olarak oluşturulmamış. Onu static yaptıktan sonra sorun
                                          çözüldü.  */  //  12
        return isim;

    }

}
