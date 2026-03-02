public final class dujb {
    public final fryv a;
    public final int b;

    public dujb(fryv fryv0, int v) {
        this.a = fryv0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dujb)) {
            return false;
        }
        return ibuq.m(this.a, ((dujb)object0).a) ? this.b == ((dujb)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        return "DataElementContent(text=" + this.a + ", icon=" + this.b + ")";
    }
}

