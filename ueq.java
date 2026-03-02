final class ueq implements uev {
    int a;
    public Class b;
    private final uer c;

    public ueq(uer uer0) {
        this.c = uer0;
    }

    @Override  // uev
    public final void a() {
        this.c.c(this);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ueq) && this.a == ((ueq)object0).a && this.b == ((ueq)object0).b;
    }

    @Override
    public final int hashCode() {
        int v = this.a * 0x1F;
        return this.b == null ? v : v + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "Key{size=" + this.a + "array=" + this.b + "}";
    }
}

