import j..util.Objects;

public final class kau {
    public final Object a;
    public final Object b;

    public kau(Object object0, Object object1) {
        this.a = object0;
        this.b = object1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof kau) ? Objects.equals(((kau)object0).a, this.a) && Objects.equals(((kau)object0).b, this.b) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        Object object0 = this.b;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return v1 ^ v;
    }

    @Override
    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}

