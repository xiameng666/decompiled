import java.util.concurrent.TimeUnit;

public final class bdvu {
    public final String a;
    public final long b;

    public bdvu() {
        throw null;
    }

    public bdvu(String s, long v) {
        if(s == null) {
            throw new NullPointerException("Null url");
        }
        this.a = s;
        this.b = v;
    }

    public static bdvu a(String s) {
        return new bdvu(s, TimeUnit.SECONDS.toMillis(30L));
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bdvu) && this.a.equals(((bdvu)object0).a) && this.b == ((bdvu)object0).b;
    }

    @Override
    public final int hashCode() {
        return ((int)(this.b ^ this.b >>> 0x20)) ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "Request{url=" + this.a + ", timeoutMillis=" + this.b + "}";
    }
}

