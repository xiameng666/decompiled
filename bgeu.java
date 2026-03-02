public class bgeu extends lsb {
    public static final bboh a;
    public final boolean b;
    public final beih c;
    public final begp d;
    public final bcyv e;
    public final icnj f;
    public final bxox g;
    public final lqd h;
    public String i;
    public final icnl j;
    public final icnl k;
    private final icig l;
    private final icig m;
    private final icig n;
    private final icig o;
    private final icig p;

    static {
        bgeu.a = bboh.b("CredentialsViewModel", bbcu.cX);
    }

    public bgeu(boolean z, beih beih0, begp begp0, bcyv bcyv0, begh begh0, beli beli0, beev beev0) {
        ibuq.f(beih0, "passwordDataRepository");
        ibuq.f(begp0, "passkeyDataRepository");
        ibuq.f(begh0, "localPasswordDataRepository");
        ibuq.f(beev0, "chromeSyncStateRepository");
        super();
        this.b = z;
        this.c = beih0;
        this.d = begp0;
        this.e = bcyv0;
        bgee bgee0 = new bgee(beih0.n);
        this.l = bgee0;
        bgeh bgeh0 = new bgeh(bgee0, this);
        this.m = bgeh0;
        bgeq bgeq0 = new bgeq(new bgen(new bgek(lox.b(beli0.a()), beev0)));
        this.n = bgeq0;
        icnl icnl0 = icnm.a(bgez.a);
        this.j = icnl0;
        icmj icmj0 = new icmj(bgeq0, icnl0, new bgdw(null));
        this.o = icmj0;
        bget bget0 = new bget(new icmj(bgeq0, icmj0, new bgdx(null)));
        this.p = bget0;
        icnl icnl1 = icnm.a(Boolean.valueOf(false));
        this.k = icnl1;
        this.f = iclp.b(icmm.b(bget0, icnl1, bgeh0, icmj0, new bgea(null)), lsc.a(this), icmy.a, bgdt.a);
        bxox bxox0 = new bxox();
        this.g = bxox0;
        this.h = bxox0;
    }
}

