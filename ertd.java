public final class ertd {
    public final ertu a;

    public ertd(ibnf ibnf0, ibnf ibnf1) {
        ertb ertb0 = new ertb(ibnf0, null);
        ertc ertc0 = new ertc(ibnf1, null);
        super();
        this.a = new ertu(ertb0, ertc0);
    }

    public final icig a(String s) {
        ertm ertm0 = new ertm(s);
        this.a.c.f(ertm0);
        ibvd ibvd0 = new ibvd();
        ertr ertr0 = new ertr(this.a.c, s);
        return new icoj(new erts(null, s, this.a, ibvd0), ertr0);
    }
}

