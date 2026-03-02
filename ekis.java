import j..util.Objects;

final class ekis implements oyj {
    final ekit a;

    public ekis(ekit ekit0) {
        this.a = ekit0;
    }

    @Override  // oyj
    public final void a() {
        ekit ekit0 = this.a;
        ekit0.F();
        if(ekit.a) {
            lqd lqd0 = ekit0.aj;
            if(lqd0 != null) {
                lqd0.k(ekit0);
            }
            ekit0.aj = ekit0.d.c();
            lqd lqd1 = ekit0.aj;
            ekih ekih0 = ekit0.ah;
            Objects.requireNonNull(ekih0);
            lqd1.g(ekit0, new ekip(ekih0));
            return;
        }
        lqd lqd2 = ekit0.ai;
        if(lqd2 != null) {
            lqd2.k(ekit0);
        }
        ekit0.ai = ekit0.d.b();
        lqd lqd3 = ekit0.ai;
        ekjl ekjl0 = ekit0.ag;
        Objects.requireNonNull(ekjl0);
        lqd3.g(ekit0, new ekir(ekjl0));
    }
}

