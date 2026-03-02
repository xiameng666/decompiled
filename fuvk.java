import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import j..util.Objects;

public final class fuvk extends fuvo {
    final fuvs a;
    private long b;
    private long c;
    private int d;

    public fuvk(fuvs fuvs0) {
        Objects.requireNonNull(fuvs0);
        this.a = fuvs0;
        super(fuvs0);
        this.c = -1L;
        this.d = 0;
    }

    @Override  // fuvo
    public final String a() {
        return "ConfirmingInVehicle";
    }

    @Override  // fuvo
    public final void b(ActivityRecognitionResult activityRecognitionResult0) {
        if(fuvs.d(activityRecognitionResult0)) {
            fuvs fuvs0 = this.a;
            if(SystemClock.elapsedRealtime() - this.c >= 60000L) {
                this.c = SystemClock.elapsedRealtime();
                int v = this.d + 1;
                this.d = v;
                if(v <= 1 || SystemClock.elapsedRealtime() - this.b <= 180000L) {
                    return;
                }
                fuvs0.a(new fuvl(fuvs0));
                return;
            }
        }
        if(!fuvs.e(activityRecognitionResult0) && SystemClock.elapsedRealtime() - this.c <= 900000L) {
            return;
        }
        fuvr fuvr0 = new fuvr(this.a);
        this.a.a(fuvr0);
    }

    @Override  // fuvo
    protected final void c() {
        long v = SystemClock.elapsedRealtime();
        this.b = v;
        this.c = v;
        this.a.c.g(120000L, false);
    }

    @Override  // fuvo
    protected final void d(fuvo fuvo0) {
        super.d(fuvo0);
        this.a.c.r(120000L);
    }
}

