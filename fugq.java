public final class fugq extends fugv {
    public final fryk a;
    private final fryv b;

    public fugq(fryk fryk0) {
        this.a = fryk0;
        this.b = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fugq)) {
            return false;
        }
        return ibuq.m(this.a, ((fugq)object0).a) ? ibuq.m(null, null) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Bank(icon=" + this.a + ", contentDescription=null)";
    }
}

