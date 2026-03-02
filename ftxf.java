public final class ftxf {
    public static final void a(hfc hfc0, ftxi ftxi0, goz goz0, int v, int v1) {
        int v2;
        ibuq.f(ftxi0, "state");
        goz goz1 = goz0.ao(510152700);
        if(v1 == 0) {
            v2 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(ftxi0) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            if(v1 != 0) {
                hfc0 = hfc.e;
            }
            fhvp[] arr_fhvp = (fhvp[])ftxi0.m.toArray(new fhvp[0]);
            gze gze0 = gzf.e(0xF809B22E, new ftxe(ftxi0, hfc0), goz1);
            fugo.b(ftxi0.l, arr_fhvp, null, gze0, goz1, 0xC00, 4);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ftww(hfc0, ftxi0, v, v1);
        }
    }
}

