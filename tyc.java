public class tyc implements Cloneable {
    public final upr a;

    public tyc() {
        this.a = ups.b;
    }

    public final tyc a() {
        try {
            return (tyc)super.clone();
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new RuntimeException(cloneNotSupportedException0);
        }
    }

    @Override
    public final Object clone() {
        return this.a();
    }

    @Override
    public boolean equals(Object object0) {
        return (object0 instanceof tyc) ? uqq.j(this.a, ((tyc)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

