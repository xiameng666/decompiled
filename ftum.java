import java.util.Iterator;
import java.util.List;

public final class ftum implements ibts {
    public final List a;
    public final ftuw b;
    public final long c;
    public final ibvb d;
    public final int e;

    public ftum(List list0, ftuw ftuw0, long v, ibvb ibvb0, int v1) {
        this.a = list0;
        this.b = ftuw0;
        this.c = v;
        this.d = ibvb0;
        this.e = v1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        int v1;
        ibuq.f(((ibp)object0), "$this$layout");
        Iterator iterator0 = ibpo.am(this.a).iterator();
        while(iterator0.hasNext()) {
            long v = this.c;
            Object object1 = iterator0.next();
            ibq ibq0 = (ibq)object1;
            switch(this.b.f.ordinal()) {
                case 0: {
                    v1 = 0;
                    break;
                }
                case 1: {
                    v1 = jkp.b(v) - ibq0.a;
                    break;
                }
                default: {
                    v1 = (jkp.b(v) - ibq0.a) / 2;
                }
            }
            ibp.A(((ibp)object0), ibq0, v1, this.d.a);
            this.d.a += ibq0.b + this.e;
        }
        return ibom.a;
    }
}

