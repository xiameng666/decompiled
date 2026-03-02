public final class fvbh implements Runnable {
    public final fvbo a;

    public fvbh(fvbo fvbo0) {
        this.a = fvbo0;
    }

    @Override
    public final void run() {
        fvbe fvbe0 = new fvbe(this.a);
        this.a.d.execute(fvbe0);
    }
}

