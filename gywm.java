public final class gywm implements gphn {
    public static final fokg a;
    public static final gphl b;
    public static final gphl c;
    public static final gphl d;
    public static final gphl e;
    public static final gphl f;
    public static final gphl g;
    public static final gphl h;
    public static final gphl i;
    public static final gphl j;
    public static final gphl k;
    public static final gywm l;
    public final ggfp m;
    private static final fokg n;
    private static final fokg o;
    private final ggeo p;

    static {
        gywm.a = new fokg("location.nearby.presence.v1.NearbyPresenceService.");
        gywm.n = new fokg("location.nearby.presence.v1.NearbyPresenceService/");
        gywm.b = new gywd();
        gywm.c = new gywe();
        gywm.d = new gywf();
        gywm.e = new gywg();
        gywm.f = new gywh();
        gywm.g = new gywi();
        gywm.h = new gywj();
        gywm.i = new gywk();
        gywm.j = new gywl();
        gywm.k = new gywc();
        gywm.l = new gywm();
        gywm.o = new fokg("nearbypresence-pa.googleapis.com");
    }

    private gywm() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("autopush-nearbypresence-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("autopush-nearbypresence-pa.sandbox.googleapis.com");
        ggdy0.i("nearbypresence-pa.mtls.googleapis.com");
        ggdy0.i("staging-nearbypresence-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("staging-nearbypresence-pa.sandbox.googleapis.com");
        ggdy0.i("nearbypresence-pa.googleapis.com");
        ggdy0.h();
        this.m = new ggfn().h();
        ggfp.O(gywm.b, gywm.c, gywm.d, gywm.e, gywm.f, gywm.g, new gphl[]{gywm.h, gywm.i, gywm.j, gywm.k});
        ggek ggek0 = new ggek();
        ggek0.i("UpdateDevice", gywm.b);
        ggek0.i("ListContactPeople", gywm.c);
        ggek0.i("ListPublicCertificates", gywm.d);
        ggek0.i("FindMyDusi", gywm.e);
        ggek0.i("ListMyDevices", gywm.f);
        ggek0.i("NotifyMyDevices", gywm.g);
        ggek0.i("ListSharedCredentials", gywm.h);
        ggek0.i("UploadNearbyDevice", gywm.i);
        ggek0.i("DeleteMyDevice", gywm.j);
        ggek0.i("DeleteAllMyDevices", gywm.k);
        this.p = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return gywm.o;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = gywm.n.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.p.containsKey(s2) ? ((gphl)this.p.get(s2)) : null;
        }
        return null;
    }
}

