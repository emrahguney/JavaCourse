package Gun33._02_Ornek;

public class Ordek extends Hayvan {

    private int kanatAcikligi;

    public Ordek(String renk, int kilo, String cinsi,int kanatAcikligi) {
        super(renk, kilo, cinsi);
setKanatAcikligi(kanatAcikligi);
    }

    public int getKanatAcikligi() {
        return kanatAcikligi;
    }

    public void setKanatAcikligi(int kanatAcikligi) {
        this.kanatAcikligi = kanatAcikligi;
    }

    @Override
    public void konustu() {
        System.out.println("vak vak");
    }
}
