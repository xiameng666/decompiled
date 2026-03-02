public class benh extends lsb {
    public final befy a;
    public final beev b;
    public final bxox c;
    public final bxox d;
    public final bxox e;
    public final lqi f;
    public final bxox g;
    public final lqd h;
    public final lqd i;
    public final lqd j;
    public final lqd k;
    public final lqd l;
    public final lqd m;
    public final lqd n;
    public final lqd o;
    public final lqd p;
    public final lqd q;
    private final lqh r;
    private final lqj s;
    private final lqj t;
    private final lqj u;

    public benh(befy befy0, beev beev0) {
        ibuq.f(befy0, "enhancedProtectionRepository");
        ibuq.f(beev0, "chromeSyncStateRepository");
        super();
        this.a = befy0;
        this.b = beev0;
        this.c = new bxox();
        this.d = new bxox();
        this.e = new bxox();
        this.f = new lqi();
        this.g = new bxox();
        bemr bemr0 = new bemr();
        this.h = lsa.b(beev0.b, bemr0);
        bend bend0 = new bend();
        this.i = lsa.a(lsa.b(beev0.b, bend0));
        bene bene0 = new bene();
        this.j = lsa.a(lsa.b(beev0.b, bene0));
        benf benf0 = new benf();
        this.k = lsa.a(lsa.b(beev0.b, benf0));
        beng beng0 = new beng();
        lqd lqd0 = lsa.a(new beol(beev0.b, befy0.f, beng0));
        this.l = lqd0;
        bems bems0 = new bems();
        lqd lqd1 = lsa.a(new beol(beev0.b, befy0.e, bems0));
        this.m = lqd1;
        bemt bemt0 = new bemt();
        this.n = lsa.a(new beol(befy0.g, befy0.h, bemt0));
        bemu bemu0 = new bemu();
        beol beol0 = new beol(befy0.g, befy0.h, bemu0);
        bemv bemv0 = new bemv();
        lqd lqd2 = lsa.a(new beoq(beev0.b, lqd1, beol0, bemv0));
        this.o = lqd2;
        beoq beoq0 = new beoq(lqd0, lqd1, lqd2, new bemw());
        this.r = beoq0;
        bemy bemy0 = new bemy();
        this.p = lsa.a(new beol(beev0.b, beoq0, bemy0));
        bemz bemz0 = new bemz();
        this.q = lsa.c(beev0.b, bemz0);
        bena bena0 = new bena(this);
        this.s = bena0;
        benb benb0 = new benb(this);
        this.t = benb0;
        benc benc0 = new benc(this);
        this.u = benc0;
        befy0.i.ih(bena0);
        befy0.j.ih(benb0);
        befy0.k.ih(benc0);
    }

    public final void a() {
        evql evql0 = this.a.m.jE(this.a.d, 5);
        evql0.b(new befr(new befq(this.a)));
        evql0.A(new befs(this.a));
    }

    @Override  // lsb
    protected final void km() {
        this.a.i.j(this.s);
        this.a.j.j(this.t);
        this.a.k.j(this.u);
    }
}

