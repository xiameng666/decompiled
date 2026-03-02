import j..time.Duration;
import j..util.Objects;

public final class ghmk extends ghml {
    private final Duration a;
    private final Duration b;

    public ghmk(Duration duration0, Duration duration1) {
        glxr.b(duration0);
        this.a = duration0;
        glxr.c(duration1);
        this.b = duration1;
    }

    @Override  // ghml
    public final Duration a(int v) {
        return this.c(v, Duration.ofNanos(glun.e(glxr.a(this.a), v)));
    }

    @Override  // ghml
    public final Duration c(int v, Duration duration0) {
        ghml.h(v);
        glxr.b(duration0);
        if(v == 0) {
            return Duration.ZERO;
        }
        Duration duration1 = this.b.minus(duration0);
        return duration1.isNegative() || duration1.isZero() ? ghml.d : ((Duration)ggbb.b(duration1, this.a));
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ghmk) && this.a.equals(((ghmk)object0).a) && this.b.equals(((ghmk)object0).b);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = new ToStringHelper("timed");
        gfsv0.g("delayMs", this.a.toMillis());
        gfsv0.g("totalMs", this.b.toMillis());
        return gfsv0.toString();
    }
}

