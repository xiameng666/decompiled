import java.util.Locale;

public final class kcx {
    public final kcv a;
    public final kcv b;
    public final kcv c;
    public final kbs d;
    public final long e;
    public final int f;

    public kcx(kcv kcv0, kcv kcv1, kcv kcv2, kbs kbs0, long v, int v1) {
        this.a = kcv0;
        this.b = kcv1;
        this.c = kcv2;
        this.d = kbs0;
        this.e = v;
        this.f = v1;
    }

    @Override
    public final String toString() {
        String s = String.format(Locale.US, "elapsedRealtime (ms) %d | distance (m) %f", ((long)(this.e / 1000000L)), ((float)this.a.b));
        kcv kcv0 = this.b;
        if(kcv0 != null) {
            s = s + String.format(Locale.US, " | azimuth: %f", ((float)kcv0.b));
        }
        kcv kcv1 = this.c;
        if(kcv1 != null) {
            s = s + String.format(Locale.US, " | elevation: %f", ((float)kcv1.b));
        }
        String s1 = s + String.format(Locale.US, " | rssi: %d", ((int)this.f));
        return this.d == null ? s1 : s1 + String.format(Locale.US, " | dlTdoa: %s", this.d);
    }
}

