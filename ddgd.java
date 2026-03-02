import java.util.Map;

public final class ddgd implements ibtw {
    public final iwj a;
    public final hfc b;
    public final long c;
    public final Map d;
    public final jbn e;
    public final float f;

    public ddgd(iwj iwj0, hfc hfc0, long v, Map map0, jbn jbn0, float f) {
        this.a = iwj0;
        this.b = hfc0;
        this.c = v;
        this.d = map0;
        this.e = jbn0;
        this.f = f;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        boolean z;
        hfc hfc1;
        long v4;
        long v3;
        ibuq.f(((icr)object0), "$this$SubcomposeLayout");
        iwj iwj0 = this.a;
        hfc hfc0 = this.b;
        long v = this.c;
        Map map0 = this.d;
        jbn jbn0 = this.e;
        int v1 = ((ias)((icr)object0).q("text_for_measurement", new gze(0xCE210BA4, true, new ddgk(iwj0, hfc0, v, map0, jbn0))).get(0)).b(0);
        long v2 = ((jkp)object1).a;
        if(v1 > jkp.b(v2)) {
            v3 = v2;
            v4 = v;
            hfc1 = hfc0;
            z = true;
        }
        else {
            v3 = v2;
            v4 = v;
            hfc1 = hfc0;
            z = false;
        }
        ibq ibq0 = ((ias)((icr)object0).q("main_content", new gze(-1698096856, true, new ddgj(z, hfc1, this.f, iwj0, v4, map0, jbn0))).get(0)).e(v3);
        return iaw.b(((icr)object0), ibq0.a, ibq0.b, new ddgh(ibq0));
    }
}

