import java.util.List;

public final class deli implements ibtw {
    public final List a;
    public final ibth b;
    public final boolean c;
    public final int d;

    public deli(List list0, ibth ibth0, boolean z, int v) {
        this.a = list0;
        this.b = ibth0;
        this.c = z;
        this.d = v;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        demb.h(this.a, this.b, this.c, ((goz)object0), gsc.a(this.d | 1));
        return ibom.a;
    }
}

