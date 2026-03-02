final class ddhk implements ibtx {
    final String a;
    final fzm b;

    public ddhk(String s, fzm fzm0) {
        this.a = s;
        this.b = fzm0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        goz goz0 = (goz)object1;
        int v = ((Number)object2).intValue();
        ibuq.f(((dkd)object0), "$this$FlowRow");
        if((v & 17) == 16 && goz0.ac()) {
            goz0.G();
            return ibom.a;
        }
        goz0.M(0x333D5FF0);
        String s = this.a;
        if(s != null) {
            goz0.M(5004770);
            fzm fzm0 = this.b;
            boolean z = goz0.X(fzm0);
            Object object3 = goz0.k();
            if(z || object3 == gop.a) {
                object3 = new ddhh(fzm0);
                goz0.R(object3);
            }
            goz0.A();
            fcm.d(((ibth)object3), null, false, null, null, null, gzf.e(0x7B57F84F, new ddhj(s), goz0), goz0, 0x30000000, 510);
            goz0 = goz0;
        }
        goz0.A();
        fzm fzm1 = this.b;
        if(fzm1.a.c) {
            hfc hfc0 = dls.k(hfc.e, 20.0f);
            goz0.M(5004770);
            boolean z1 = goz0.X(fzm1);
            Object object4 = goz0.k();
            if(z1 || object4 == gop.a) {
                object4 = new ddhi(fzm1);
                goz0.R(object4);
            }
            goz0.A();
            fisl.a(((ibth)object4), hfc0, false, null, null, ddcz.a, goz0, 0x180030, 60);
        }
        return ibom.a;
    }
}

