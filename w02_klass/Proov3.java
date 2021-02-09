public class Proov3 {
    public static void main(String[] args) {
        Retsept pannkoogid = new Retsept();
        pannkoogid.lisa("Piim", 500.0);
        pannkoogid.lisa("Jahu", 250.0);
        pannkoogid.lisa("Muna", 100.0);
        pannkoogid.lisa("V6i", 250.0);
        pannkoogid.lisa("V6i", 100.0);
        Retsept pannkoogid600 = pannkoogid.soovitudMassigaKoopia(600);
        Retsept pannkoogid300 = pannkoogid.soovitudMassigaKoopia(300);

        System.out.println(pannkoogid.kysiAinenimed());
        System.out.println(pannkoogid.kogumass());
        System.out.println(pannkoogid.kysiAined());
        System.out.println(pannkoogid600.kogumass());
        System.out.println(pannkoogid600.kysiAined());
        System.out.println(pannkoogid300.kogumass());
        System.out.println(pannkoogid300.kysiAined());

    }
}