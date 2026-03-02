public final class byim {
    public final String a;
    public final String b;

    public byim(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof byim)) {
            return false;
        }
        return ibuq.m(this.a, ((byim)object0).a) ? ibuq.m(this.b, ((byim)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "TypefaceNames(brand=" + this.a + ", plain=" + this.b + ")";
    }
}

