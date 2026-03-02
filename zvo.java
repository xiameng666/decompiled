public final class zvo {
    public static final void a(hfc hfc0, ibtw ibtw0, goz goz0, int v) {
        ibuq.f(ibtw0, "content");
        goz goz1 = goz0.ao(1210559847);
        int v1 = 1;
        int v2 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v2 |= (goz1.U(16.0f) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= (goz1.U(8.0f) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v2 |= (goz1.Z(ibtw0) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
        }
        else {
            goz1.M(0x97EA02AA);
            if((v2 & 0x1C00) != 0x800) {
                v1 = 0;
            }
            Object object0 = goz1.j();
            if((v1 | (((v2 & 0x70) == 0x20 ? 1 : 0) | ((v2 & 0x380) == 0x100 ? 1 : 0))) != 0 || object0 == gop.a) {
                object0 = new zvj(ibtw0);
                goz1.P(object0);
            }
            goz1.x();
            icl.a(hfc0, ((ibtw)object0), goz1, v2 & 14, 0);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new zvk(hfc0, ibtw0, v);
        }
    }
}

