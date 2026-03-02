import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class aiyt implements gfsi {
    public final gfsx a;
    public final List b;
    public final AtomicBoolean c;

    public aiyt(gfsx gfsx0, List list0, AtomicBoolean atomicBoolean0) {
        this.a = gfsx0;
        this.b = list0;
        this.c = atomicBoolean0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ajbz)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ajbz)object0))));
        gfsx gfsx0 = this.a;
        if(gfsx0.i()) {
            Object object1 = gfsx0.d();
            int v = ajbt.a(((ajbz)object0).d);
            if(v == 0) {
                v = 1;
            }
            List list0 = aizr.p(((ajbz)object0), ((String)object1), this.b, v, aizo.a);
            aizr.s(hftp0, ((String)gfsx0.d()), list0);
            this.c.set(true);
        }
        return (ajbz)hftp0.N_build();
    }
}

