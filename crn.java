public final class crn {
    public static final void a(hfc hfc0, ibts ibts0, goz goz0, int v) {
        goz goz1 = goz0.ao(0xC8660B92);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x20 : 16);
        }
        if(goz1.ad((v1 & 19) != 18, v1 & 1)) {
            dlv.a(hhm.a(hfc0, ibts0), goz1);
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new crm(hfc0, ibts0, v);
        }
    }
}

