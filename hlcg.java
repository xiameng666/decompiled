public final class hlcg implements gphn {
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
    public static final gphl t;
    public static final hlcg u;
    public final ggfp v;
    private static final fokg w;
    private static final fokg x;
    private final ggeo y;

    static {
        hlcg.a = new fokg("google.internal.android.wear.cloudsync.v1.CloudSyncService.");
        hlcg.w = new fokg("google.internal.android.wear.cloudsync.v1.CloudSyncService/");
        hlcg.b = new hlbx();
        hlcg.c = new hlby();
        hlcg.d = new hlbz();
        hlcg.e = new hlca();
        hlcg.f = new hlcb();
        hlcg.g = new hlcc();
        hlcg.h = new hlcd();
        hlcg.i = new hlce();
        hlcg.j = new hlcf();
        hlcg.k = new hlbn();
        hlcg.l = new hlbo();
        hlcg.m = new hlbp();
        hlcg.n = new hlbq();
        hlcg.o = new hlbr();
        hlcg.p = new hlbs();
        hlcg.q = new hlbt();
        hlcg.r = new hlbu();
        hlcg.s = new hlbv();
        hlcg.t = new hlbw();
        hlcg.u = new hlcg();
        hlcg.x = new fokg("androidwearcloudsync-pa.googleapis.com");
    }

    private hlcg() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("androidwearcloudsync-pa.googleapis.com");
        ggdy0.i("androidwearcloudsync-pa.googleapis.com");
        ggdy0.i("staging-androidwearcloudsync-pa.sandbox.googleapis.com");
        ggdy0.i("test-androidwearcloudsync-pa.sandbox.googleapis.com");
        ggdy0.i("androidwearcloudsync-pa.googleapis.com");
        ggdy0.h();
        this.v = new ggfn().h();
        ggfp.O(hlcg.b, hlcg.c, hlcg.d, hlcg.e, hlcg.f, hlcg.g, new gphl[]{hlcg.h, hlcg.i, hlcg.j, hlcg.k, hlcg.l, hlcg.m, hlcg.n, hlcg.o, hlcg.p, hlcg.q, hlcg.r, hlcg.s, hlcg.t});
        ggek ggek0 = new ggek();
        ggek0.i("CreateNetwork", hlcg.b);
        ggek0.i("EnrollNode", hlcg.c);
        ggek0.i("RevokeNode", hlcg.d);
        ggek0.i("StartSync", hlcg.e);
        ggek0.i("GetDataItems", hlcg.f);
        ggek0.i("PutDataItems", hlcg.g);
        ggek0.i("GetAssetAcls", hlcg.h);
        ggek0.i("PutAssetAcls", hlcg.i);
        ggek0.i("SendRpc", hlcg.j);
        ggek0.i("Heartbeat", hlcg.k);
        ggek0.i("GetServerTime", hlcg.l);
        ggek0.i("ListNetwork", hlcg.m);
        ggek0.i("ListAllNetworks", hlcg.n);
        ggek0.i("GcmTickle", hlcg.o);
        ggek0.i("DeleteNetwork", hlcg.p);
        ggek0.i("DeleteNetworkTest", hlcg.q);
        ggek0.i("ApiProbe", hlcg.r);
        ggek0.i("DataProbe", hlcg.s);
        ggek0.i("WearProbe", hlcg.t);
        this.y = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return hlcg.x;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = hlcg.w.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.y.containsKey(s2) ? ((gphl)this.y.get(s2)) : null;
        }
        return null;
    }
}

