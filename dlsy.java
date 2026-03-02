public final class dlsy implements ibts {
    final dlte a;

    public dlsy(dlte dlte0) {
        this.a = dlte0;
        super();
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ltx ltx0 = (ltx)object0;
        ibnf ibnf0 = this.a.c;
        if(ibnf0 == null) {
            ibuq.j("viewModelProvider");
            ibnf0 = null;
        }
        return ibnf0.get();
    }
}

