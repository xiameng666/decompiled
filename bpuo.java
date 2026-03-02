import java.util.concurrent.Executor;

public final class bpuo implements bnqo {
    public final bnqm a;
    public final bpte b;
    public final fquu c;
    public final fgvt d;
    public final gsyz e;
    public final String f;
    public final fqyc g;
    public final fqwq h;
    private final fqwk i;
    private final Executor j;
    private volatile gmcd k;

    public bpuo(fqwk fqwk0, bnqm bnqm0, bpte bpte0, fquu fquu0, fgvt fgvt0, Executor executor0, gsyz gsyz0, String s, fqyc fqyc0, fqwq fqwq0) {
        this.i = fqwk0;
        this.a = bnqm0;
        this.b = bpte0;
        this.c = fquu0;
        this.d = fgvt0;
        this.j = executor0;
        this.e = gsyz0;
        this.f = s;
        this.g = fqyc0;
        this.h = fqwq0;
    }

    @Override  // bnqo
    public final gmcd a() {
        gftb.q(this.k == null);
        this.k = gdta.g(this.i.b()).i(new bpui(this), this.j).i(new bpuj(this), this.j).i(new fqub(new bpuk(this)), this.j).i(new fqub(new bpul(this)), this.j).i(new fqub(new bpum(this)), this.j).h(new bpun(this), this.j);
        return this.k;
    }
}

