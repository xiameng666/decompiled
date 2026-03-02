public final class dxpg implements ibts {
    final dxpm a;

    public dxpg(dxpm dxpm0) {
        this.a = dxpm0;
        super();
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ltx ltx0 = (ltx)object0;
        ibnf ibnf0 = this.a.b;
        if(ibnf0 == null) {
            ibuq.j("viewModelProvider");
            ibnf0 = null;
        }
        return ibnf0.get();
    }
}

