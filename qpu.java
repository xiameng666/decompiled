public final class qpu {
    public Object a;
    public Object b;

    private static boolean a(Object object0, Object object1) {
        return object0 == object1 ? true : object0 != null && object0.equals(object1);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof kau) ? qpu.a(((kau)object0).a, this.a) && qpu.a(((kau)object0).b, this.b) : false;
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

