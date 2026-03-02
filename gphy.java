import j..time.Instant;

public final class gphy {
    public final String a;
    public final Instant b;
    public final Instant c;

    public gphy(String s, Instant instant0) {
        this(s, instant0, null);
    }

    public gphy(String s, Instant instant0, Instant instant1) {
        this.a = s;
        gftb.check(instant0);
        this.b = instant0;
        this.c = instant1;
    }

    public final String a() {
        return Long.toString(this.b.toEpochMilli());
    }
}

