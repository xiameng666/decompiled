public final class iar {
    public static final void a(ibtx ibtx0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x1A55E779);
        boolean z = true;
        int v1 = (v & 6) == 0 ? (goz1.Z(ibtx0) ? 4 : 2) | v : v;
        if((v1 & 3) == 2) {
            z = false;
        }
        if(goz1.ad(z, v1 & 1)) {
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = new iam();
                goz1.P(object0);
            }
            Object object2 = goz1.j();
            if(object2 == object1) {
                object2 = ian.a;
                goz1.P(object2);
            }
            goz1.O();
            if(goz1.x) {
                goz1.t(((ibth)object2));
            }
            else {
                goz1.T();
            }
            iao iao0 = iao.a;
            if(goz1.x) {
                gum gum0 = new gum(iao0);
                goz1.p(ibom.a, gum0);
            }
            guo.b(goz1, ((iam)object0), iap.a);
            ibtx0.a(((iam)object0), goz1, Integer.valueOf(v1 << 3 & 0x70));
            goz1.z();
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new iaq(ibtx0, v);
        }
    }
}

