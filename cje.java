public final class cje extends cjd {
    public final int c;

    public cje(Object object0, cie cie0) {
        super(object0, cie0);
        this.c = 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof cje) ? ibuq.m(((cje)object0).a, this.a) && ibuq.m(((cje)object0).b, this.b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 961 + this.b.hashCode();
    }
}

