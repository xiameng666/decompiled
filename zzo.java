public final class zzo {
    public static final void a(zny zny0, hfc hfc0, goz goz0, int v) {
        ibuq.f(zny0, "profilePicture");
        goz goz1 = goz0.ao(979930132);
        if(((((v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(zny0) : goz1.Z(zny0)) ? 4 : 2) | v : v) | 0x30) & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc0 = hfc.e;
            hfc hfc1 = dls.k(hfc0, 60.0f);
            aaco.a(zny0.a, zny0.b, hfc1, false, null, false, false, goz1, 0, 120);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new zzn(zny0, hfc0, v);
        }
    }
}

