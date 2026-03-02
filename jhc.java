public final class jhc {
    public final String a;

    public jhc() {
        this(null);
    }

    public jhc(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof jhc) ? ibuq.m(this.a, ((jhc)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "PlatformImeOptions(privateImeOptions=" + this.a + ')';
    }
}

