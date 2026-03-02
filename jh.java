final class jh implements Runnable {
    final ka a;

    public jh(ka ka0) {
        this.a = ka0;
        super();
    }

    @Override
    public final void run() {
        ka ka0 = this.a;
        if((ka0.F & 1) != 0) {
            ka0.N(0);
        }
        if((ka0.F & 0x1000) != 0) {
            ka0.N(108);
        }
        ka0.E = false;
        ka0.F = 0;
    }
}

