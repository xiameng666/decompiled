import j..util.Objects;

public final class aagm implements aace {
    public final aamn a;

    public aagm(aamn aamn0) {
        this.a = aamn0;
    }

    @Override  // aace
    public final void a(gged_interceptors gged0) {
        aamn aamn0;
        int v = gged0.size();
        for(int v1 = 0; true; ++v1) {
            aamn0 = this.a;
            if(v1 >= v) {
                break;
            }
            grxw grxw0 = (grxw)gged0.get(v1);
            aamn0.b.g(grxw0);
        }
        aaln aaln0 = aamn0.b;
        if(hoju.j()) {
            zic zic0 = (zic)aaln0.i.ij();
            gftb.check(zic0);
            zic0.a(((boolean)(Objects.equals(zic0.c.ij(), Boolean.valueOf(true)) ^ 1)));
            return;
        }
        zic zic1 = (zic)aaln0.i.ij();
        gftb.check(zic1);
        zic1.a(true);
    }
}

