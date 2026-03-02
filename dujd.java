public final class dujd {
    public final fryv a;
    public final frxt b;

    public dujd(fryv fryv0) {
        this(fryv0, new frxt(0x7FFFFFFF, 6));
    }

    public dujd(fryv fryv0, frxt frxt0) {
        this.a = fryv0;
        this.b = frxt0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dujd)) {
            return false;
        }
        return ibuq.m(this.a, ((dujd)object0).a) ? ibuq.m(this.b, ((dujd)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b == null ? v : v + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "LoadingState(title=" + this.a + ", animationOptions=" + this.b + ")";
    }
}

