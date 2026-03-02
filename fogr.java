import android.content.Context;
import android.util.Log;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class fogr implements foeg {
    public final CopyOnWriteArrayList a;
    public static final int b;
    private static final efnv c;
    private final Context d;
    private final efoi e;
    private final Executor f;
    private final fodv g;
    private final azpm h;
    private final efof i;
    private final azts j;
    private final azts k;

    static {
        efnv efnv0 = new efnv();
        efnv0.a();
        fogr.c = efnv0;
    }

    public fogr(Context context0, azts azts0, efoi efoi0, azts azts1, fodv fodv0, Executor executor0, azpm azpm0) {
        this.a = new CopyOnWriteArrayList();
        this.d = context0;
        this.j = azts0;
        this.e = efoi0;
        this.k = azts1;
        this.f = executor0;
        this.g = fodv0;
        this.h = azpm0;
        this.i = new fogn(this);
    }

    @Override  // foeg
    public final gmcd a() {
        return this.c();
    }

    @Override  // foeg
    public final gmcd b(String s) {
        return glzd.f(this.c(), gdrx.a(new fogp(s)), gmap.a);
    }

    @Override  // foeg
    public final gmcd c() {
        gmcd gmcd0 = this.g.a();
        int v = this.h.m(this.d);
        gmcd gmcd1 = v == 0 ? fogx.a(this.j.bG(fogr.c), gdrx.a(new fogq()), gmap.a) : this.i(v);
        gmcd gmcd2 = gdtf.h(new fodx(((fodz)this.g)), ((fodz)this.g).c);
        return gdtf.b(new gmcd[]{gmcd0, gmcd1, gmcd2}).a(new fogo(gmcd0, gmcd2, gmcd1), gmap.a);
    }

    @Override  // foeg
    public final void d(foef foef0) {
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.a;
        if(copyOnWriteArrayList0.isEmpty()) {
            azyf azyf0 = this.e.iD(this.i, efof.class.getName());
            eghe eghe0 = new eghe(azyf0);
            efog efog0 = new efog(eghe0);
            efoh efoh0 = new efoh(eghe0);
            azyq azyq0 = new azyq();
            azyq0.a = efog0;
            azyq0.b = efoh0;
            azyq0.c = azyf0;
            azyq0.e = 0xAA0;
            azyr azyr0 = azyq0.a();
            this.e.iH(azyr0);
        }
        copyOnWriteArrayList0.add(foef0);
    }

    @Override  // foeg
    public final void e(foef foef0) {
        this.a.remove(foef0);
        if(this.a.isEmpty()) {
            this.e.jm(azyg.a(this.i, efof.class.getName()), 0xAA1);
        }
    }

    @Override  // foeg
    public final gmcd f(String s, int v) {
        return this.g(s, v);
    }

    @Override  // foeg
    public final gmcd g(String s, int v) {
        int v1 = this.h.m(this.d);
        if(v1 != 0) {
            return this.i(v1);
        }
        int v2 = fodu.a(v);
        return fogx.a(this.k.bH(s, v2, 1), new fogm(), this.f);
    }

    public static Object h(gmcd gmcd0, String s) {
        try {
            return gmbu.r(gmcd0);
        }
        catch(ExecutionException executionException0) {
            Throwable throwable0 = executionException0.getCause();
            if((throwable0 instanceof azqj) || (throwable0 instanceof azqi)) {
                throw executionException0;
            }
            Log.e("OneGoogle", String.format("Failed to load %s. Exception: %s", s, fnwn.a(throwable0)));
            return null;
        }
    }

    private final gmcd i(int v) {
        return azqk.j(v) ? gmbu.h(new azqj(v, "Google Play Services not available", this.h.k(this.d, v, null))) : gmbu.h(new azqi(v));
    }
}

