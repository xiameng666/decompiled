import java.util.logging.Level;

public final class foph {
    public final Level a;
    public final String b;
    public final String c;
    public final long d;

    public foph() {
        throw null;
    }

    public foph(Level level0, String s, String s1, long v) {
        this.a = level0;
        if(s == null) {
            throw new NullPointerException("Null logFormat");
        }
        this.b = s;
        this.c = s1;
        this.d = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof foph) && this.a.equals(((foph)object0).a) && this.b.equals(((foph)object0).b) && this.c.equals(((foph)object0).c) && this.d == ((foph)object0).d;
    }

    @Override
    public final int hashCode() {
        return ((int)(this.d ^ this.d >>> 0x20)) ^ (((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "AbseilLogData{logLevel=" + this.a.toString() + ", logFormat=" + this.b + ", fileName=" + this.c + ", threadId=" + this.d + "}";
    }
}

