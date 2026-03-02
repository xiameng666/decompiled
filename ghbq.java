import j..util.Objects;
import java.io.Serializable;

public final class ghbq implements Serializable {
    public static final gged_interceptors a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    static {
        ggdy ggdy0 = new ggdy();
        for(int v = 0; v < 6; ++v) {
            ggdy0.i(new ggyi(ggym.x(v)));
        }
        ghbq.a = ggdy0.h();
    }

    public ghbq(ghbm ghbm0) {
        this.b = ghbm0.a;
        this.c = ghbm0.b;
        this.d = 1;
        this.e = ghbm0.c;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ghbq) && this.b == ((ghbq)object0).b && this.c == ((ghbq)object0).c && this.e == ((ghbq)object0).e;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.b), ((int)this.c), ((int)1), ((int)this.e)});
    }
}

