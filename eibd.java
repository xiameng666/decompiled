public final class eibd {
    public final gui a;
    public final chb b;

    public eibd(gui gui0, chb chb0) {
        ibuq.f(gui0, "scale");
        ibuq.f(chb0, "alpha");
        super();
        this.a = gui0;
        this.b = chb0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eibd)) {
            return false;
        }
        return ibuq.m(this.a, ((eibd)object0).a) ? ibuq.m(this.b, ((eibd)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "WatermarkProperties(scale=" + this.a + ", alpha=" + this.b + ")";
    }
}

