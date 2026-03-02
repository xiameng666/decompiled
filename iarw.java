public final class iarw implements Runnable {
    public final iasc a;

    public iarw(iasc iasc0) {
        this.a = iasc0;
    }

    @Override
    public final void run() {
        iasc iasc0 = this.a;
        iasc0.f.d();
        gftb.q(iasc0.k != null);
        gftb.q(iasc0.k.isDone());
        iaoq iaoq0 = iasc0.j;
        gftb.check(iaoq0);
        gmbu.t(iasc0.k, new iary(iasc0, iaoq0), iasc0.f);
        iasc0.k = null;
        if(iasc0.i) {
            iasc0.i = false;
            iasc0.e();
        }
    }
}

