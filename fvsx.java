import java.util.Locale;

public final class fvsx {
    public final long a;
    public final long b;

    public fvsx(long v, long v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fvsx) ? this == ((fvsx)object0) || this.a == ((fvsx)object0).a && this.b == ((fvsx)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return (((int)(this.b ^ this.b >>> 0x20)) + 0x1F) * 0x1F + ((int)(this.a ^ this.a >>> 0x20));
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "AlarmWindow[begin=%d, length=%d, end=%d]", ((long)this.a), ((long)this.b), ((long)(this.a + this.b)));
    }
}

