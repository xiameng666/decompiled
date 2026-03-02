import android.os.Handler;
import android.os.Looper;

public final class crpq extends crbz {
    public Handler a;
    public boolean b;
    protected final crpp c;
    protected final crpo d;
    protected final crpm e;

    public crpq(crkt crkt0) {
        super(crkt0);
        this.b = true;
        this.c = new crpp(this);
        this.d = new crpo(this);
        this.e = new crpm(this);
    }

    @Override  // crbz
    protected final boolean p() {
        return false;
    }

    public final void q() {
        this.n();
        if(this.a == null) {
            this.a = new clht(Looper.getMainLooper());
        }
    }

    final void r(boolean z) {
        this.n();
        this.b = z;
    }

    public final boolean s(boolean z, boolean z1, long v) {
        return this.d.c(z, z1, v);
    }
}

