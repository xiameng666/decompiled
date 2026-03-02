public final class cgm {
    public final chb a;
    public long b;

    public cgm(chb chb0, long v) {
        this.a = chb0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof cgm)) {
            return false;
        }
        return ibuq.m(this.a, ((cgm)object0).a) ? jlk.c(this.b, ((cgm)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + jlj.a(this.b);
    }

    @Override
    public final String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + jlk.a(this.b) + ')';
    }
}

