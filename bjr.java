public final class bjr {
    public final String a;
    public final Object b;
    private final Class c;

    public bjr() {
        throw null;
    }

    public bjr(String s, Class class0, Object object0) {
        this.a = s;
        if(class0 == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.c = class0;
        this.b = object0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof bjr) && this.a.equals(((bjr)object0).a) && this.c.equals(((bjr)object0).c)) {
            return this.b == null ? ((bjr)object0).b == null : this.b.equals(((bjr)object0).b);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = (this.a.hashCode() ^ 1000003) * 1000003 ^ this.c.hashCode();
        return this.b == null ? v * 1000003 : this.b.hashCode() ^ v * 1000003;
    }

    @Override
    public final String toString() {
        return "Option{id=" + this.a + ", valueClass=" + this.c + ", token=" + this.b + "}";
    }
}

