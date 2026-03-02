import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dxda {
    public final edoq a;
    public final dvfy b;
    public final dmkl c;

    public dxda(edoq edoq0, dvfy dvfy0, dmkl dmkl0) {
        this.a = edoq0;
        this.b = dvfy0;
        this.c = dmkl0;
    }

    public static guac a(Valuable valuable0) {
        for(Object object0: valuable0.o().c) {
            gucn gucn0 = (gucn)object0;
            int v = gucn0.b;
            if(gucm.a(v) == gucm.a) {
                for(Object object1: (v == 1 ? ((gucl)gucn0.c) : gucl.a).d) {
                    guau guau0 = (guau)object1;
                    int v1 = guau0.c;
                    if(guat.a(v1) == guat.a) {
                        for(Object object2: (v1 == 2 ? ((guam)guau0.d) : guam.a).b) {
                            guay guay0 = (guay)object2;
                            if(guax.a(guay0.c) == guax.b && ((guay0.c == 4 ? ((gtzz)guay0.d) : gtzz.a).b & 1) != 0) {
                                guac guac0 = (guay0.c == 4 ? ((gtzz)guay0.d) : gtzz.a).d;
                                return guac0 == null ? guac.b : guac0;
                            }
                        }
                    }
                }
            }
        }
        return guac.b;
    }
}

