import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;

final class fuuc extends futu {
    public fuuc(futd futd0) {
        super(futd0);
    }

    @Override  // fusw
    public final void X(ActivityRecognitionResult activityRecognitionResult0) {
        if(this.b) {
            return;
        }
        this.d.s(activityRecognitionResult0);
        this.o(activityRecognitionResult0);
    }

    @Override  // fuvb
    public final String Y() {
        return "FullDetectingInFutureState";
    }

    @Override  // futw
    protected final fusr m() {
        futd futd0 = this.d;
        return futd0.u.h() ? null : futd0.z;
    }

    @Override  // futw
    protected final String n() {
        return "FullDetector";
    }

    @Override  // futw
    protected final void q(long v) {
        if(this.b) {
            return;
        }
        if(v == 0x7FFFFFFFFFFFFFFFL) {
            this.p();
            return;
        }
        this.d.u(SystemClock.elapsedRealtime() + v);
    }

    @Override  // futw
    public final void v() {
        super.v();
        futd futd0 = this.d;
        if(!futd0.m.a) {
            futd0.z();
        }
    }

    @Override  // fuvb
    protected final void w() {
        this.t();
    }

    @Override  // fuvb
    protected final void x(boolean z) {
    }
}

