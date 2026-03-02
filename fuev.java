import java.util.List;

public final class fuev implements ibts {
    public final List a;
    public final int b;

    public fuev(List list0, int v) {
        this.a = list0;
        this.b = v;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ibp)object0), "$this$layout");
        int v = 0;
        for(Object object1: this.a) {
            ibp.A(((ibp)object0), ((ibq)object1), 0, v);
            v += ((ibq)object1).b + this.b;
        }
        return ibom.a;
    }
}

