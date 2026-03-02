import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import j..util.Objects;

public final class fuvl extends fuvo {
    final fuvs a;
    private long b;
    private boolean c;

    public fuvl(fuvs fuvs0) {
        this(fuvs0, false);
    }

    public fuvl(fuvs fuvs0, boolean z) {
        Objects.requireNonNull(fuvs0);
        this.a = fuvs0;
        super(fuvs0);
        this.b = -1L;
        this.c = z;
    }

    @Override  // fuvo
    public final String a() {
        return "InVehicle";
    }

    @Override  // fuvo
    public final void b(ActivityRecognitionResult activityRecognitionResult0) {
        if(fuvs.e(activityRecognitionResult0)) {
            this.a.c(this.c);
            return;
        }
        if(activityRecognitionResult0.d().a() != 5) {
            if(fuvs.d(activityRecognitionResult0)) {
                this.b = SystemClock.elapsedRealtime();
                return;
            }
            fuvs fuvs0 = this.a;
            if(SystemClock.elapsedRealtime() - this.b > 900000L) {
                fuvs0.a(new fuvr(fuvs0));
            }
            return;
        }
        fuvm fuvm0 = new fuvm(this.a, this.c);
        this.a.a(fuvm0);
    }

    @Override  // fuvo
    protected final void c() {
        this.b = SystemClock.elapsedRealtime();
        futd futd0 = this.a.c;
        if(!futd0.M && futd0.E.isEmpty()) {
            fwvq fwvq0 = futd0.af;
            if(fwvq0.a) {
                fwvq0.b(futd0);
            }
        }
        futd0.E.add(Long.valueOf(30000L));
        boolean z = true;
        futd0.A(true, false);
        if(futd0.x.b.a().isEmpty() && !this.c) {
            z = false;
        }
        this.c = z;
    }

    @Override  // fuvo
    protected final void d(fuvo fuvo0) {
        super.d(fuvo0);
        futd futd0 = this.a.c;
        futd0.E.remove(Long.valueOf(30000L));
        if(futd0.E.isEmpty()) {
            fwvq fwvq0 = futd0.af;
            if(fwvq0.a) {
                fwvq0.a();
            }
        }
        futd0.A(false, false);
    }

    @Override  // fuvo
    protected final void e() {
        this.c = true;
    }
}

