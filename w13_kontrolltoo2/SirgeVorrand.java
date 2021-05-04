package com.company;

public class SirgeVorrand implements SirgeLiides {
    public double kordaja;

    public SirgeVorrand(double kordaja) {
        this.kordaja = kordaja;
    }

    public Double[] arvuta(Double[] x) {
        Double[] valjund = new Double[x.length];

        for (int i = 0; i < x.length; ++i) {
            valjund[i] = this.kordaja * x[i];
        }

        return valjund;
    }

    public double arvuta(double x) {
        return this.kordaja * x;
    }
}
