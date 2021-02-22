import java.util.ArrayList;
public class Kaart {
    int pikkus;
    int laius;
    LiikuvObjekt[][] kaart;

    public Kaart(int pikkus, int laius) {
        this.pikkus = pikkus;
        this.laius = laius;
        this.kaart = new LiikuvObjekt[laius][pikkus];
    }

    public void lisaKaardile(LiikuvObjekt lisatav) {
        Vektor lisatavaAsukoht = lisatav.asukoht;
        double pikkus = this.pikkus;
        double laius = this.laius;
        if (lisatavaAsukoht.x >= 0.0 && lisatavaAsukoht.x <= laius && lisatavaAsukoht.y >= 0.0 && lisatavaAsukoht.y <= pikkus) {
            this.kaart[(int) Math.floor(lisatavaAsukoht.x)][(int) Math.floor(lisatavaAsukoht.y)] = lisatav;
        } else {
            throw new RuntimeException("Lisatav objekt on kaardi piirest v2ljas");
        }
    }

    public M2ngija[] saaM2ngijad() {
        ArrayList<M2ngija> tempList = new ArrayList<M2ngija>();
        for (int i = 0; i < this.laius; i++) {
            for (int j = 0; j < this.pikkus; j++) {
                if (this.kaart[i][j] instanceof M2ngija) {
                    tempList.add((M2ngija) this.kaart[i][j]);
                }
            }
        }
        M2ngija[] m2ngijaArray = new M2ngija[tempList.size()];

        for (int i = 0; i < tempList.size(); i++) {
            m2ngijaArray[i] = tempList.get(i);
        }
        return m2ngijaArray;
    }

    public void uuendaKaarti() {
        for (int x = 0; x < laius; x++) {
            for (int y = 0; y < pikkus; y++) {
                if (this.kaart[x][y] != null) {
                    LiikuvObjekt prgObj = this.kaart[x][y];
                    this.kaart[x][y] = null;
                    lisaKaardile(prgObj);
                }
            }
        }
    }

    public void display() {
        for (int y = (pikkus - 1); y >= 0; y--) {
            for (int x = 0; x <= (laius - 1); x++) {
                if (this.kaart[x][y] != null) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}