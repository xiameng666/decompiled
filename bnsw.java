import java.util.concurrent.Executor;

final class bnsw implements bnqo {
    public final fgvt a;
    public final fquu b;
    public final bnqm c;
    public final Executor d;
    public final gsyz e;
    public final gszr f;
    public final fqwq g;
    public volatile fqij h;
    public volatile ByteString i;
    public volatile int j;
    public volatile long k;
    public final fqid l;
    public static final int m;
    private final fqwk n;
    private final ByteString o;
    private final gfsx p;
    private volatile gmcd q;
    private final fqne r;
    private final fqhr s;

    static {
        bboh.b("FpEsDeviceKeyRotationT", bbcu.eD);
    }

    public bnsw(fgvt fgvt0, fqne fqne0, fquu fquu0, fqhr fqhr0, fqid fqid0, fqwk fqwk0, bnqm bnqm0, Executor executor0, gsyz gsyz0, ByteString hfsf0, gszr gszr0, fqwq fqwq0, gfsx gfsx0) {
        this.a = fgvt0;
        this.r = fqne0;
        this.b = fquu0;
        this.s = fqhr0;
        this.l = fqid0;
        this.n = fqwk0;
        this.c = bnqm0;
        this.d = executor0;
        this.e = gsyz0;
        this.o = hfsf0;
        this.f = gszr0;
        this.g = fqwq0;
        this.p = gfsx0;
    }

    @Override  // bnqo
    public final gmcd a() {
        gmcd gmcd0;
        gftb.q(this.q == null);
        gfsx gfsx0 = this.g.b;
        gftb.b(gfsx0.i(), "No account key provided in device");
        gfsx gfsx1 = this.p;
        if(gfsx1.i()) {
            gmcd0 = gmbu.i(gfsx1);
        }
        else {
            fqoh fqoh0 = fqoi.a();
            fqoh0.b(this.e);
            fqoh0.e(new ggoh(this.o));
            fqoh0.d(this.r.d());
            fqoi fqoi0 = fqoh0.a();
            gdta gdta0 = gdta.g(this.s.e(fqoi0)).h(new bnsh(), gmap.a);
            bnsn bnsn0 = new bnsn();
            gmcd0 = gdta0.e(fqmp.class, bnsn0, this.d);
        }
        Object object0 = gfsx0.d();
        this.q = gdsy.c(this.n.b()).f(new glzt(new bnso(gmcd0)), this.d).f(new bnsp(this, ((ByteString)object0)), this.d).f(new glzt(new bnsq(this, ((ByteString)object0))), this.d).f(new glzt(new bnsr(this)), this.d).f(new glzt(new fqub(new bnss(this))), this.d).g().i(new fqub(new bnst(this)), this.d).i(new fqub(new bnsu(this)), this.d).h(new bnsv(this), this.d);
        return this.q;
    }
}

