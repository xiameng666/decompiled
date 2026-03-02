final class ddhq implements ibtw {
    final String a;
    final jlm b;
    final gra c;
    final fzm d;

    public ddhq(String s, jlm jlm0, fzm fzm0, gra gra0) {
        this.a = s;
        this.b = jlm0;
        this.d = fzm0;
        this.c = gra0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        String s = this.a;
        hey hey0 = hfc.e;
        float f = 0.0f;
        float f1 = s == null ? 0.0f : dla.a(fiqq.b, this.b);
        hfc hfc0 = dla.f(hey0, 24.0f, 18.0f - (s == null ? 0.0f : ((dle)fiqq.b).a + 6.0f), 24.0f - f1, 18.0f - (s == null ? 0.0f : ((dle)fiqq.b).b + 6.0f));
        fzm fzm0 = this.d;
        jlm jlm0 = this.b;
        gra gra0 = this.c;
        iau iau0 = dll.b(dho.a, hei.k, ((goz)object0), 0x30);
        long v = gol.c(((goz)object0));
        gzk gzk0 = ((goz)object0).ap();
        hfc hfc1 = hew.c(((goz)object0), hfc0);
        ibth ibth0 = iej.a;
        ((goz)object0).O();
        if(((goz)object0).ab()) {
            ((goz)object0).t(ibth0);
        }
        else {
            ((goz)object0).T();
        }
        int v1 = (int)(v ^ v >>> 0x20);
        guo.b(((goz)object0), iau0, iej.e);
        guo.b(((goz)object0), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object0).ab() || !ibuq.m(((goz)object0).k(), Integer.valueOf(v1))) {
            Integer integer0 = v1;
            ((goz)object0).R(integer0);
            ((goz)object0).p(integer0, ibtw0);
        }
        guo.a(((goz)object0), iej.g);
        guo.b(((goz)object0), hfc1, iej.c);
        String s1 = fzm0.a.a;
        jbn jbn0 = fpu.d(((goz)object0)).k;
        long v2 = fpu.a(((goz)object0)).v;
        if(s == null) {
            s = null;
        }
        else {
            f = 16.0f - dla.b(fiqq.b, jlm0);
        }
        hfc hfc2 = dla.j(hey0, 0.0f, 0.0f, f, 0.0f, 11);
        ((goz)object0).M(5004770);
        Object object2 = ((goz)object0).k();
        Object object3 = gop.a;
        if(object2 == object3) {
            object2 = new ddhm(gra0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        fiuk.b(s1, hfc2, v2, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((ibts)object2), jbn0, ((goz)object0), 0, 0x180000, 0xFFF8);
        ((goz)object0).M(0xC5B5BD5C);
        if(s != null) {
            ((goz)object0).M(5004770);
            boolean z = ((goz)object0).X(fzm0);
            Object object4 = ((goz)object0).k();
            if(z || object4 == object3) {
                object4 = new ddhn(fzm0);
                ((goz)object0).R(object4);
            }
            ((goz)object0).A();
            fcm.d(((ibth)object4), null, false, null, null, null, gzf.e(0x2D6761EA, new ddhp(s, gra0), ((goz)object0)), ((goz)object0), 0x30000000, 510);
        }
        ((goz)object0).A();
        ((goz)object0).z();
        return ibom.a;
    }
}

