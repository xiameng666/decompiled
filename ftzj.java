import java.util.List;

public final class ftzj implements ibts {
    public final List a;
    public final int b;
    public final gra c;

    public ftzj(List list0, int v, gra gra0) {
        this.a = list0;
        this.b = v;
        this.c = gra0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ibp)object0), "$this$layout");
        List list0 = this.a;
        int v = 0;
        if(ftzl.a(this.c)) {
            int v1 = 0;
            for(Object object1: list0) {
                ibp.A(((ibp)object0), ((ibq)object1), 0, v1);
                v1 = v1 + ((ibq)object1).b + jkr.f(((ibp)object0), 0.0f);
            }
            return ibom.a;
        }
        for(Object object2: list0) {
            ibp.A(((ibp)object0), ((ibq)object2), v, (this.b - ((ibq)object2).b) / 2);
            v = v + ((ibq)object2).a + jkr.f(((ibp)object0), 8.0f);
        }
        return ibom.a;
    }
}

