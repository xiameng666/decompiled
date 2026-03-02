public final class ehhn {
    public final Object a;
    public final Object b;

    public ehhn() {
        throw null;
    }

    public ehhn(Object object0, Object object1) {
        this.a = object0;
        this.b = object1;
    }

    public static ehhm a() {
        ehhm ehhm0 = new ehhm();
        ehhm0.a = null;
        return ehhm0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof ehhn) && this.a.equals(((ehhn)object0).a)) {
            return this.b == null ? ((ehhn)object0).b == null : this.b.equals(((ehhn)object0).b);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        return this.b == null ? v * 1000003 : this.b.hashCode() ^ v * 1000003;
    }

    @Override
    public final String toString() {
        return "MatchedApiEntry{apiEntry=" + this.a + ", localMatch=" + this.b + "}";
    }
}

