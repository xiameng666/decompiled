class aqm implements bjn {
    static final aqm a;

    static {
        aqm.a = new aqm();
    }

    @Override  // bjn
    public void a(bnc bnc0, bjm bjm0) {
        bjo bjo0 = (bjo)blq.c(bnc0, bnc.p, null);
        bjt bjt0 = blf.b;
        int v = new bjm().b().f;
        if(bjo0 != null) {
            bjm0.c(bjo0.h);
            bjt0 = bjo0.e;
            v = bjo0.f;
        }
        bjm0.j(bjt0);
        ant ant0 = new ant(bnc0);
        bjm0.b = ant0.a(v);
        bjm0.d(new ata(ant0.b(new aql())));
        bjm0.f(ant0.c());
    }
}

