import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;

final class fuua extends futu {
    public fuua(futd futd0) {
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
        return "FullAndOffBodyDetectingInFutureState";
    }

    @Override  // futw
    protected final fusr m() {
        return this.d.z;
    }

    @Override  // futw
    protected final String n() {
        return "FullAndOffBodyDetector";
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
    protected final void s() {
        super.s();
        futd futd0 = this.d;
        futd0.T = SystemClock.elapsedRealtime();
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
}

