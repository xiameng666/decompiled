import java.util.List;

final class bveo implements ibtx {
    final List a;

    public bveo(List list0) {
        this.a = list0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$Category");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        float f = clua.a() ? 0.0f : cltw.e;
        hfc hfc0 = dla.e(hfc.e, f, 0.0f);
        ((goz)object1).M(5004770);
        List list0 = this.a;
        boolean z = ((goz)object1).Z(list0);
        Object object3 = ((goz)object1).k();
        if(z || object3 == gop.a) {
            object3 = new bven(list0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        hfc hfc1 = iuc.d(hfc0, ((ibts)object3));
        iau iau0 = dii.a(dho.g(2.0f), hei.m, ((goz)object1), 6);
        long v1 = gol.c(((goz)object1));
        gzk gzk0 = ((goz)object1).ap();
        hfc hfc2 = hew.c(((goz)object1), hfc1);
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
        guo.b(((goz)object1), hfc2, iej.c);
        ((goz)object1).M(995806678);
        for(Object object4: list0) {
            ((eopy)object4).a(((goz)object1), 0x40);
        }
        ((goz)object1).A();
        ((goz)object1).z();
        return ibom.a;
    }
}

