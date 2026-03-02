import j..time.Duration;

final class ghme extends ghmh {
    public ghme(Duration duration0, int v) {
        super(duration0, 1.0, v);
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = new ToStringHelper("uniformDelay");
        gfsv0.g("delay", this.b.toMillis());
        gfsv0.f("tries", this.a);
        return gfsv0.toString();
    }
}

