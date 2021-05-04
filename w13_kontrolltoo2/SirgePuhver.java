package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class SirgePuhver {
    File fileToRead;
    BufferedReader br;
    ArrayList<SirgeLiides> vorrandid;
    ArrayList<Double[]> sisendid;
    ArrayList<Double[]> vastused;


    public SirgePuhver(String fileName) {
        this.fileToRead = new File(fileName);
        this.vorrandid = new ArrayList<SirgeLiides>();
        this.sisendid = new ArrayList<Double[]>();
        this.vastused = new ArrayList<Double[]>();
        try {
            this.br = new BufferedReader(new FileReader("/home/mait/Documents/Programming/oo_kt2/src/com/company/" + this.fileToRead));
        } catch (FileNotFoundException ex) {
            System.out.println("File not found exception");
        }
        this.loeFaili();
    }

    public void loeFaili() {
        try {
            String line;
            while((line = this.br.readLine()) != null) {
                String[] splitLine = line.split(" ");
                double kordaja = Double.parseDouble(splitLine[0]);
                double vabaliige = Double.parseDouble(splitLine[1]);
                double minX = Double.parseDouble(splitLine[2]);
                double maxX = Double.parseDouble(splitLine[3]);

                this.sisendid.add(extractSisend(minX, maxX));
                if (vabaliige == 0) {
                    vorrandid.add(new SirgeVorrand(kordaja));
                } else {
                    vorrandid.add(new SirgeVorrandVaba(kordaja, vabaliige));
                }

            }
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }

    public Double[] extractSisend(double minX, double maxX) {
        Double[] valjund = new Double[(int) (Math.abs(minX) + Math.abs(maxX)) + 1];
        for (int i = 0; i < valjund.length; ++i) {
            valjund[i] = minX + i;
        }
        return valjund;
    }

    public ArrayList<Double[]> arvuta() {
        if (vorrandid.size() > 0) {
            for (int i = 0; i < this.vorrandid.size(); ++i) {
                Double[] sisend = this.sisendid.get(i);
                this.vastused.add(this.vorrandid.get(i).arvuta(sisend));
            }
        }
        return this.vastused;
    }

    public ArrayList<Double[]> getSisendid() {
        return this.sisendid;
    }

}
