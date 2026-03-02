import j..util.Objects;

public final class azgl {
    public final hlsi a;
    public final long b;

    public azgl(hlsi hlsi0, long v) {
        this.a = hlsi0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof azgl) ? this.b == ((azgl)object0).b && ((ProtoLiteMessage)this.a).equals(((azgl)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, ((long)this.b)});
    }
}

