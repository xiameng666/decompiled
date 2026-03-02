public final class hllg implements gphn {
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
    public static final hllg o;
    public final ggfp p;
    private static final fokg q;
    private static final fokg r;
    private final ggeo s;

    static {
        hllg.a = new fokg("google.android.fitness.v0.FitnessService.");
        hllg.q = new fokg("google.android.fitness.v0.FitnessService/");
        hllg.b = new hlkx();
        hllg.c = new hlky();
        hllg.d = new hlkz();
        hllg.e = new hlla();
        hllg.f = new hllb();
        hllg.g = new hllc();
        hllg.h = new hlld();
        hllg.i = new hlle();
        hllg.j = new hllf();
        hllg.k = new hlkt();
        hllg.l = new hlku();
        hllg.m = new hlkv();
        hllg.n = new hlkw();
        hllg.o = new hllg();
        hllg.r = new fokg("fitness.googleapis.com");
    }

    private hllg() {
        ggdy ggdy0 = new ggdy();
        ggdy0.i("fitness.googleapis.com");
        ggdy0.i("fitness.googleapis.com");
        ggdy0.h();
        this.p = new ggfn().h();
        ggfp.O(hllg.b, hllg.c, hllg.d, hllg.e, hllg.f, hllg.g, new gphl[]{hllg.h, hllg.i, hllg.j, hllg.k, hllg.l, hllg.m, hllg.n});
        ggek ggek0 = new ggek();
        ggek0.i("CreateDataSource", hllg.b);
        ggek0.i("ListDataSources", hllg.c);
        ggek0.i("UpdateDataSource", hllg.d);
        ggek0.i("GetDataSource", hllg.e);
        ggek0.i("DeleteDataSource", hllg.f);
        ggek0.i("PatchDataset", hllg.g);
        ggek0.i("GetDataset", hllg.h);
        ggek0.i("DeleteDataset", hllg.i);
        ggek0.i("Aggregate", hllg.j);
        ggek0.i("UpsertSession", hllg.k);
        ggek0.i("ListSessions", hllg.l);
        ggek0.i("DeleteSession", hllg.m);
        ggek0.i("ListDataPointChanges", hllg.n);
        this.s = ggek0.b();
        new ggek().b();
    }

    @Override  // gphn
    public final fokg a() {
        return hllg.r;
    }

    @Override  // gphn
    public final gphl b(String s) {
        String s1 = hllg.q.a;
        if(s.startsWith(s1)) {
            String s2 = s.substring(s1.length());
            return this.s.containsKey(s2) ? ((gphl)this.s.get(s2)) : null;
        }
        return null;
    }
}

