public final class fvgd {
    public final fvel a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;

    public fvgd(fvgc fvgc0) {
        this.a = fvgc0.a;
        this.b = fvgc0.b;
        this.c = fvgc0.c;
        this.d = fvgc0.d;
        this.e = fvgc0.e;
    }

    @Override
    public final String toString() {
        Double double0 = (double)NaN;
        return String.format("GnssChannelCorrection<\nsignalId: %s\ninterSignalRangeBiasM: %s\ninterSignalCn0BiasDbHz: %s\nsatClkBiasM: %s\nprSmoothingCorrM: %s\nprSmoothingCorrVarM2: %s\nionoDelayM: %s\ntropoDelayM: %s\n>", this.a.b(), ((double)this.b), ((double)0.0), ((double)this.c), double0, double0, ((double)this.d), ((double)this.e));
    }
}

