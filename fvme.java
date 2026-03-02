import android.content.Context;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;

final class fvme extends fvnr {
    private final cmnh a;
    private final LocationRequest b;
    private cmob c;

    public fvme(Context context0, fvls fvls0, fvlt fvlt0, fybc fybc0, long v, boolean z) {
        LocationRequest locationRequest0;
        cnjv cnjv0 = new cnjv(context0);
        super(fvls0, fvlt0, fybc0);
        this.a = cnjv0;
        if(z) {
            cmoc cmoc0 = new cmoc(v);
            cmoc0.k(100);
            cmoc0.l(2);
            locationRequest0 = cmoc0.a();
        }
        else {
            locationRequest0 = new cmoc(v).a();
        }
        this.b = locationRequest0;
    }

    @Override  // fvnr
    protected final void b() {
        this.c = new fvmd(this);
        cmob cmob0 = this.c;
        Looper looper0 = this.m.getLooper();
        this.a.n(this.b, cmob0, looper0);
    }

    @Override  // fvnr
    protected final void c() {
        this.a.g(this.c);
    }
}

