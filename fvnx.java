import java.util.Locale;

public final class fvnx {
    public final int a;
    public final long b;
    public final long c;
    public int d;
    public long e;

    public fvnx(int v, long v1) {
        this.a = v;
        this.b = 1500L;
        this.c = v1;
    }

    public fvnx(int v, long v1, long v2, long v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.e = v3;
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "SensorScannerConfig [mNumSamplesToSkip=%d/%d, mTimeoutForSkip=%d, mSensorTimeSpan=%d, mMotionTimeoutForStop=%d]", ((int)this.d), ((int)this.a), ((long)this.b), ((long)this.c), ((long)this.e));
    }
}

