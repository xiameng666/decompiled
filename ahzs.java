final class ahzs {
    public final String a;
    public final int b;
    public final gged_interceptors c;

    public ahzs() {
        throw null;
    }

    public ahzs(String s, int v, gged_interceptors gged0) {
        this.a = s;
        this.b = v;
        this.c = gged0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ahzs) && this.a.equals(((ahzs)object0).a) && this.b == ((ahzs)object0).b && ggia.i(this.c, ((ahzs)object0).c);
    }

    @Override
    public final int hashCode() {
        return (this.b ^ (this.a.hashCode() ^ 1000003) * 1000003) * 1000003 ^ this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "RcsMessage{senderAddress=" + this.a + ", subscriptionId=" + this.b + ", rcsMessageParts=" + this.c + "}";
    }
}

