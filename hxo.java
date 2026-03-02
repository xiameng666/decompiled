import java.util.Objects;

public final class hxo {
    public final hxl a;

    public hxo() {
        this.a = new hxl();
    }

    public final long a(long v) {
        if(jls.a(v) <= 0.0f || jls.b(v) <= 0.0f) {
            String s = jls.f(v);
            Objects.toString(s);
            hxt.d(("maximumVelocity should be a positive value. You specified=" + s));
        }
        return jlt.a(this.a.a.b(jls.a(v)), this.a.b.b(jls.b(v)));
    }

    public final void b(long v, long v1) {
        this.a.a(v, v1);
    }

    public final void c() {
        this.a.b();
    }
}

