public final class fvbi implements Runnable {
    public final fvbo a;

    public fvbi(fvbo fvbo0) {
        this.a = fvbo0;
    }

    @Override
    public final void run() {
        fvbo fvbo0 = this.a;
        fvbo0.f.clear();
        if(fvbo0.l) {
            fvbo0.g();
        }
    }
}

