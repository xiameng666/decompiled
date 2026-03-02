import j..util.Objects;

public final class iana {
    public final iakq a;
    public final iaof_metadata b;
    public final gRPCMethodDescriptor c;
    private final iamy d;

    public iana() {
        throw null;
    }

    public iana(gRPCMethodDescriptor iaoj0, iaof_metadata iaof0, iakq iakq0, iamy iamy0) {
        gftb.z(iaoj0, "method");
        this.c = iaoj0;
        gftb.z(iaof0, "headers");
        this.b = iaof0;
        gftb.z(iakq0, "callOptions");
        this.a = iakq0;
        gftb.z(iamy0, "pickDetailsConsumer");
        this.d = iamy0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && Objects.equals(this.a, ((iana)object0).a) && Objects.equals(this.b, ((iana)object0).b) && Objects.equals(this.c, ((iana)object0).c) && Objects.equals(this.d, ((iana)object0).d);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override
    public final String toString() {
        return "[method=" + this.c + " headers=" + this.b + " callOptions=" + this.a + "]";
    }
}

