import java.util.Map;

public final class dcsf implements icig {
    final icig[] a;
    final dcsh b;
    final long c;
    final Map d;

    public dcsf(icig[] arr_icig, dcsh dcsh0, long v, Map map0) {
        this.a = arr_icig;
        this.b = dcsh0;
        this.c = v;
        this.d = map0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        dcsd dcsd0 = new dcsd(this.a);
        dcse dcse0 = new dcse(null, this.b, this.c, this.d);
        Object object0 = icor.a(icih0, this.a, dcsd0, dcse0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

