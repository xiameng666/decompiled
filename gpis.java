import java.util.concurrent.ExecutionException;

public final class gpis implements gpkv {
    private static final iaoa a;
    private final gpiq b;
    private gmcd c;

    static {
        gpis.a = new iant("X-Goog-Spatula", iaof_metadata.c);
    }

    public gpis(gpiq gpiq0) {
        this.b = gpiq0;
    }

    @Override  // gpkv
    public final gpmb a(gpkt gpkt0) {
        try {
            String s = (String)gmbu.r(this.c);
            gpkt0.a.i(gpis.a, s);
            return gpmb.a;
        }
        catch(ExecutionException executionException0) {
            return gpmb.b(iaph.q.a().e(executionException0.getCause()).f("Could not retrieve spatula header"), new iaof_metadata());
        }
    }

    @Override  // gpkv
    public final gpmb b(gpkt gpkt0) {
        try(gdqb gdqb0 = gdsp.e("com/google/frameworks/client/data/android/auth/impl/AsyncSpatulaInterceptor", "startRequestHeaderProcessing", 40, "AsyncSpatulaInterceptor#headerFuture")) {
            gmcd gmcd0 = this.b.a();
            gdqb0.a(gmcd0);
            this.c = gmcd0;
            return gpmb.c(gmcd0);
        }
    }

    @Override  // gpkv
    public final gpmc c(gpks gpks0) {
        return gpmc.a;
    }

    @Override  // gpkv
    public final gpmb d() {
        return gpmb.a;
    }

    @Override  // gpkv
    public final gpmb e() {
        return gpmb.a;
    }

    @Override  // gpkv
    public final void f() {
    }

    @Override  // gpkv
    public final void g() {
    }
}

