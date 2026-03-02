public final class ajq extends ajk {
    public final int a;

    public ajq(int v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ajq) ? this.a == ((ajq)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return Integer.valueOf(this.a).hashCode();
    }

    @Override
    public final String toString() {
        return "{indexingType: " + this.a + "}";
    }
}

