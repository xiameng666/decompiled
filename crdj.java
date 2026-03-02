import android.os.Handler;

abstract class crdj {
    public volatile long a;
    private static volatile Handler b;
    private final crlw c;
    private final Runnable d;

    public crdj(crlw crlw0) {
        batl.s(crlw0);
        this.c = crlw0;
        this.d = new crdi(this, crlw0);
    }

    final void a() {
        this.a = 0L;
        this.e().removeCallbacks(this.d);
    }

    public abstract void b();

    public final void c(long v) {
        this.a();
        if(v >= 0L) {
            crlw crlw0 = this.c;
            crkt crkt0 = (crkt)crlw0;
            this.a = System.currentTimeMillis();
            if(!this.e().postDelayed(this.d, v)) {
                crlw0.aJ().c.b("Failed to schedule delayed post. time", Long.valueOf(v));
            }
        }
    }

    public final boolean d() {
        return this.a != 0L;
    }

    private final Handler e() {
        if(crdj.b != null) {
            return crdj.b;
        }
        synchronized(crdj.class) {
            if(crdj.b == null) {
                crdj.b = new clht(((crkt)this.c).a.getMainLooper());
            }
        }
        return crdj.b;
    }
}

