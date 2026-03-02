import j..util.Objects;

public final class duan {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public duan(long v, long v1, long v2, long v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof duan) && this.a == ((duan)object0).a && this.b == ((duan)object0).b && this.c == ((duan)object0).c && this.d == ((duan)object0).d;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((long)this.a), ((long)this.b), ((long)this.c), ((long)this.d)});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.g("signed", this.a);
        gfsv0.g("validFrom", this.b);
        gfsv0.g("validUntil", this.c);
        gfsv0.g("expectedUpdate", this.d);
        return gfsv0.toString();
    }
}

