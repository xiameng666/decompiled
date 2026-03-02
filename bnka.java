public final class bnka {
    public static final bboh a;

    static {
        bnka.a = bboh.b("BackendServiceUtil", bbcu.eD);
    }

    public static gmcd a(gmcd gmcd0, String s) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/findmydevice/spot/backend/BackendServiceUtil", "wrapRequest", 27, s)) {
            gdqb0.a(gmcd0);
        }
        gdta gdta0 = gdta.g(gmcd0).h(new bnjw(), gmap.a);
        bnjx bnjx0 = new bnjx(s);
        gdta gdta1 = gdta0.f(acse.class, bnjx0, gmap.a);
        bnjy bnjy0 = new bnjy(s);
        gdta gdta2 = gdta1.f(iapl.class, bnjy0, gmap.a);
        bnjz bnjz0 = new bnjz(s);
        return gdta2.f(iapn.class, bnjz0, gmap.a);
    }
}

