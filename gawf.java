import android.content.Context;

public final class gawf extends gctm {
    private static gawf a;

    public gawf(Context context0) {
        gaxl.a();
        long v = hznd.d();
        gaxl.a();
        long v1 = hznd.b();
        gaxl.a();
        super(context0, v, v1, hznd.c());
    }

    public static gawf a(Context context0) {
        synchronized(gawf.class) {
            if(gawf.a == null) {
                gawf.a = new gawf(context0);
            }
        }
        return gawf.a;
    }

    @Override  // gctm
    protected final boolean c() {
        gaxl.a();
        return hznd.f();
    }

    @Override  // gctm
    protected final void d(Context context0, int v, long v1, azuj azuj0, String s) {
    }
}

