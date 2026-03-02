public final class dwfs implements ibts {
    final dwfy a;

    public dwfs(dwfy dwfy0) {
        this.a = dwfy0;
        super();
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ltx ltx0 = (ltx)object0;
        ibnf ibnf0 = this.a.d;
        if(ibnf0 == null) {
            ibuq.j("viewModelImplProvider");
            ibnf0 = null;
        }
        return ibnf0.get();
    }
}

