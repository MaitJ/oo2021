public class Pall {
    LiikuvObjekt lobj;
    double aeglustuskoef;

    public Pall(double x, double y, double dx, double dy, double aeglustuskoef) {
        lobj = new LiikuvObjekt(x, y, dx, dy);
        this.aeglustuskoef = aeglustuskoef;
    }
    public void liigu(double sek) {
        this.lobj.liigu(sek);
        this.lobj.kiirus = lobj.kiirus.korruta(Math.pow(aeglustuskoef, sek));
    }
    public String toString() {
        return "Pall: " + this.aeglustuskoef + " " + this.lobj;
    }
    //Loo käsklus, mis tagastab kauguse meetrites
    //Etteantud liikuvast objektist
    public double kaugusObjektist(LiikuvObjekt obj) {
        Vektor asukoht1 = obj.asukoht;
        Vektor asukoht2 = this.lobj.asukoht;
        Vektor liikumisVektor = new Vektor((asukoht1.x - asukoht2.x), (asukoht1.y - asukoht2.y));
        double kaugus = Math.sqrt(Math.abs(Math.pow(liikumisVektor.x, 2) + Math.pow(liikumisVektor.y, 2)));
        return kaugus;
    }

}