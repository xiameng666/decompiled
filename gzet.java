public final class gzet implements gphn {
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
    public static final gphl l;
    public static final gphl m;
    public static final gphl n;
    public static final gphl o;
    public static final gphl p;
    public static final gphl q;
    public static final gphl r;
    public static final gphl s;
    public static final gzet t;
    public final ggfp u;
    private static final fokg v;
    private static final fokg w;
    private final ggeo x;

    static {
        gzet.a = new fokg("location.nearby.sharing.v1.NearbySharingService.");
        gzet.v = new fokg("location.nearby.sharing.v1.NearbySharingService/");
        gzet.b = new gzek();
        gzet.c = new gzel();
        gzet.d = new gzem();
        gzet.e = new gzen();
        gzet.f = new gzeo();
        gzet.g = new gzep();
        gzet.h = new gzeq();
        gzet.i = new gzer();
        gzet.j = new gzes();
        gzet.k = new gzeb();
        gzet.l = new gzec();
        gzet.m = new gzed();
        gzet.n = new gzee();
        gzet.o = new gzef();
        gzet.p = new gzeg();
        gzet.q = new gzeh();
        gzet.r = new gzei();
        gzet.s = new gzej();
        gzet.t = new gzet();
        gzet.w = new fokg("nearbysharing-pa.googleapis.com");
    }

    private gzet() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("autopush-nearbysharing-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("autopush-nearbysharing-pa.sandbox.googleapis.com");
        ggdy0.i("nearbysharing-pa.mtls.googleapis.com");
        ggdy0.i("staging-nearbysharing-pa.mtls.sandbox.googleapis.com");
        ggdy0.i("staging-nearbysharing-pa.sandbox.googleapis.com");
        ggdy0.i("nearbysharing-pa.googleapis.com");
        ggdy0.h();
        this.u = new ggfn().h();
        ggfp.O(gzet.b, gzet.c, gzet.d, gzet.e, gzet.f, gzet.g, new gphl[]{gzet.h, gzet.i, gzet.j, gzet.k, gzet.l, gzet.m, gzet.n, gzet.o, gzet.p, gzet.q, gzet.r, gzet.s});
        ggek ggek0 = new ggek();
        ggek0.i("UpdateDevice", gzet.b);
        ggek0.i("CheckContactsReachability", gzet.c);
        ggek0.i("ListContactPeople", gzet.d);
        ggek0.i("ListReachablePhoneNumbers", gzet.e);
        ggek0.i("ListPublicCertificates", gzet.f);
        ggek0.i("ListSenderCertificates", gzet.g);
        ggek0.i("ListMyDevices", gzet.h);
        ggek0.i("ListChromeBrowserDevices", gzet.i);
        ggek0.i("SendTabToChromeBrowserDevice", gzet.j);
        ggek0.i("CreateSharing", gzet.k);
        ggek0.i("FindSharing", gzet.l);
        ggek0.i("DeleteSharing", gzet.m);
        ggek0.i("CancelSharing", gzet.n);
        ggek0.i("ListSharings", gzet.o);
        ggek0.i("UpdateSharingUploads", gzet.p);
        ggek0.i("UpdateSharing", gzet.q);
        ggek0.i("RegisterReceiver", gzet.r);
        ggek0.i("RemoveReceiver", gzet.s);
        this.x = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return gzet.w;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = gzet.v.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.x.containsKey(s2) ? ((gphl)this.x.get(s2)) : null;
        }
        return null;
    }
}

