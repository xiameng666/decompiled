public final class foyq implements ibnf {
    public final ibnf a;
    public final gful_cronetEngineProvider b;
    public final ibnf c;

    public foyq(ibnf ibnf0, gful_cronetEngineProvider gful0, ibnf ibnf1) {
        this.a = ibnf0;
        this.b = gful0;
        this.c = ibnf1;
    }

    @Override  // ibnf
    public final Object get() {
        return ((Boolean)this.a.get()).booleanValue() ? ((foxy)this.b.mr()) : ((folg)this.c).a();
    }
}

