public final class gskj implements gphn {
    public static final fokg a;
    public static final gphl b;
    public static final gphl c;
    public static final gphl d;
    public static final gphl e;
    public static final gphl f;
    public static final gskj g;
    public final ggfp h;
    private static final fokg i;
    private static final fokg j;
    private final ggeo k;

    static {
        gskj.a = new fokg("google.internal.locationhistoryplacedetails.v1.PlaceInfoService.");
        gskj.i = new fokg("google.internal.locationhistoryplacedetails.v1.PlaceInfoService/");
        gskj.b = new gske();
        gskj.c = new gskf();
        gskj.d = new gskg();
        gskj.e = new gskh();
        gskj.f = new gski();
        gskj.g = new gskj();
        gskj.j = new fokg("locationhistoryplacedetails-pa.googleapis.com");
    }

    private gskj() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("autopush-locationhistoryplacedetails-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("autopush-locationhistoryplacedetails-pa.sandbox.googleapis.com");
        ggdy0.i("locationhistoryplacedetails-pa.mtls.googleapis.com");
        ggdy0.i("staging-locationhistoryplacedetails-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("staging-locationhistoryplacedetails-pa.sandbox.googleapis.com");
        ggdy0.i("locationhistoryplacedetails-pa.googleapis.com");
        ggdy0.h();
        this.h = new ggfn().h();
        ggfp.N(gskj.b, gskj.c, gskj.d, gskj.e, gskj.f);
        ggek ggek0 = new ggek();
        ggek0.i("GetEncryptedPlaceIndexL1", gskj.b);
        ggek0.i("GetEncryptedPlaceIndexL2", gskj.c);
        ggek0.i("GetEndorsedEvidenceL1", gskj.d);
        ggek0.i("GetEndorsedEvidenceL2", gskj.e);
        ggek0.i("ListPppPlaces", gskj.f);
        this.k = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return gskj.j;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = gskj.i.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.k.containsKey(s2) ? ((gphl)this.k.get(s2)) : null;
        }
        return null;
    }
}

