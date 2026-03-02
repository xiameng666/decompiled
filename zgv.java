import java.util.concurrent.TimeUnit;

public final class zgv {
    public static final baun a;
    private static zgv b;
    private final zgp c;
    private final gmch d;
    private final gmbg e;
    private zgt f;
    private int g;

    static {
        zgv.a = new baun("AccountSettings", new String[]{"SingletonManager"});
    }

    private zgv(zgp zgp0) {
        bbll bbll0 = new bbll(1, 9);
        zgu zgu0 = new zgu();
        super();
        this.f = null;
        this.g = 0;
        this.c = zgp0;
        this.d = bbll0;
        this.e = zgu0;
    }

    static zgp a() {
        try {
            zgp zgp0 = (zgp)cliw.d("com.google.android.gms.accountsettings.inject.components.Components", "singletonComponentFactory", new cliv[0]);
            batl.s(zgp0);
            return zgp0;
        }
        catch(ReflectiveOperationException reflectiveOperationException0) {
            throw new LinkageError("Unable to invoke Components.singletonComponentFactory()", reflectiveOperationException0);
        }
    }

    public static zgv b() {
        synchronized(zgv.class) {
            if(zgv.b == null) {
                zgv.b = new zgv(zgv.a());
            }
        }
        return zgv.b;
    }

    public final Object c(lpg lpg0) {
        synchronized(this) {
            batl.c(((lpw)lpg0).b != lpf.a, "Caller has already been destroyed");
            if(this.g == 0 && this.f != null) {
                throw new IllegalStateException("Called from singleton clean-up code");
            }
            if(this.f == null) {
                this.f = new zgt(this.c);
            }
            this.g(lpg0);
        }
        return this.f.b;
    }

    // Detected as a lambda impl.
    public final void d() {
        gmch gmch0 = this.d;
        if(!((bbll)gmch0).d) {
            gmbu.t(gmch0.h(new zgq(this), hojn.a.g().l(), TimeUnit.MILLISECONDS), this.e, gmap.a);
            return;
        }
        this.f();
    }

    public final Object e(aavz aavz0) {
        synchronized(this) {
            batl.c(((boolean)(aavz0.c() ^ 1)), "Caller has already been destroyed");
            if(this.g == 0 && this.f != null) {
                throw new IllegalStateException("Called from singleton clean-up code");
            }
            if(this.f == null) {
                this.f = new zgt(this.c);
            }
            this.h(aavz0);
        }
        return this.f.b;
    }

    public final void f() {
        synchronized(this) {
            int v1 = this.g - 1;
            this.g = v1;
            if(v1 == 0) {
                zgt zgt0 = this.f;
                if(zgt0 != null) {
                    try {
                        zgt0.a.b();
                    }
                    finally {
                        this.f = null;
                    }
                }
            }
        }
    }

    private final void g(lpg lpg0) {
        synchronized(this) {
            ++this.g;
            cchv.a(lpg0, () -> {
                gmch gmch0 = this.d;
                if(!((bbll)gmch0).d) {
                    gmbu.t(gmch0.h(new zgq(this), hojn.a.g().l(), TimeUnit.MILLISECONDS), this.e, gmap.a);
                    return;
                }
                this.f();
            });
        }
    }

    private final void h(aavz aavz0) {
        synchronized(this) {
            ++this.g;
            aavz0.a(() -> {
                gmch gmch0 = this.d;
                if(!((bbll)gmch0).d) {
                    gmbu.t(gmch0.h(new zgq(this), hojn.a.g().l(), TimeUnit.MILLISECONDS), this.e, gmap.a);
                    return;
                }
                this.f();
            });
        }
    }
}

