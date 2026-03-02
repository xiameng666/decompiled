import j..time.Duration;

final class ghmg extends ghmh {
    public ghmg(Duration duration0, double f, int v) {
        super(duration0, f, v);
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = new ToStringHelper("exponentialBackoff");
        gfsv0.g("firstDelayMs", this.b.toMillis());
        gfsv0.e("multiplier", this.c);
        gfsv0.f("tries", this.a);
        return gfsv0.toString();
    }
}

