public final class eqcb implements evpo {
    public final eqck a;
    public final epzc b;
    public final epzc c;

    public eqcb(eqck eqck0, epzc epzc0, epzc epzc1) {
        this.a = eqck0;
        this.b = epzc0;
        this.c = epzc1;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        return this.a.r.a(this.b, this.c);
    }
}

