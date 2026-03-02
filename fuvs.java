import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.Date;
import java.util.List;

public final class fuvs implements fvtn {
    public final fwyd a;
    public final fwzp b;
    public final futd c;
    public final fuvq d;
    public fuvo e;
    public long f;
    private final futh g;
    private final fvwz h;
    private final List i;

    public fuvs(futh futh0, fwyd fwyd0, fvwz fvwz0, fwzp fwzp0, futd futd0, List list0) {
        fuvq fuvq0 = new fuvq(this);
        this.d = fuvq0;
        fuvn fuvn0 = new fuvn(this);
        this.e = fuvn0;
        this.f = -1L;
        this.g = futh0;
        this.a = fwyd0;
        this.h = fvwz0;
        this.b = fwzp0;
        this.c = futd0;
        this.i = list0;
        fuvq0.a(fuvn0, SystemClock.elapsedRealtime());
    }

    @Override  // fvtn
    public final void K(boolean z, int v) {
        if(z && v == 1) {
            this.e.e();
        }
    }

    public final void a(fuvo fuvo0) {
        long v = SystemClock.elapsedRealtime();
        this.e.a();
        String s = this.e.a() + " -> " + fuvo0.a();
        fvwx fvwx0 = new fvwx(71, this.h.f(), s, s.hashCode());
        this.h.a(fvwx0);
        this.e.d(fuvo0);
        this.e = fuvo0;
        fuvo0.a();
        this.d.a(fuvo0, v);
        this.e.c();
        List list0 = this.i;
        if(list0 != null) {
            for(Object object0: list0) {
                futk futk0 = (futk)object0;
            }
        }
    }

    public final void b(long v) {
        if(v != this.f) {
            this.f = v;
            new Date(fxbi.e() + v);
            this.b.c(fwzf.l, 2, v, fwzy.a);
        }
    }

    public final void c(boolean z) {
        this.h.g(72);
        DetectedActivity detectedActivity0 = new DetectedActivity(6, 100);
        long v = this.a.c();
        long v1 = SystemClock.elapsedRealtime();
        Bundle bundle0 = z ? cmmq.d(null, 100) : null;
        ActivityRecognitionResult activityRecognitionResult0 = new ActivityRecognitionResult(detectedActivity0, v, v1, fuxl.y.am, bundle0);
        this.g.mM(activityRecognitionResult0);
        List list0 = this.i;
        if(list0 != null) {
            for(Object object0: list0) {
                ((futk)object0).a.d.b(z);
            }
        }
        this.a(new fuvr(this));
    }

    public static boolean d(ActivityRecognitionResult activityRecognitionResult0) {
        return activityRecognitionResult0.d().a() == 0;
    }

    public static boolean e(ActivityRecognitionResult activityRecognitionResult0) {
        DetectedActivity detectedActivity0 = activityRecognitionResult0.d();
        return detectedActivity0.a() == 2 && ((long)detectedActivity0.e) >= hupk.a.d().e();
    }
}

