import android.text.TextUtils;
import android.util.Log;
import j..util.Objects;

final class fdvp implements gmbg {
    final String a;
    final long b;
    final ffby c;
    final fdvu d;

    public fdvp(fdvu fdvu0, String s, long v, ffby ffby0) {
        this.a = s;
        this.b = v;
        this.c = ffby0;
        Objects.requireNonNull(fdvu0);
        this.d = fdvu0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        this.c("exception: " + throwable0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        if(((fdvi)object0) == null) {
            this.c("result null");
            return;
        }
        fdvu fdvu0 = this.d;
        String s = this.a;
        long v = this.b;
        if(!hzvs.e()) {
            return;
        }
        synchronized(fdvu0.k) {
            if(fdvu0.w != null && fdvu0.w.a()) {
                feua feua0 = fdvu0.w;
                if(TextUtils.equals(feua0.a, s) && v >= feua0.b) {
                    feua0.c.set(false);
                    feua0.d.run();
                    fdvu0.w = null;
                }
            }
        }
    }

    private final void c(String s) {
        Log.w("datatransport", "setDataItemFromTransport error: , sourceNode=" + this.c.i + ", seqId=" + this.c.g + " " + s);
        fdvu fdvu0 = this.d;
        synchronized(fdvu0.k) {
            fdvr fdvr0 = fdvu0.s;
            if(fdvr0 != null) {
                fdvr0.d();
            }
            fdvu0.g.d();
        }
    }
}

