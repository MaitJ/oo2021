package com.company;
import java.util.*;

import static java.lang.Math.floor;

public class Joogivaat {
    public double ruumala;
    public double kogus;
    public Jook sisu;

    public Joogivaat(double ruumala, double kogus, Jook sisu) {
        this.ruumala = ruumala;
        this.kogus = kogus;
        this.sisu = sisu;
    }

    public Joogipudel taidaPudel(Joogipudel tyhiPudel) {
        Joogipudel pudel = new Joogipudel(tyhiPudel.maht,
                tyhiPudel.pudeliTyyp,
                tyhiPudel.mass,
                tyhiPudel.taaraMaksumus);
        if (this.kogus > tyhiPudel.maht) {
            pudel.lisaJook(this.sisu);
            this.kogus -= pudel.maht;
        }
        return pudel;
    }

    public Joogipudel[] tyhjendaVaat(Joogipudel tyhiPudel) {
        int kuiPaljuPudeleid = (int) floor(this.kogus / tyhiPudel.maht);
        Joogipudel[] pudelid = new Joogipudel[kuiPaljuPudeleid];

        for (int i = 0; i < kuiPaljuPudeleid; ++i) {
            pudelid[i] = new Joogipudel(tyhiPudel.maht, tyhiPudel.pudeliTyyp, tyhiPudel.mass, tyhiPudel.taaraMaksumus,
                    this.sisu);
            this.kogus -= tyhiPudel.maht;
        }
        return pudelid;
    }

    public void tyhjendaVaatKasti(Joogipudel naidisPudel, Joogikast kast) {
        Joogipudel[] pudelid = tyhjendaVaat(naidisPudel);
        kast.lisaPudelid(pudelid);
    }
}
