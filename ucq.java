import java.security.MessageDigest;

final class ucq implements uay {
    private final uay b;
    private final uay c;

    public ucq(uay uay0, uay uay1) {
        this.b = uay0;
        this.c = uay1;
    }

    @Override  // uay
    public final void a(MessageDigest messageDigest0) {
        this.b.a(messageDigest0);
        this.c.a(messageDigest0);
    }

    @Override  // uay
    public final boolean equals(Object object0) {
        return (object0 instanceof ucq) && this.b.equals(((ucq)object0).b) && this.c.equals(((ucq)object0).c);
    }

    @Override  // uay
    public final int hashCode() {
        return this.b.hashCode() * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + "}";
    }
}

