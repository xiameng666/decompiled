import java.util.List;

public final class ftuj implements ibts {
    public final boolean a;
    public final List b;
    public final int c;
    public final long d;

    public ftuj(boolean z, List list0, int v, long v1) {
        this.a = z;
        this.b = list0;
        this.c = v;
        this.d = v1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ibp)object0), "$this$layout");
        List list0 = this.b;
        int v = this.c;
        int v1 = 0;
        if(this.a) {
            int v2 = 0;
            for(Object object1: list0) {
                ibp.A(((ibp)object0), ((ibq)object1), v2, 0);
                v2 += ((ibq)object1).a + v;
            }
            return ibom.a;
        }
        for(Object object2: ibpo.am(list0)) {
            ibp.A(((ibp)object0), ((ibq)object2), (jkp.b(this.d) - ((ibq)object2).a) / 2, v1);
            v1 += ((ibq)object2).b + v;
        }
        return ibom.a;
    }
}

