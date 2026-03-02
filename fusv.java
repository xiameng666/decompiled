import java.util.Locale;

public final class fusv {
    public static final fusv a;
    public final int b;
    public final String c;
    private final Long d;

    static {
        fusv.a = fusv.d(0x7FFFFFFFFFFFFFFFL);
    }

    private fusv(int v, Long long0, String s) {
        this.b = v;
        this.d = long0;
        this.c = s;
    }

    public final long a() {
        return this.b == 0 ? ((long)this.d) : 0x7FFFFFFFFFFFFFFFL;
    }

    public static fusv b(String s) {
        gftb.check(s);
        return new fusv(2, null, s);
    }

    public static fusv c(long v) {
        return new fusv(1, v, null);
    }

    public static fusv d(long v) {
        gftb.checkTrue(Long.compare(v, 0L) >= 0);
        return new fusv(0, v, null);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Error [errorCode=");
        int v = this.b;
        if(v == 0) {
            stringBuilder0.append(String.format(Locale.US, "ERROR_CODE_SUCCESS, skipTimeMillis=%d]", this.d));
            return stringBuilder0.toString();
        }
        if(v == 1) {
            stringBuilder0.append(String.format(Locale.US, "ERROR_CODE_INSUFFICIENT_SAMPLES, numOfSamples=%d]", this.d));
            return stringBuilder0.toString();
        }
        stringBuilder0.append("ERROR_CODE_FATAL]");
        return stringBuilder0.toString();
    }
}

