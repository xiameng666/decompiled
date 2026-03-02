public final class bylg {
    public static final void a(String s, String s1, ibth ibth0, ibth ibth1, goz goz0, int v) {
        ibuq.f(s, "title");
        ibuq.f(s1, "body");
        ibuq.f(ibth0, "onDismiss");
        ibuq.f(ibth1, "onRemoteEntryClicked");
        goz goz1 = goz0.ao(-842760019);
        int v1 = 1;
        int v2 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v2 |= (goz1.X(s1) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v2 |= (goz1.Z(ibth1) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
        }
        else {
            goz1.M(-1224400529);
            if((v2 & 0x1C00) != 0x800) {
                v1 = 0;
            }
            Object object0 = goz1.j();
            if((((v2 & 14) == 4 ? 1 : 0) | ((v2 & 0x70) == 0x20 ? 1 : 0) | ((v2 & 0x380) == 0x100 ? 1 : 0) | v1) != 0 || object0 == gop.a) {
                object0 = new bykz(s, s1, ibth1, ibth0);
                goz1.P(object0);
            }
            goz1.x();
            byjd.a(null, null, null, ((ibts)object0), goz1, 0, 7);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new byla(s, s1, ibth0, ibth1, v);
        }
    }
}

