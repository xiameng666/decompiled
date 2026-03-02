public final class fmmf {
    public final String a;
    public final int b;
    public final int c;

    public fmmf() {
        throw null;
    }

    public fmmf(String s, int v, int v1) {
        this.a = s;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmmf) && this.a.equals(((fmmf)object0).a) && this.b == ((fmmf)object0).b && this.c == ((fmmf)object0).c;
    }

    @Override
    public final int hashCode() {
        return this.c ^ ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003;
    }

    @Override
    public final String toString() {
        return "StatusBadge{text=" + this.a + ", backgroundColor=" + this.b + ", textColor=" + this.c + "}";
    }
}

