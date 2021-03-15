import java.util.ArrayList;
public class Kaart {
    int pikkus;
    int laius;
    M2nguObjekt[][] kaart;

    public Kaart(int pikkus, int laius) {
        this.pikkus = pikkus;
        this.laius = laius;
        this.kaart = new M2nguObjekt[laius][pikkus];
    }

    public void lisaKaardile(M2nguObjekt lisatav) {
        Vektor lisatavaAsukoht = lisatav.saaAsukoht();
        double pikkus = this.pikkus;
        double laius = this.laius;
        if (lisatavaAsukoht.x >= 0.0 && lisatavaAsukoht.x <= laius && lisatavaAsukoht.y >= 0.0 && lisatavaAsukoht.y <= pikkus) {
            this.kaart[(int) Math.floor(lisatavaAsukoht.x)][(int) Math.floor(lisatavaAsukoht.y)] = lisatav;
        } else {
            throw new RuntimeException("Lisatav objekt on kaardi piirest v2ljas");
        }
    }


    public void liigutaM2ngijat(M2ngija liigutatav, int aeg) {
        Vektor uusAsukoht = liigutatav.asukohtPealeLiikumist(aeg);
        M2nguObjekt[] objektid = saaObjektid();
        boolean kasKeegiOnSeal = false;
        
        for (int i = 0; i < objektid.length; i++) {
            if (objektid[i] != liigutatav) {
                if (objektid[i].saaAsukoht().x == uusAsukoht.x && objektid[i].saaAsukoht().y == uusAsukoht.y) {
                    kasKeegiOnSeal = true;
                }
            }
        }

        if (!kasKeegiOnSeal) {
            liigutatav.liigu(aeg);
            this.uuendaKaarti();
        }
    }

    public M2nguObjekt[] saaObjektid() {
        ArrayList<M2nguObjekt> tempList = new ArrayList<M2nguObjekt>();
        for (int i = 0; i < this.laius; i++) {
            for (int j = 0; j < this.pikkus; j++) {
                if (this.kaart[i][j] instanceof M2nguObjekt) {
                    tempList.add(this.kaart[i][j]);
                }
            }
        }
        M2nguObjekt[] kaardiArray = new M2nguObjekt[tempList.size()];

        for (int i = 0; i < tempList.size(); i++) {
            kaardiArray[i] = tempList.get(i);
        }
        return kaardiArray;
    }

    public void uuendaKaarti() {
        for (int x = 0; x < laius; x++) {
            for (int y = 0; y < pikkus; y++) {
                if (this.kaart[x][y] != null) {
                    M2nguObjekt prgObj = this.kaart[x][y];
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
                    if (this.kaart[x][y] instanceof M2ngija) {
                        System.out.print(1);
                    } else if (this.kaart[x][y] instanceof Pall) {
                        System.out.print(2);
                    }
                } else {
                    System.out.print(0);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}