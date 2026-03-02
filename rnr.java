import j..util.Objects;

public final class rnr implements rnp {
    public final String a;

    public rnr(String s) {
        this.a = s;
    }

    @Override  // rnp
    public final rnr a() {
        return this;
    }

    @Override  // rnp
    public final String b() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof rnr) ? Objects.equals(((rnr)object0).a, this.a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "NonSensitiveString(" + this.a + ")";
    }
}

