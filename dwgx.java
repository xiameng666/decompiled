public final class dwgx implements ibts {
    final dwhd a;

    public dwgx(dwhd dwhd0) {
        this.a = dwhd0;
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

