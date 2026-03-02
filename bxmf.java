public final class bxmf {
    public final boolean a;
    public final Object b;

    public bxmf() {
        throw null;
    }

    public bxmf(boolean z, Object object0) {
        this.a = z;
        this.b = object0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof bxmf) && this.a == ((bxmf)object0).a) {
            return this.b == null ? ((bxmf)object0).b == null : this.b.equals(((bxmf)object0).b);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.b == null ? 0 : this.b.hashCode();
        return this.a ? 0x16638EA4 ^ v : 0x16FC2542 ^ v;
    }

    @Override
    public final String toString() {
        return "Result{present=" + this.a + ", value=" + this.b + "}";
    }
}

