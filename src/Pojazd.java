public class Pojazd extends MarkaPojazdu {
    protected int id;
    private static int nextid=1;
    public Pojazd(String Marka, String Typ) {
        super(Marka,Typ);
        this.id=nextid;
        nextid++;
    }
    @Override
    public String toString() {

        return "id: "+this.id+" marka: "+this.Marka+" typ: "+this.Typ;
    }
}