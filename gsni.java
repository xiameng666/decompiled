public final class gsni implements gphn {
    public static final fokg a;
    public static final gphl b;
    public static final gphl c;
    public static final gsni d;
    public final ggfp e;
    private static final fokg f;
    private static final fokg g;
    private final ggeo h;

    static {
        gsni.a = new fokg("google.internal.maps.geomobileservices.geocoding.v3mobile.GeocodingService.");
        gsni.f = new fokg("google.internal.maps.geomobileservices.geocoding.v3mobile.GeocodingService/");
        gsni.b = new gsng();
        gsni.c = new gsnh();
        gsni.d = new gsni();
        gsni.g = new fokg("geomobileservices-pa.googleapis.com");
    }

    private gsni() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("geomobileservices-pa.googleapis.com");
        ggdy0.h();
        this.e = new ggfn().h();
        ggfp.K(gsni.b, gsni.c);
        ggek ggek0 = new ggek();
        ggek0.i("Geocode", gsni.b);
        ggek0.i("ReverseGeocode", gsni.c);
        this.h = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return gsni.g;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = gsni.f.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.h.containsKey(s2) ? ((gphl)this.h.get(s2)) : null;
        }
        return null;
    }
}

