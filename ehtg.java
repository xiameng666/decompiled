import j..time.Duration;
import java.io.Serializable;

public final class ehtg implements Serializable {
    public final Duration a;
    public final int b;
    public final float c;

    public ehtg() {
        throw null;
    }

    public ehtg(Duration duration0, int v, float f) {
        this.a = duration0;
        this.b = v;
        this.c = f;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ehtg) && this.a.equals(((ehtg)object0).a) && this.b == ((ehtg)object0).b && Float.floatToIntBits(this.c) == Float.floatToIntBits(((ehtg)object0).c);
    }

    @Override
    public final int hashCode() {
        return (this.b ^ (this.a.hashCode() ^ 1000003) * 1000003) * 1000003 ^ Float.floatToIntBits(this.c);
    }

    @Override
    public final String toString() {
        return "SndAlgorithmConfig{batchDuration=" + this.a + ", numBatches=" + this.b + ", peakThreshold=" + this.c + "}";
    }
}

