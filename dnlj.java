public final class dnlj implements ibts {
    final dnlp a;

    public dnlj(dnlp dnlp0) {
        this.a = dnlp0;
        super();
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ltx ltx0 = (ltx)object0;
        ibnf ibnf0 = this.a.ah;
        if(ibnf0 == null) {
            ibuq.j("viewModelImplProvider");
            ibnf0 = null;
        }
        return ibnf0.get();
    }
}

