final class duuz {
    public final fryv a;
    private final fryv b;

    public duuz(fryv fryv0) {
        this.a = fryv0;
        this.b = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof duuz)) {
            return false;
        }
        return ibuq.m(this.a, ((duuz)object0).a) ? ibuq.m(null, null) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "MdocTypeValues(title=" + this.a + ", subtitle=null)";
    }
}

