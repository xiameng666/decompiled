import java.util.concurrent.Executor;

public final class cixf implements ciyp, faij {
    public static final bboh a;
    private static final gful_cronetEngineProvider b;
    private final faik c;
    private volatile gmcd d;
    private volatile boolean e;
    private volatile boolean f;

    static {
        cixf.a = bboh.b("CheckboxNcc", bbcu.eQ);
        cixf.b = gfus.a(((gful_cronetEngineProvider)new cixc()));
    }

    public cixf() {
        faik faik0 = faih.a(ccva.b());
        super();
        this.d = gmbu.i(Boolean.valueOf(false));
        this.e = false;
        this.f = false;
        this.c = faik0;
    }

    @Override  // ciyp
    public final gmcd a() {
        if(!this.f) {
            Class class0 = cixf.class;
            synchronized(class0) {
                if(!this.f) {
                    this.c.ct(this);
                    this.f = true;
                }
            }
        }
        if(!this.e) {
            synchronized(cixf.class) {
                if(!this.e) {
                    Executor executor0 = (Executor)cixf.b.mr();
                    gmcd gmcd0 = glzd.f(gmbt.h(fhra.b(this.c.cp())), new cixd(), executor0);
                    cixe cixe0 = new cixe();
                    this.d = glyi.f(gmcd0, Exception.class, cixe0, executor0);
                    this.e = true;
                }
            }
            return this.d;
        }
        return this.d;
    }

    @Override  // ciyp
    public final hfki b() {
        return hfki.b(new hfke(3));
    }

    @Override  // faij
    public final void c() {
        this.e = false;
    }
}

