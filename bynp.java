import java.util.List;

final class bynp implements ibtx {
    final List a;
    final ibts b;

    public bynp(List list0, ibts ibts0) {
        this.a = list0;
        this.b = ibts0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$CredentialContainerCard");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        List list0 = this.a;
        ibts ibts0 = this.b;
        iau iau0 = dii.a(dho.g(2.0f), hei.m, ((goz)object1), 6);
        long v1 = gol.c(((goz)object1));
        gzk gzk0 = ((goz)object1).ap();
        hfc hfc0 = hew.c(((goz)object1), hfc.e);
        ibth ibth0 = iej.a;
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth0);
        }
        else {
            ((goz)object1).T();
        }
        int v2 = (int)(v1 ^ v1 >>> 0x20);
        guo.b(((goz)object1), iau0, iej.e);
        guo.b(((goz)object1), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v2))) {
            Integer integer0 = v2;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw0);
        }
        guo.a(((goz)object1), iej.g);
        guo.b(((goz)object1), hfc0, iej.c);
        ((goz)object1).M(0x8BE842CD);
        for(Object object3: list0) {
            bynx bynx0 = (bynx)object3;
            ((goz)object1).M(-1633490746);
            int v3 = ((goz)object1).X(ibts0) | ((goz)object1).Z(bynx0);
            Object object4 = ((goz)object1).k();
            if(v3 != 0 || object4 == gop.a) {
                object4 = new byno(ibts0, bynx0);
                ((goz)object1).R(object4);
            }
            ((goz)object1).A();
            bynr.c(bynx0, ((ibth)object4), ((goz)object1), 0);
        }
        ((goz)object1).A();
        ((goz)object1).z();
        return ibom.a;
    }
}

