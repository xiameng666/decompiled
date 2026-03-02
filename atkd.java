import java.io.Closeable;

public abstract class atkd implements Closeable {
    protected final athv a;

    protected atkd(arad arad0) {
        this.a = athv.a(arad0);
    }

    public abstract long a();

    public abstract atke b();

    protected final void c(atjy atjy0) {
        atjz atjz0 = atjy0.b;
        if(!(atjz0 instanceof atjv) && !(atjz0 instanceof atlc)) {
            throw new IllegalArgumentException("unsupported ChunkContent type: " + atjz0.getClass());
        }
        if(!(atjz0 instanceof atlc)) {
            return;
        }
        gftb.f(this.a.c(atjy0.a), "reference chunk %s not found in old listing", atjy0.a);
        atlc atlc0 = this.a.b(atjy0.a);
        gftb.m(((atlc)atjz0).equals(atlc0), "inconsistent chunk content (chunk: %s; content in old listing: %s)", atjy0, atlc0);
    }

    public abstract void d(atjy arg1);
}

