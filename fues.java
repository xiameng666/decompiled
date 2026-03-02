import java.util.List;

public final class fues implements ibts {
    public final List a;
    public final int b;
    public final ibq c;
    public final int d;

    public fues(List list0, int v, ibq ibq0, int v1) {
        this.a = list0;
        this.b = v;
        this.c = ibq0;
        this.d = v1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ibp)object0), "$this$layout");
        int v = 0;
        for(Object object1: this.a) {
            ibp.A(((ibp)object0), ((ibq)object1), 0, v);
            v += ((ibq)object1).b + this.b;
        }
        ibq ibq0 = this.c;
        if(ibq0.b > 0) {
            ibp.A(((ibp)object0), ibq0, 0, v - this.d);
        }
        return ibom.a;
    }
}

