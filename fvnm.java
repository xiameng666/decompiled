import com.google.android.location.collectionlib.RealCollectorConfig;
import com.google.android.location.collectionlib.utils.ParcelableSensorScannerConfig;
import java.util.Set;

public final class fvnm {
    public Set a;
    public boolean b;
    public String c;
    public byte[] d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public fvnx j;
    public boolean k;
    public fwyc l;
    public gwth m;
    public fvlg n;
    public fvlg o;
    public boolean p;
    public int q;

    public fvnm() {
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = 0L;
        this.f = 0L;
        this.g = 0L;
        this.i = false;
        this.j = null;
        this.k = true;
        this.l = null;
        this.m = null;
        this.n = fvlg.a;
        this.o = fvlg.a;
        this.p = false;
    }

    public final RealCollectorConfig a() {
        if(this.a.contains(fvns.w)) {
            gftb.q(false);
            gftb.q(false);
        }
        fvnx fvnx0 = this.j;
        if(fvnx0 != null) {
            ParcelableSensorScannerConfig parcelableSensorScannerConfig0 = new ParcelableSensorScannerConfig(fvnx0);
            return new RealCollectorConfig(this.a, this.b, this.i, this.e, 0L, this.f, this.g, this.h, parcelableSensorScannerConfig0, this.q, this.c, this.d, this.k, this.l, false, -1, -1, this.m, this.n, this.o, this.p);
        }
        return new RealCollectorConfig(this.a, this.b, this.i, this.e, 0L, this.f, this.g, this.h, null, this.q, this.c, this.d, this.k, this.l, false, -1, -1, this.m, this.n, this.o, this.p);
    }

    public final void b(long v) {
        this.h = v;
        this.i = false;
        this.j = null;
    }
}

