import android.util.Size;
import j..util.Objects;

public final class bbf {
    public static final bkj a;
    private static final Size b;
    private static final bat c;
    private static final btu d;

    static {
        Size size0 = new Size(640, 480);
        bbf.b = size0;
        bat bat0 = bat.b;
        bbf.c = bat0;
        btv btv0 = new btv(bri.b);
        btu btu0 = new btu(btt.a, btv0);
        bbf.d = btu0;
        bbe bbe0 = new bbe();
        blb blb0 = bbe0.a;
        blb0.c(bko.L, size0);
        blb0.c(bnc.s, Integer.valueOf(1));
        blb0.c(bko.G, Integer.valueOf(0));
        blb0.c(bko.O, btu0);
        if(!Objects.equals(bat.b, bat0)) {
            throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
        }
        blb0.c(bkm.F, bat0);
        bbf.a = bbe0.c();
    }
}

