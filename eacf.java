public final class eacf implements ibts {
    final eacl a;

    public eacf(eacl eacl0) {
        this.a = eacl0;
        super();
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ltx ltx0 = (ltx)object0;
        ibnf ibnf0 = this.a.a;
        if(ibnf0 == null) {
            ibuq.j("viewModelImplProvider");
            ibnf0 = null;
        }
        return ibnf0.get();
    }
}

