public final class rhw {
    public final String a;
    public final gged_interceptors b;
    public final String c;
    private final String d;

    public rhw() {
        throw null;
    }

    public rhw(String s, gged_interceptors gged0, String s1, String s2) {
        this.a = s;
        this.b = gged0;
        this.c = s1;
        this.d = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof rhw) && this.a.equals(((rhw)object0).a) && ggia.i(this.b, ((rhw)object0).b) && this.c.equals(((rhw)object0).c) && this.d.equals(((rhw)object0).d);
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() ^ (((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "AcquireTemporaryTokenRequest{appId=" + this.a + ", operationTargets=" + this.b + ", companionTerminalId=" + this.c + ", targetTerminalEntitlementProtocol=" + this.d + "}";
    }
}

