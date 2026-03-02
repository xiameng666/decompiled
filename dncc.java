public final class dncc implements ibts {
    final dnci a;

    public dncc(dnci dnci0) {
        this.a = dnci0;
        super();
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ltx ltx0 = (ltx)object0;
        ibnf ibnf0 = this.a.al;
        if(ibnf0 == null) {
            ibuq.j("viewModelImplProvider");
            ibnf0 = null;
        }
        return ibnf0.get();
    }
}

