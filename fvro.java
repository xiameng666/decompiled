import java.util.Locale;

public final class fvro {
    public final long a;
    public final long b;
    public final long c;

    public fvro(long v, long v1, long v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "[Capacity: %d, Refill Amount: %d, Refill interval: %d]", ((long)this.c), ((long)this.a), ((long)this.b));
    }
}

