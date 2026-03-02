public final class fuih extends fuij {
    public final fryk a;
    private final int b;

    public fuih() {
        this(null, 3);
    }

    public fuih(fryk fryk0, int v) {
        if(1 == (v & 1)) {
            fryk0 = null;
        }
        this.a = fryk0;
        this.b = 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof fuih) ? ibuq.m(this.a, ((fuih)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : ((fryh)this.a).a * 0x1F;
    }

    @Override
    public final String toString() {
        return "Custom(icon=" + this.a + ", statusColor=null)";
    }
}

