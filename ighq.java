final class ighq implements ighp {
    public final ighp a;

    private ighq(ighp ighp0) {
        this.a = ighp0;
    }

    @Override  // ighp
    public final int a() {
        return this.a.a();
    }

    static ighq b(ighp ighp0) {
        if((ighp0 instanceof ighm)) {
            return ((ighm)ighp0).a;
        }
        if((ighp0 instanceof ighq)) {
            return (ighq)ighp0;
        }
        return ighp0 == null ? null : new ighq(ighp0);
    }

    @Override  // ighp
    public final int c(ighl ighl0, CharSequence charSequence0, int v) {
        return this.a.c(ighl0, charSequence0, v);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof ighq) ? this.a.equals(((ighq)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

