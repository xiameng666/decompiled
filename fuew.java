import java.util.List;

public final class fuew implements ibts {
    public final List a;
    public final int b;
    public final long c;

    public fuew(List list0, int v, long v1) {
        this.a = list0;
        this.b = v;
        this.c = v1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibp ibp0 = (ibp)object0;
        ibuq.f(ibp0, "$this$layout");
        ibp.A(ibp0, ((ibq)this.a.get(0)), 0, 0);
        ibp.A(ibp0, ((ibq)this.a.get(1)), 0, Math.max(((ibq)this.a.get(0)).b, ((ibq)this.a.get(2)).b) + this.b);
        ibq ibq0 = (ibq)this.a.get(2);
        int v = ((ibq)this.a.get(2)).a;
        ibp.A(ibp0, ibq0, jkp.b(this.c) - v, 0);
        ibq ibq1 = (ibq)this.a.get(3);
        int v1 = ((ibq)this.a.get(3)).a;
        int v2 = Math.max(((ibq)this.a.get(0)).b, ((ibq)this.a.get(2)).b) + this.b;
        ibp.A(ibp0, ibq1, jkp.b(this.c) - v1, v2);
        return ibom.a;
    }
}

