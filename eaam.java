public final class eaam implements evqf {
    public final eabb a;
    public final dylc b;

    public eaam(eabb eabb0, dylc dylc0) {
        this.a = eabb0;
        this.b = dylc0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        byte[] arr_b = (byte[])object0;
        eabb eabb0 = this.a;
        switch(eabb0.f.e().ordinal()) {
            case 1: {
                eaae eaae0 = new eaae(dzau.c(this.b, eabb0.e));
                eabb0.o.l(eaae0);
                return;
            }
            case 3: {
                eaac eaac1 = new eaac(true, eabb0.f.a("SE_PROVISION_COMMIT_PAGE"));
                eabb0.o.l(eaac1);
                return;
            }
            default: {
                eaac eaac0 = new eaac(false, eabb0.f.a("SE_PROVISION_COMMIT_PAGE"));
                eabb0.o.l(eaac0);
            }
        }
    }
}

