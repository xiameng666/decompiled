import android.os.SystemClock;

final class fuub extends fuud {
    public fuub(futd futd0) {
        super(futd0, true);
    }

    @Override  // fuud
    public final String Y() {
        return "FullAndOffBodyDetectingInPastState";
    }

    @Override  // fuud
    protected final String n() {
        return "FullAndOffBodyDetectorInPast";
    }

    @Override  // futw
    protected final void s() {
        super.s();
        futd futd0 = this.d;
        futd0.T = SystemClock.elapsedRealtime();
    }
}

