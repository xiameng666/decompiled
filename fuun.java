import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;

final class fuun extends futu {
    public fuun(futd futd0) {
        super(futd0);
    }

    @Override  // fusw
    public final void X(ActivityRecognitionResult activityRecognitionResult0) {
    }

    @Override  // fuvb
    public final String Y() {
        return "PhonePositionDetectingInFutureState";
    }

    @Override  // futw
    protected final fusr m() {
        return null;
    }

    @Override  // futw
    protected final String n() {
        return "PhonePositionDetector";
    }

    @Override  // futw
    protected final void q(long v) {
        if(this.b) {
            return;
        }
        this.p();
    }

    @Override  // futw
    protected final void s() {
        futd futd0 = this.d;
        futd0.S = SystemClock.elapsedRealtime();
        futd0.U = SystemClock.elapsedRealtime();
    }

    @Override  // futw
    public final void v() {
        super.v();
        futd futd0 = this.d;
        if(!futd0.m.a) {
            futd0.z();
        }
    }
}

