import java.util.List;

public final class ftul implements ibts {
    public final ftuw a;
    public final List b;
    public final ibvb c;
    public final int d;
    public final long e;

    public ftul(ftuw ftuw0, List list0, ibvb ibvb0, int v, long v1) {
        this.a = ftuw0;
        this.b = list0;
        this.c = ibvb0;
        this.d = v;
        this.e = v1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ibp)object0), "$this$layout");
        List list0 = this.b;
        ibvb ibvb0 = this.c;
        int v = this.d;
        long v1 = this.e;
        switch(this.a.f.ordinal()) {
            case 0: {
                for(Object object1: list0) {
                    ibp.A(((ibp)object0), ((ibq)object1), ibvb0.a, 0);
                    ibvb0.a += ((ibq)object1).a + v;
                }
                return ibom.a;
            }
            case 1: {
                ibvb0.a = jkp.b(v1);
                for(Object object2: ibpo.am(list0)) {
                    ibp.A(((ibp)object0), ((ibq)object2), ibvb0.a - ((ibq)object2).a, 0);
                    ibvb0.a -= ((ibq)object2).a + v;
                }
                return ibom.a;
            }
            case 2: {
                if(list0.size() == 1) {
                    ibp.A(((ibp)object0), ((ibq)list0.get(0)), (jkp.b(v1) - ((ibq)list0.get(0)).a) / 2, 0);
                    return ibom.a;
                }
                int v2 = jkp.b(v1) >> 1;
                ibp.A(((ibp)object0), ((ibq)list0.get(0)), v2 - ((ibq)list0.get(0)).a - v / 2, 0);
                ibp.A(((ibp)object0), ((ibq)list0.get(1)), v2 + v / 2, 0);
                return ibom.a;
            }
            case 3: {
                ibp.A(((ibp)object0), ((ibq)list0.get(0)), 0, 0);
                if(list0.size() > 1) {
                    ibp.A(((ibp)object0), ((ibq)list0.get(1)), jkp.b(v1) - ((ibq)list0.get(1)).a, 0);
                    return ibom.a;
                }
                return ibom.a;
            }
            default: {
                throw new ibnq();
            }
        }
    }
}

