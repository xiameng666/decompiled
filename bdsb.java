public final class bdsb implements bdsg {
    public static final bdsb a;

    static {
        bdsb.a = new bdsb();
    }

    @Override  // bdsg
    public final bdsb a() {
        return bdsb.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bdsb)) {
            return false;
        }
        bdsb bdsb0 = (bdsb)object0;
        return true;
    }

    @Override
    public final int hashCode() {
        return 0x1513C7EF;
    }

    @Override
    public final String toString() {
        return "ErrorState";
    }
}

