import java.util.ArrayList;
public class M2ngija extends LiikuvObjekt {
    String m2ngijaNimi;

    public M2ngija(String m2ngijaNimi, double x, double y) {
        super(x, y);
        this.m2ngijaNimi = m2ngijaNimi;
    }

    public M2ngija(String m2ngijaNimi, double x, double y, double dx, double dy) {
        super(x, y, dx, dy);
        this.m2ngijaNimi = m2ngijaNimi;
    }

    public ArrayList<M2ngija> l2heduses(Kaart kaart, int raadius) {
        M2ngija[] m2ngijad = kaart.saaM2ngijad();
        ArrayList<M2ngija> l2hedad = new ArrayList<M2ngija>();
        for (M2ngija obj : m2ngijad) {
            double kaugus = kaugusObjektist(obj);
            if (kaugus <= raadius && this.m2ngijaNimi != obj.m2ngijaNimi) {
                System.out.println(obj.m2ngijaNimi + " kaugus: " + kaugus);
                l2hedad.add((M2ngija) obj);
            }
        }

        return l2hedad;
    }

    //Liigu palliga ringi
    //L88 palli
}