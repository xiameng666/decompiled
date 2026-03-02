final class ekdx {
    public final String a;
    public final String b;
    public final long c;

    public ekdx() {
        throw null;
    }

    public ekdx(String s, String s1, long v) {
        this.a = s;
        if(s1 == null) {
            throw new NullPointerException("Null label");
        }
        this.b = s1;
        this.c = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof ekdx) && this.a.equals(((ekdx)object0).a) && this.b.equals(((ekdx)object0).b) && this.c == ((ekdx)object0).c;
    }

    @Override
    public final int hashCode() {
        return ((int)(this.c ^ this.c >>> 0x20)) ^ ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "PhoneValue{address=" + this.a + ", label=" + this.b + ", rawContactId=" + this.c + "}";
    }
}

