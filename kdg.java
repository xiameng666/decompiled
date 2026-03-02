import j..util.Objects;

public final class kdg {
    public final int a;
    public final int b;

    public kdg(int v, int v1) {
        boolean z = true;
        gftb.h(v <= 0xFFFF, "Uwb Range Max Number of Measurements %s should be less than %s", v, 0xFFFF);
        if(v1 > 0xFFFF) {
            z = false;
        }
        gftb.d(z, "UWB Range Max Ranging Round Retries should be less than and %s", 0xFFFF);
        this.a = v;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof kdg) ? this.a == ((kdg)object0).a && this.b == ((kdg)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), ((int)this.b)});
    }

    @Override
    public final String toString() {
        return "UwbRangeLimitsConfig{rangeMaxNumberOfMeasurements=" + this.a + ", rangeMaxRangingRoundRetries=" + this.b + "}";
    }
}

