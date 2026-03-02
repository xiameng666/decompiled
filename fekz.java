import j..util.Objects;

final class fekz implements Runnable {
    final felm a;

    public fekz(felm felm0) {
        Objects.requireNonNull(felm0);
        this.a = felm0;
        super();
    }

    @Override
    public final void run() {
        felm felm0 = this.a;
        femf femf0 = felm0.t;
        if(femf0 != null) {
            ffmm.a(femf0);
            felm0.t = null;
        }
    }
}

