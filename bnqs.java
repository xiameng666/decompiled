import android.content.Context;

@ibnh
final class bnqs extends bous {
    public static final int a;
    private static final bboh b;
    private final Context c;
    private final ibnf d;

    static {
        bnqs.b = bboh.b("EidCacheIOExceptionHnd", bbcu.eD);
    }

    public bnqs(Context context0, ibnf ibnf0) {
        super(((MessageLite)fqyf.a));
        this.c = context0;
        this.d = ibnf0;
    }

    @Override  // bous
    protected final gmcd a() {
        ((ggtj)bnqs.b.j()).x("SPOT EID cache data store corrupted. Scheduling an EID sync for all accounts.");
        cljp cljp0 = cljp.a(this.c);
        return gdta.g(((fquu)this.d.get()).g()).h(new bnqr(cljp0), gmap.a);
    }
}

