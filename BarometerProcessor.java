public final class BarometerProcessor extends GenericObservationProcessor {
    public static final long a;
    public double b;
    public double c;

    static {
        BarometerProcessor.a = TimeUtils.d(0.1);
    }

    public BarometerProcessor(BaseParticleFilter gpxs0) {
        super(gpxs0);
        this.b = -Infinity;
        this.c = 0.0;
    }
}

