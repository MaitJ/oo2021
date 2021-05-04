package com.company;

public class SirgeVorrandVaba implements SirgeLiides {
    public double kordaja;
    public double vabaliige;

    public SirgeVorrandVaba(double kordaja, double vabaliige) {
        this.kordaja = kordaja;
        this.vabaliige = vabaliige;
    }

    public double arvuta(double x) {
        return (this.kordaja * x) + this.vabaliige;
    }

    public Double[] arvuta(Double[] x) {
        Double[] valjund = new Double[x.length];

        for (int i = 0; i < x.length; ++i) {
            valjund[i] = (this.kordaja * x[i]) + this.vabaliige;
        }

        return valjund;
    }
}
