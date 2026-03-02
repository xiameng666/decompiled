import j..time.Duration;
import j..util.Objects;

class ghmh extends ghml {
    final int a;
    final Duration b;
    final double c;

    public ghmh(Duration duration0, double f, int v) {
        ghml.j(v);
        this.a = v;
        glxr.c(duration0);
        this.b = duration0;
        gftb.m(f > 0.0, "%s (%s) must be > 0", "multiplier", Double.valueOf(f));
        this.c = f;
    }

    @Override  // ghml
    public final Duration a(int v) {
        if(v == 0) {
            return Duration.ZERO;
        }
        return this.b(v) ? Duration.ofNanos(((long)(((double)glxr.a(this.b)) * Math.pow(this.c, v - 1)))) : ghml.d;
    }

    @Override  // ghml
    public final boolean b(int v) {
        ghml.h(v);
        return v < this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ghmh) && this.b.equals(((ghmh)object0).b) && this.c == ((ghmh)object0).c && this.a == ((ghmh)object0).a;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), this.b, ((double)this.c)});
    }
}

