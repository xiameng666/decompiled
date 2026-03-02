public final class feko implements Runnable {
    public final felm a;
    public final fczq b;
    public final boolean c;

    public feko(felm felm0, fczq fczq0, boolean z) {
        this.a = felm0;
        this.b = fczq0;
        this.c = z;
    }

    @Override
    public final void run() {
        fejn fejn0 = this.a.m;
        if(fejn0 != null) {
            fejn0.d(this.b, this.c);
        }
    }
}

