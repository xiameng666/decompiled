import com.google.android.gms.location.ActivityRecognitionResult;

final class fuug extends futu {
    private boolean j;

    public fuug(futd futd0) {
        super(futd0);
        this.j = true;
    }

    @Override  // fusw
    public final void X(ActivityRecognitionResult activityRecognitionResult0) {
        if(!this.b) {
            this.o(activityRecognitionResult0);
            int v = this.j & (activityRecognitionResult0.d().a() == 3 ? 1 : 0);
            this.j = v;
            if(v != 0) {
                this.d.s(activityRecognitionResult0);
            }
        }
    }

    @Override  // fuvb
    public final String Y() {
        return "LowPowerStationaryDetectingState";
    }

    @Override  // futw
    public final void c(ActivityRecognitionResult activityRecognitionResult0) {
        super.c(activityRecognitionResult0);
        if(!this.b && activityRecognitionResult0.d().a() == 5) {
            this.j = false;
        }
    }

    @Override  // futw
    protected final int h() {
        return 5;
    }

    @Override  // futw
    protected final double k() {
        return 8.0;
    }

    @Override  // futw
    protected final fusr m() {
        futd futd0 = this.d;
        return futd0.u.h() ? null : futd0.B;
    }

    @Override  // futw
    protected final String n() {
        return "LowPowerDetector";
    }

    @Override  // futw
    protected final void q(long v) {
        if(this.b) {
            return;
        }
        if(this.j) {
            this.L(new fuuv(this.d));
            return;
        }
        futd futd0 = this.d;
        futd0.w(false, true);
        this.L(new fuuc(futd0));
    }
}

