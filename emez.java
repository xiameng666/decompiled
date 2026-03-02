import java.util.function.ToIntFunction;

public final class emez implements ToIntFunction {
    @Override
    public final int applyAsInt(Object object0) {
        gzra gzra0 = ((gzrd)object0).g;
        if(gzra0 == null) {
            gzra0 = gzra.a;
        }
        if(gzra0.b == 1) {
            gzra gzra1 = ((gzrd)object0).g;
            if(gzra1 == null) {
                gzra1 = gzra.a;
            }
            return gzra1.b == 1 ? ((hgvd)gzra1.c).c : hgvd.a.c;
        }
        return 0;
    }
}

