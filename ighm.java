final class ighm implements ighp {
    public final ighq a;

    private ighm(ighq ighq0) {
        this.a = ighq0;
    }

    @Override  // ighp
    public final int a() {
        return this.a.a();
    }

    static ighp b(ighq ighq0) {
        if((ighq0 instanceof ighq)) {
            return ighq0;
        }
        return ighq0 == null ? null : new ighm(ighq0);
    }

    @Override  // ighp
    public final int c(ighl ighl0, CharSequence charSequence0, int v) {
        return this.a.a.c(ighl0, charSequence0.toString(), v);
    }
}

