public final class fvgb {
    public final fvgf a;
    public final fvgk b;
    public final double c;
    public final double d;
    public final fvgd e;

    public fvgb(fvga fvga0) {
        fvgf fvgf0 = fvga0.a;
        gfuy.d(fvgf0, "GnssChannelMeasurement cannot be null.", new Object[0]);
        this.a = fvgf0;
        this.b = fvga0.b;
        this.c = fvga0.c;
        this.d = 0.0;
        if(fvga0.d == null) {
            fvga0.d = new fvgc();
        }
        fvga0.d.a = fvgf0.b;
        this.e = new fvgd(fvga0.d);
    }

    public final double a() {
        double f = this.c;
        fvgd fvgd0 = this.e;
        double f1 = fvgd0.c;
        if(!Double.isNaN(f1)) {
            f += f1;
        }
        double f2 = fvgd0.b;
        if(!Double.isNaN(f2)) {
            f -= f2;
        }
        if(!Double.isNaN(NaN)) {
            f += NaN;
        }
        double f3 = fvgd0.d;
        if(!Double.isNaN(f3)) {
            f -= f3;
        }
        return Double.isNaN(fvgd0.e) ? f : f - fvgd0.e;
    }

    @Override
    public final String toString() {
        return String.format("GnssChannel<\nchnMeas: %s\nsatPvtAtTransmitTime: %s\nrawPrM: %s\nrawPrUncertaintyM: %s\nchnCorr: %s\n>", this.a, this.b, ((double)this.c), ((double)0.0), this.e);
    }
}

