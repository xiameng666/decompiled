public final class bdsc implements bdsg {
    public static final bdsc a;

    static {
        bdsc.a = new bdsc();
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
        if(!(object0 instanceof bdsc)) {
            return false;
        }
        bdsc bdsc0 = (bdsc)object0;
        return true;
    }

    @Override
    public final int hashCode() {
        return -1065051553;
    }

    @Override
    public final String toString() {
        return "ExportBlockedState";
    }
}

