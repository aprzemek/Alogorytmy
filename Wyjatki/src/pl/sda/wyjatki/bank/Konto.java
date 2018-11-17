package pl.sda.wyjatki.bank;

public class Konto {
    String imie;
    int stanKonta;
    public Konto(String imie, int kwotaStartowa) {
        this.imie = imie;
        this.stanKonta = kwotaStartowa;
    }
    public int wybierzPieniadze(int kwota) {
        return 0;
    }
    public int pobierzStanKonta() {
        return stanKonta;
    }
}
