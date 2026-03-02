public final class aape implements fhrs {
    public static final aape a;
    public final int b;
    public final int c;

    static {
        aape.a = new aape(0, 0);
    }

    public aape() {
        throw null;
    }

    public aape(int v, int v1) {
        this.b = v;
        this.c = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof aape) && this.b == ((aape)object0).b && this.c == ((aape)object0).c;
    }

    @Override
    public final int hashCode() {
        return this.c ^ (this.b ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "ScrollPosition{firstVisibleItemIndex=" + this.b + ", offset=" + this.c + "}";
    }
}

