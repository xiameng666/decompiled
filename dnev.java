public final class dnev implements ibts {
    final dnfc a;

    public dnev(dnfc dnfc0) {
        this.a = dnfc0;
        super();
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ltx ltx0 = (ltx)object0;
        ibnf ibnf0 = this.a.ah;
        if(ibnf0 == null) {
            ibuq.j("viewModelProvider");
            ibnf0 = null;
        }
        return ibnf0.get();
    }
}

