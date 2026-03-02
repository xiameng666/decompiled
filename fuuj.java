import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.Date;

abstract class fuuj extends fuvb implements fwzs {
    public fuuj(futd futd0) {
        super(futd0);
    }

    @Override  // fuvb
    protected final void V(fvuu fvuu0, fvuu fvuu1) {
        if(fvuu1.b == 2 && (fvuu1.a >= 0.7)) {
            this.d.w(false, true);
            this.A(39L);
        }
    }

    @Override  // fwzs
    public final void Z() {
        this.b(humr.a.f().A());
    }

    @Override  // fuvb
    protected final void a(boolean z) {
        if(!z) {
            this.b(false);
        }
    }

    public void b(boolean z) {
        throw null;
    }

    @Override  // fuvb
    public void u() {
        super.u();
        futd futd0 = this.d;
        futd0.i();
        if(futd0.F()) {
            long v = new fuuf(futd0, this.g).b();
            futd0.n = new fvsx(v, 0L);
            new Date(fxbi.e() + v);
            futd0.h.l(fwzf.i, v, futd0.J.c);
        }
    }

    @Override  // fuvb
    protected final void w() {
        futd futd0 = this.d;
        if(futd0.I()) {
            this.L(new fuuc(futd0));
        }
    }

    @Override  // fuvb
    protected final void x(boolean z) {
        ActivityRecognitionResult activityRecognitionResult0 = new ActivityRecognitionResult(new DetectedActivity(3, 100), this.g.c(), SystemClock.elapsedRealtime(), fuxl.p.am, null);
        futd futd0 = this.d;
        futd0.s(activityRecognitionResult0);
        if(!futd0.C()) {
            this.A(39L);
        }
    }
}

