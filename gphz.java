import java.util.concurrent.ExecutionException;

final class gphz implements gpkv {
    private final glzm a;
    private gmcd b;

    public gphz(glzm glzm0) {
        this.a = glzm0;
    }

    @Override  // gpkv
    public final gpmb a(gpkt gpkt0) {
        try {
            gphy gphy0 = (gphy)gmbu.r(this.b);
            gftb.r(((boolean)(gpkt0.a.j(gpia.a) ^ 1)), "Already attached auth token");
            gpkt0.a.i(gpia.a, "Bearer " + gphy0.a);
            String s = gphy0.a();
            gpkt0.a.i(gpia.b, s);
            return gpmb.a;
        }
        catch(ExecutionException executionException0) {
            iaof_metadata iaof0 = new iaof_metadata();
            return gpmb.b(iapk.d(executionException0.getCause()).f("Could not obtain auth token"), iaof0);
        }
    }

    @Override  // gpkv
    public final gpmb b(gpkt gpkt0) {
        gmcd gmcd0;
        try {
            gmcd0 = this.a.a();
        }
        catch(Exception exception0) {
            gmcd0 = gmbu.h(exception0);
        }
        this.b = gmcd0;
        return gpmb.c(gmcd0);
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

