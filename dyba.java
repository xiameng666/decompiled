import java.util.Iterator;

public final class dyba implements gfsi {
    public final String a;
    public final kar b;

    public dyba(String s, kar kar0) {
        this.a = s;
        this.b = kar0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((dydv)object0) == null) {
            return gfqx.a;
        }
        ggdy ggdy0 = new ggdy();
        gfsx gfsx0 = gfqx.a;
        ggdy ggdy1 = new ggdy();
        int v = 0;
        Iterator iterator0 = ((dydv)object0).b.iterator();
        while(iterator0.hasNext()) {
            String s = this.a;
            Object object1 = iterator0.next();
            dydu dydu0 = (dydu)object1;
            if(dydu0.b == 2 && ((dydp)dydu0.c).c.equals(s) && dydt.b(dydu0.d) == 3) {
                ggdy0.i(Long.valueOf((dydu0.b == 2 ? ((dydp)dydu0.c) : dydp.a).d));
            }
            if(dydu0.b == 3 && ((dydr)dydu0.c).c.equals(s) && dydt.b(dydu0.d) == 4) {
                gfsd gfsd0 = dyav.a.ic();
                dydr dydr0 = dydu0.b == 3 ? ((dydr)dydu0.c) : dydr.a;
                gfsx0 = gfsx.m(((guvs)gfsd0.kt((dydq.b(dydr0.d) == null ? dydq.c : dydq.b(dydr0.d)))));
            }
            if(dydu0.b == 4 && ((dydo)dydu0.c).c.equals(s) && dydt.b(dydu0.d) == 5) {
                ggdy1.k((dydu0.b == 4 ? ((dydo)dydu0.c) : dydo.a).d);
            }
            v |= (dydu0.b != 6 || !((dyds)dydu0.c).c.equals(s) || dydt.b(dydu0.d) != 7 ? 0 : 1);
        }
        Object object2 = gfsx.m(new dybm(ggdy0.h(), gfsx0, ggdy1.h(), ((boolean)v)));
        this.b.accept(object2);
        return object2;
    }
}

