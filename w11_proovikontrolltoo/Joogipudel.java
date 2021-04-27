package com.company;

public class Joogipudel {
    public double maht;
    public String pudeliTyyp;
    public double mass;
    public double taaraMaksumus;
    public Jook sisu;

    public Joogipudel(double maht, String pudeliTyyp, double mass, double taaraMaksumus) {
        this.maht = maht;
        this.pudeliTyyp = pudeliTyyp;
        this.mass = mass;
        this.taaraMaksumus = taaraMaksumus;
        this.sisu = null;
    }

    public Joogipudel(double maht, String pudeliTyyp, double mass, double taaraMaksumus, Jook sisu) {
        this.maht = maht;
        this.pudeliTyyp = pudeliTyyp;
        this.mass = mass;
        this.taaraMaksumus = taaraMaksumus;
        this.sisu = sisu;
    }

    public void lisaJook(Jook jook) {
        this.sisu = jook;
    }

    public double arvutaMass() {
        return (this.maht * this.sisu.kaal) + this.mass;
    }

    public double leiaOmahind() {
        double tapneHind = (this.sisu.liitriHind * (this.maht / 1000)) + taaraMaksumus;
        return Math.round(tapneHind * 100.0) / 100.0;
    }
}
