final class jl implements Runnable {
    final ka a;

    public jl(ka ka0) {
        this.a = ka0;
        super();
    }

    @Override
    public final void run() {
        ka ka0 = this.a;
        ka0.q.showAtLocation(ka0.p, 55, 0, 0);
        ka0.O();
        if(ka0.W()) {
            ka0.p.setAlpha(0.0f);
            kfs kfs0 = kfe.c(ka0.p);
            kfs0.c(1.0f);
            ka0.s = kfs0;
            ka0.s.h(new jk(this));
            return;
        }
        ka0.p.setAlpha(1.0f);
        ka0.p.setVisibility(0);
    }
}

