import j..util.Objects;

public final class iamf {
    public final String a;
    public final iame b;
    public final long c;
    public final iamq d;
    public final iamq e;

    public iamf(String s, iame iame0, long v, iamq iamq0) {
        this.a = s;
        gftb.z(iame0, "severity");
        this.b = iame0;
        this.c = v;
        this.d = null;
        this.e = iamq0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof iamf) && Objects.equals(this.a, ((iamf)object0).a) && Objects.equals(this.b, ((iamf)object0).b) && this.c == ((iamf)object0).c && Objects.equals(null, null) && Objects.equals(this.e, ((iamf)object0).e);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, ((long)this.c), 0, this.e});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("description", this.a);
        gfsv0.add("severity", this.b);
        gfsv0.g("timestampNanos", this.c);
        gfsv0.add("channelRef", null);
        gfsv0.add("subchannelRef", this.e);
        return gfsv0.toString();
    }
}

