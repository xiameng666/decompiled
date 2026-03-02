import java.util.Locale;

public final class fvgf {
    public final fvgh a;
    public final fvel b;
    public final double c;
    public final int d;
    public final fvhw e;
    public final long f;
    public final double g;
    public final int h;
    public final double i;
    public final float j;
    public final double k;
    public final double l;
    public final int m;
    public final String n;

    public fvgf(fvge fvge0) {
        fvgh fvgh0 = fvge0.b;
        if(fvgh0 == null) {
            if(fvge0.a == null) {
                fvge0.a = new fvgg();
            }
            fvgh0 = new fvgh(fvge0.a);
        }
        this.a = fvgh0;
        this.b = fvge0.c;
        this.c = fvge0.d;
        this.d = fvge0.e;
        this.e = fvge0.f;
        this.f = fvge0.g;
        this.g = fvge0.h;
        this.h = fvge0.i;
        this.i = fvge0.j;
        this.j = fvge0.k;
        this.k = fvge0.l;
        this.l = fvge0.m;
        this.m = fvge0.n;
        this.n = fvge0.o;
    }

    public final boolean a() {
        return !Double.isNaN(this.j) && fvgf.b(this.b.a.a, this.d, this.b.b) && this.e != null;
    }

    public static boolean b(int v, int v1, fven fven0) {
        switch(v) {
            case 3: {
                return fvgf.c(v1) && ((v1 & 0x80) != 0 || (0x8000 & v1) != 0);
            }
            case 1: 
            case 4: 
            case 5: {
                return fvgf.c(v1) && fvgf.d(v1);
            }
            case 6: {
                return fven0.bQ == fveh.i ? (fvgf.c(v1) || (v1 & 0x400) != 0) && fvgf.d(v1) : fvgf.c(v1) && fvgf.d(v1);
            }
            default: {
                return false;
            }
        }
    }

    private static boolean c(int v) {
        return (v & 1) != 0;
    }

    private static boolean d(int v) {
        return (v & 8) != 0 || (v & 0x4000) != 0;
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.US;
        String s = this.b.b();
        return String.format(locale0, "GnssChannelMeasurement<\nhardwareClockTimeNanos: %d\nhardwareClockTimeUncNs: %f\nhardwareClockFullBiasNs: %d\nhardwareClockBiasNs: %f\nhardwareClockBiasUncNs: %f\nhardwareClockDriftNsps: %f\nhardwareClockDriftUncNsps: %f\nhardwareClockDiscontinuityCount: %d\nsignalId: %s\ncarrierFrequencyHz: %f\nstate: %s\nreceivedSvGnssTime: %s\nreceivedSvTimeUncertaintyNs: %d\naccumulatedDeltaRangeM: %f\naccumulatedDeltaRangeState: %d\nprRateMps: %f\ncn0DbHz: %f\naccumulatedDeltaRangeUncertaintyM: %f\nprRateUncertaintyMps: %f\nmultipathIndicator: %d\nagcDb: %f\ncodeType: %s\n>", ((long)this.a.b), ((double)this.a.c), ((long)this.a.d), ((double)this.a.e), ((double)this.a.f), ((double)this.a.g), ((double)this.a.h), ((int)this.a.i), s, ((double)this.c), ((int)this.d), this.e, ((long)this.f), ((double)this.g), ((int)this.h), ((double)this.i), ((float)this.j), ((double)this.k), ((double)this.l), ((int)this.m), ((double)0.0), this.n);
    }
}

