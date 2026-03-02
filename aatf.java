import java.util.ArrayList;

public final class aatf implements aatd {
    private static final ggfp a;

    static {
        aatf.a = ggfp.O(gqow.o, gqow.j, gqow.q, gqow.r, gqow.d, gqow.c, new gqow[]{gqow.g, gqow.h, gqow.k});
    }

    @Override  // aatd
    public final boolean a(aath aath0) {
        gryt gryt0 = aath0.b;
        if(grys.a(gryt0.f) != 3) {
            return true;
        }
        hfug hfug0 = gryt.a;
        if(new hfuh(gryt0.h, hfug0).isEmpty()) {
            return true;
        }
        ArrayList arrayList0 = new ArrayList(new hfuh(gryt0.h, hfug0));
        arrayList0.removeAll(aatf.a);
        return !arrayList0.isEmpty();
    }
}

