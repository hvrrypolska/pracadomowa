import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        List<Pojazd> pojazdList = new ArrayList<>();

        pojazdList.add(new Pojazd("FIAT","Osobowy"));
        pojazdList.add(new Pojazd("SKODA","Osobowy"));
        pojazdList.add(new Pojazd("OPEL","Osobowy"));
        pojazdList.add(new Pojazd("Ikarus","Autobus"));
        pojazdList.add(new Pojazd("Star","Ciężarowy"));
        pojazdList.add(new Pojazd("Iveco","Ciężarowy"));
        pojazdList.add(new Pojazd("Honda","Motocykl"));
        pojazdList.add(new Pojazd("Kawasaki","Motocykl"));
        for(Pojazd item: pojazdList) {
            System.out.println(item.toString());
        }
    }

}