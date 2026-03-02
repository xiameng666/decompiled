public final class zop extends aaem {
    public final String a;

    public zop(String s) {
        ibuq.f(s, "title");
        super();
        this.a = s;
    }

    @Override  // aaem
    public final int a() {
        return 11;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof zop) ? ibuq.m(this.a, ((zop)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "SearchSectionTitleListItem(title=" + this.a + ")";
    }
}

