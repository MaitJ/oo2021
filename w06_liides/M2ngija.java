import java.util.ArrayList;
public class M2ngija extends LiikuvObjekt {
    String m2ngijaNimi;
    Pall hoitavPall;

    public M2ngija(String m2ngijaNimi, double x, double y) {
        super(x, y);
        this.m2ngijaNimi = m2ngijaNimi;
    }

    public M2ngija(String m2ngijaNimi, double x, double y, double dx, double dy) {
        super(x, y, dx, dy);
        this.m2ngijaNimi = m2ngijaNimi;
    }

    public void muudaSuunda(double dx, double dy) {
        this.kiirus.x = dx;
        this.kiirus.y = dy;
    }

    public void hoiaPalli(Pall pall) {
        //Kui pall on 1 yhiku raadiuses ss saab hoida palli
        if (pall.kaugusObjektist(this) <= 1) {
            this.hoitavPall = pall;
        } else {
            System.out.println("Pall on m2ngijast liiga kaugel");
        }
    }

    public void liigu(double aeg) {
        if (this.hoitavPall != null) {
            this.asukoht.liidaJuurde(this.kiirus.korruta(aeg));
            this.hoitavPall.nullKoef();
            this.hoitavPall.lobj.kiirus = this.kiirus;
            this.hoitavPall.liigu(aeg);
        } else {
            this.asukoht.liidaJuurde(this.kiirus.korruta(aeg));
        }
    }

    public void looPalli(double aeg) {
        if (this.hoitavPall != null) {
            System.out.println(this.hoitavPall.saaAsukoht());
            this.hoitavPall.nullKoef();
            this.hoitavPall.liigu(aeg);
            System.out.println(this.hoitavPall.saaAsukoht());
            this.hoitavPall = null;
        } else {
            System.out.println("M2ngija ei hoia palli");
        }
    }

//    public ArrayList<M2ngija> l2heduses(Kaart kaart, int raadius) {
//        M2ngija[] m2ngijad = kaart.saaM2ngijad();
//        ArrayList<M2ngija> l2hedad = new ArrayList<M2ngija>();
//        for (M2ngija obj : m2ngijad) {
//            double kaugus = kaugusObjektist(obj);
//            if (kaugus <= raadius && this.m2ngijaNimi != obj.m2ngijaNimi) {
//                System.out.println(obj.m2ngijaNimi + " kaugus: " + kaugus);
//                l2hedad.add((M2ngija) obj);
//            }
//        }
//
//        return l2hedad;
//    }

    //Liigu palliga ringi
    //L88 palli
}