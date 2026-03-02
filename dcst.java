public final class dcst {
    public final String a;

    public dcst(String s) {
        ibuq.f(s, "idString");
        super();
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof dcst) ? ibuq.m(this.a, ((dcst)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "CloudSharingId(idString=" + this.a + ")";
    }
}

