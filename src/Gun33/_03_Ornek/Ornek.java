package Gun33._03_Ornek;

public class Ornek {
   /* Calisan isminde bi class tanımlayınız properties/fields(isim, maas, maasKatSayisi(int))
    consructor ve maashesapla Metodu(maas*maasKatSayisi) ekleyiniz. toString metodu ekleyiniz.
    GenelMudur isimli bir classı Calisan sınıfından türetip, extra field olarak tazminat ekleyiniz.
    GenelMudur classında maasHesaplaya tazminat da ekleyiniz.
    SirketMain diye yazacağınız main in olduğu yerde, 1 calısan ve 1 GenelMüdür tanımlayarak,
    maaşları hesaplatıp, bordroyu yazdırınız.*/

    public static void main(String[] args) {
        Calisan cal1=new Calisan("erdem",20000,1.6);
        System.out.println(cal1);



        GenelMudur gm1=new GenelMudur("emrah",35000,1.7,10000);
        System.out.print(gm1);



    }
}
