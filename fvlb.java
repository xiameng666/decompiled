public final class fvlb implements Runnable {
    public final fvld a;

    public fvlb(fvld fvld0) {
        this.a = fvld0;
    }

    @Override
    public final void run() {
        this.a.l.a();
        this.a.m.removeCallbacks(this.a.e);
        this.a.a.requestCellInfoUpdate(this.a.c, this.a.d);
        this.a.m.postDelayed(this.a.e, this.a.b);
    }
}

