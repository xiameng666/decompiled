import android.content.pm.PackageManager;
import j..util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

final class gpjf implements gpkv {
    final gpjh a;
    private gmcd b;

    public gpjf(gpjh gpjh0) {
        Objects.requireNonNull(gpjh0);
        this.a = gpjh0;
        super();
        this.b = null;
    }

    @Override  // gpkv
    public final gpmb a(gpkt gpkt0) {
        gmcd gmcd0 = this.b;
        gftb.check(gmcd0);
        return gpjf.h(gpkt0, gmcd0);
    }

    @Override  // gpkv
    public final gpmb b(gpkt gpkt0) {
        gphl gphl0 = (gphl)gpkt0.b.j(gphl.a);
        gpgx gpgx0 = (gpgx)gpkt0.b.j(gpgy.a);
        PackageManager packageManager0 = gpgx0.a.getPackageManager();
        gftb.r(gphl0.c(), "Using ApiKeyStrategy for method that is not allowed without credentials");
        iaof_metadata iaof0 = gpkt0.a;
        gftb.r(((boolean)(iaof0.j(gpjh.a) ^ 1)), "API key was already attached to the request");
        iaof0.i(gpjh.a, this.a.e);
        if(this.a.f) {
            gftb.r(((boolean)(iaof0.j(gpjh.c) ^ 1)), "Cert was already attached to the request");
            gftb.r(((boolean)(iaof0.j(gpjh.b) ^ 1)), "Package was already attached to the request");
            iaof0.i(gpjh.b, "com.google.android.gms");
            Executor executor0 = gpgx0.c;
            if(gpjh.d == null) {
                synchronized(gpjh.class) {
                    if(gpjh.d == null) {
                        gpjh.d = new gdnz(new gpje(packageManager0, "com.google.android.gms"), executor0);
                    }
                }
            }
            gmcd gmcd0 = gpjh.d.c();
            if(gmcd0.isDone()) {
                return gpjf.h(gpkt0, gmcd0);
            }
            this.b = gmcd0;
            return gpmb.c(gmcd0);
        }
        return gpmb.a;
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

    private static final gpmb h(gpkt gpkt0, gmcd gmcd0) {
        try {
            String s = (String)gmbu.r(gmcd0);
            gpkt0.a.i(gpjh.c, s);
            return gpmb.a;
        }
        catch(ExecutionException executionException0) {
            return gpmb.b(iapk.d(executionException0).f("Failed to get API Key cert"), new iaof_metadata());
        }
    }
}

