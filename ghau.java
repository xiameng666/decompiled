import java.math.BigDecimal;

public final class ghau {
    public static final int a;

    static {
        ggxr.e(2.0 - ggxv.b);
        new BigDecimal("0.25");
        new BigDecimal("0.5");
        new BigDecimal("2");
        new BigDecimal("4");
    }

    public static int a(ghae ghae0, ghae ghae1, ghae ghae2) {
        double f = ghae.i(ghae2, ghae0, ghae1);
        if((f >= 1.600000E-15)) {
            return 1;
        }
        int v = f <= -0.0 ? -1 : 0;
        return v == 0 ? ghat.b(ghae0, ghae1, ghae2) : v;
    }

    public static boolean b(ghae ghae0, ghae ghae1, ghae ghae2, ghae ghae3) {
        int v = ghau.a(ghae1, ghae3, ghae0) < 0 ? 0 : 1;
        if(ghau.a(ghae2, ghae3, ghae1) >= 0) {
            ++v;
        }
        if(ghau.a(ghae0, ghae3, ghae2) > 0) {
            ++v;
        }
        return v >= 2;
    }
}

