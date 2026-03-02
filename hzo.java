import java.util.List;

final class hzo extends ibur implements ibtw {
    final List a;

    public hzo(List list0) {
        this.a = list0;
        super(2);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if(((goz)object0).ad((v & 3) != 2, v & 1)) {
            List list0 = this.a;
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                ibtw ibtw0 = (ibtw)list0.get(v2);
                long v3 = gol.c(((goz)object0));
                ibth ibth0 = iej.b;
                ((goz)object0).O();
                if(((goz)object0).ab()) {
                    ((goz)object0).t(ibth0);
                }
                else {
                    ((goz)object0).T();
                }
                int v4 = (int)(v3 ^ v3 >>> 0x20);
                ibtw ibtw1 = iej.f;
                if(((goz)object0).ab() || !ibuq.m(((goz)object0).k(), Integer.valueOf(v4))) {
                    Integer integer0 = v4;
                    ((goz)object0).R(integer0);
                    ((goz)object0).p(integer0, ibtw1);
                }
                ibtw0.a(((goz)object0), Integer.valueOf(0));
                ((goz)object0).z();
            }
            return ibom.a;
        }
        ((goz)object0).G();
        return ibom.a;
    }
}

