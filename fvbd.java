public final class fvbd implements Runnable {
    public final fvbo a;

    public fvbd(fvbo fvbo0) {
        this.a = fvbo0;
    }

    @Override
    public final void run() {
        if(hunr.o() && hunr.a.m().am()) {
            fvbo fvbo0 = this.a;
            if(!fvbo0.p && fvbo0.g.j == null) {
                fvbo0.e();
            }
        }
    }
}

