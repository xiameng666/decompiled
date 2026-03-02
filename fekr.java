public final class fekr implements Runnable {
    public final felm a;

    public fekr(felm felm0) {
        this.a = felm0;
    }

    @Override
    public final void run() {
        felm felm0 = this.a;
        fees fees0 = felm0.n;
        if(fees0 != null) {
            fees0.n();
            felm0.n = null;
        }
    }
}

