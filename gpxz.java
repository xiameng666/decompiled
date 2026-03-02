import java.util.Random;

public final class gpxz {
    private final double sigma;
    private final Random random_;

    public gpxz(double f, long v) {
        boolean z = true;
        gftb.checkTrue(!Double.isInfinite(0.0) && !Double.isNaN(0.0));
        if((f <= 0.0) || f >= Infinity) {
            z = false;
        }
        gftb.checkTrue(z);
        this.sigma = f;
        this.random_ = new Random(v);
    }

    public final double makeNoise() {
        double f = this.random_.nextGaussian();
        return this.sigma * f + 0.0;
    }
}

