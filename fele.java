import j..util.Objects;

final class fele implements Runnable {
    final fczq a;
    final felm b;

    public fele(felm felm0, fczq fczq0) {
        this.a = fczq0;
        Objects.requireNonNull(felm0);
        this.b = felm0;
        super();
    }

    @Override
    public final void run() {
        felm felm0 = this.b;
        if(felm0.t == null) {
            felm0.t = new femf(this.a);
        }
    }
}

