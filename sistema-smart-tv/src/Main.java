

public class Main {
    public static void main(String[] args) {

        SmartTv tv = new SmartTv();

        tv.ligarTv();
        tv.escolherCanal(41);
        for (int i = 0; i < 7; i++) {
            tv.aumentarVolume();
        }

        System.out.println(tv);

    }
}