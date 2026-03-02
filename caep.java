public final class caep {
    public final long a;
    public final String b;

    public caep(long v, String s) {
        ibuq.f(s, "accountName");
        super();
        this.a = v;
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof caep)) {
            return false;
        }
        return this.a == ((caep)object0).a ? ibuq.m(this.b, ((caep)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return ((int)(this.a ^ this.a >>> 0x20)) * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "SelectedAccountEntity(id=" + this.a + ", accountName=" + this.b + ")";
    }
}

