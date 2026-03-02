public final class zzi {
    public static final void a(znx znx0, hfc hfc0, goz goz0, int v) {
        ibuq.f(znx0, "listPreview");
        goz goz1 = goz0.ao(-420821401);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(znx0) : goz1.Z(znx0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            dig.a(dls.e(hfc0, 36.0f), null, false, gzf.e(0xBC991BD1, new zzh(znx0), goz1), goz1, 0xC00, 6);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new zze(znx0, hfc0, v);
        }
    }
}

