public abstract class MarkaPojazdu extends TypPojazdu {
    public String Marka;

    public MarkaPojazdu(String Marka, String Typ) {
        super(Typ);
        this.Marka = Marka;
    }
}