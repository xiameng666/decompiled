import j..util.Objects;

final class felc implements Runnable {
    final fczq a;
    final felm b;

    public felc(felm felm0, fczq fczq0) {
        this.a = fczq0;
        Objects.requireNonNull(felm0);
        this.b = felm0;
        super();
    }

    @Override
    public final void run() {
        felm felm0 = this.b;
        if(felm0.m == null) {
            felm0.m = new fejn(felm0.b, felm.a);
        }
        felm0.m.a(this.a);
    }
}

