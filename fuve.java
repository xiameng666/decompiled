import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;

final class fuve extends futv {
    public fuve(futd futd0) {
        super(futd0);
    }

    @Override  // fusw
    public final void X(ActivityRecognitionResult activityRecognitionResult0) {
        throw new UnsupportedOperationException();
    }

    @Override  // fuvb
    public final String Y() {
        return "TiltDetectingInPastState";
    }

    @Override  // futv
    public final long i() {
        return 450000000L;
    }

    @Override  // futw
    protected final fusr m() {
        futd futd0 = this.d;
        return futd0.u.h() ? null : futd0.C;
    }

    @Override  // futw
    protected final String n() {
        return "TiltDetectorInPast";
    }

    @Override  // futw
    protected final void q(long v) {
        if(this.b) {
            return;
        }
        this.L(new fuuv(this.d));
    }

    @Override  // futw
    protected final void s() {
        futd futd0 = this.d;
        futd0.S = SystemClock.elapsedRealtime();
    }
}

