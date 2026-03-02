import java.util.concurrent.Executor;

final class bnnx implements fqsy {
    public static final bboh a;
    public final Executor b;
    public final fqvo c;
    private final fqwt d;

    static {
        bnnx.a = bboh.b("GmsAggAttemptHandler", bbcu.eD);
    }

    public bnnx(fqvo fqvo0, fqwt fqwt0, Executor executor0) {
        this.c = fqvo0;
        this.d = fqwt0;
        this.b = executor0;
    }

    @Override  // fqsy
    public final gmcd a(gszb gszb0, fqsz fqsz0, fquk fquk0) {
        if(hsww.a.b().m() && !gszb0.d.isEmpty() && gszb0.b == 13) {
            gsyy gsyy0 = (gsyy)gszb0.c;
            gszo gszo0 = gsyy0.b == null ? gszo.a : gsyy0.b;
            return gdta.g(this.d.a((gszo0.f == null ? gtap.a : gszo0.f))).i(new bnnv(this, gsyy0, fqsz0, gszb0), this.b);
        }
        return gmbx.a;
    }
}

