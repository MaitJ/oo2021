package com.company;

public class Joogikast {
    public String kastiTyyp;
    public double kastiHind;
    public double kastiMass;
    public int pesadeArv;
    public Joogipudel[] kastiSisu;
    public int kastiCount;

    public Joogikast(String kastiTyyp, double kastiHind,
                     int pesadeArv, double kastiMass) {
        this.kastiTyyp = kastiTyyp;
        this.kastiHind = kastiHind;
        this.pesadeArv = pesadeArv;
        this.kastiMass = kastiMass;
        this.kastiSisu = new Joogipudel[pesadeArv];
        this.kastiCount = 0;
    }

    public void lisaPudel(Joogipudel pudel) {
        this.kastiSisu[kastiCount] = pudel;
        ++this.kastiCount;
    }

    public void lisaPudelid(Joogipudel[] pudelid) {
        if (pudelid.length <= this.kastiSisu.length) {
            for (int i = 0; i < pudelid.length; ++i) {
                this.kastiSisu[this.kastiCount] = pudelid[i];
                ++this.kastiCount;
            }
        }
    }

    public double arvutaMass() {
        double mass = this.kastiMass;
        for (int i = 0; i < this.kastiCount; ++i) {
            mass += this.kastiSisu[i].arvutaMass();
        }
        return mass;
    }

    public double arvutaHind() {
        double hindSumma = this.kastiHind;
        for (int i = 0; i < this.kastiCount; ++i) {
            hindSumma += this.kastiSisu[i].leiaOmahind();
        }
        return hindSumma;
    }

    public int praeguneKastiSisu() {
        return kastiCount;
    }
}
