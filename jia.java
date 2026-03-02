public final class jia {
    public final iwj a;
    public final jgz b;

    public jia(iwj iwj0, jgz jgz0) {
        this.a = iwj0;
        this.b = jgz0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof jia)) {
            return false;
        }
        return ibuq.m(this.a, ((jia)object0).a) ? ibuq.m(this.b, ((jia)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "TransformedText(text=" + this.a + ", offsetMapping=" + this.b + ')';
    }
}

