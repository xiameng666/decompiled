import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;

final class fuvd extends futu {
    public fuvd(futd futd0) {
        super(futd0);
    }

    @Override  // fusw
    public final void X(ActivityRecognitionResult activityRecognitionResult0) {
        throw new UnsupportedOperationException();
    }

    @Override  // fuvb
    public final String Y() {
        return "TiltDetectingInFutureState";
    }

    @Override  // futw
    protected final int h() {
        return 5;
    }

    @Override  // futw
    protected final fusr m() {
        futd futd0 = this.d;
        return futd0.u.h() ? null : futd0.C;
    }

    @Override  // futw
    protected final String n() {
        return "TiltDetector";
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

