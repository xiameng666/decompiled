import android.content.Context;

public final class bwht implements bwhq {
    public static final bboh a;
    public final Context b;
    public bwhp c;
    public boolean d;
    public final bwhs e;

    static {
        bwht.a = bboh.b("HomeStubDevProvMonitor", bbcu.fA);
    }

    public bwht(Context context0) {
        ibuq.f(context0, "context");
        super();
        this.b = context0;
        this.e = new bwhs(this, new clht(context0.getMainLooper()));
    }

    @Override  // bwhq
    public final void a() {
        synchronized(this) {
            if(this.c != null) {
                this.c = null;
            }
            if(this.d) {
                this.d = false;
                ((ggtj)bwht.a.h()).x("Unregistering device provision listener");
                this.b.getContentResolver().unregisterContentObserver(this.e);
            }
            else {
                ((ggtj)bwht.a.j()).x("Already unregistered device provision listener");
            }
        }
    }
}

