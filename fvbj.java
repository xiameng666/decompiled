public final class fvbj implements Runnable {
    public final fvbo a;
    public final fvjw b;

    public fvbj(fvbo fvbo0, fvjw fvjw0) {
        this.a = fvbo0;
        this.b = fvjw0;
    }

    @Override
    public final void run() {
        fvbo fvbo0 = this.a;
        fvbo0.f.remove(this.b);
        if(fvbo0.f.isEmpty() && fvbo0.l) {
            fvbo0.g();
        }
    }
}

