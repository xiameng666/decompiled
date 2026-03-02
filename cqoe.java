import j..util.Optional;

public final class cqoe implements Runnable {
    public final cqpi a;
    public final boolean b;

    public cqoe(cqpi cqpi0, boolean z) {
        this.a = cqpi0;
        this.b = z;
    }

    @Override
    public final void run() {
        cqpi cqpi0 = this.a;
        if(!cqpi0.ah) {
            cqpi0.N();
        }
        cqqn.c(cqrb.d(cqpi0.requireContext(), hgzp.dx, (this.b ? 11 : 2), Optional.empty()));
    }
}

