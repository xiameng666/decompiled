import android.content.Context;
import android.location.GnssMeasurementsEvent.Callback;
import android.location.GnssNavigationMessage.Callback;
import android.location.LocationListener;
import android.os.Looper;
import com.google.android.location.collectionlib.GpsScanner.1;

public final class fvmy extends fvnr {
    final GnssMeasurementsEvent.Callback a;
    final GnssNavigationMessage.Callback b;
    final fvmx c;
    final LocationListener d;
    public boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    private final fvsd p;
    private final String q;
    private final boolean r;
    private final long s;

    public fvmy(Context context0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, fvsd fvsd0, fvls fvls0, fvlt fvlt0, fybc fybc0, long v) {
        super(fvls0, fvlt0, fybc0);
        this.e = false;
        this.f = z;
        this.g = z1;
        this.h = z2;
        this.r = z3;
        this.i = z4;
        this.d = new GpsScanner.1(this);
        this.p = fvsd0 == null ? new fvsd(context0, false) : fvsd0;
        this.q = this.j.a;
        this.s = v;
        fvmx fvmx0 = null;
        this.a = z2 ? new fvmv(this) : null;
        this.b = z4 ? new fvmw(this) : null;
        if(z1) {
            fvmx0 = new fvmx(this);
        }
        this.c = fvmx0;
    }

    @Override  // fvnr
    protected final void b() {
        if(this.g) {
            fvsd fvsd0 = this.p;
            String s = this.q;
            jyy jyy0 = new jyy(new clht());
            try {
                jym.c(fvsd0.b, jyy0, this.c);
                fvsd0.d(s, 4);
            }
            catch(SecurityException unused_ex) {
                fvsd0.d(s, 6);
            }
        }
        fvsd fvsd1 = this.p;
        if(fvsd1 != null) {
            Looper looper0 = this.m.getLooper();
            fvsd1.f(this.q, "gps", this.s, this.d, looper0);
        }
        if(this.h) {
            GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback0 = this.a;
            if(gnssMeasurementsEvent$Callback0 != null) {
                if(huvd.p()) {
                    jyy jyy1 = new jyy(new clht());
                    fvsd1.e(this.q, gnssMeasurementsEvent$Callback0, jyy1, this.r);
                }
                else {
                    fvsd1.b.registerGnssMeasurementsCallback(gnssMeasurementsEvent$Callback0);
                    fvsd1.d(this.q, 7);
                }
            }
        }
        if(this.i) {
            GnssNavigationMessage.Callback gnssNavigationMessage$Callback0 = this.b;
            if(gnssNavigationMessage$Callback0 != null) {
                fvsd1.b.registerGnssNavigationMessageCallback(gnssNavigationMessage$Callback0);
                fvsd1.d(this.q, 9);
            }
        }
    }

    @Override  // fvnr
    protected final void c() {
        if(this.g) {
            fvsd fvsd0 = this.p;
            if(fvsd0 != null) {
                jym.a(fvsd0.b, this.c);
                fvsd0.d(this.q, 5);
            }
        }
        fvsd fvsd1 = this.p;
        if(fvsd1 != null) {
            fvsd1.b(this.q, true, this.d);
        }
        if(this.h) {
            GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback0 = this.a;
            if(gnssMeasurementsEvent$Callback0 != null) {
                fvsd1.c(this.q, gnssMeasurementsEvent$Callback0);
            }
        }
        if(this.i) {
            GnssNavigationMessage.Callback gnssNavigationMessage$Callback0 = this.b;
            if(gnssNavigationMessage$Callback0 != null) {
                fvsd1.b.unregisterGnssNavigationMessageCallback(gnssNavigationMessage$Callback0);
                fvsd1.d(this.q, 10);
            }
        }
    }
}

