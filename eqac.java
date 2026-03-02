public final class eqac implements Runnable {
    public final eqam a;
    public final String b;

    public eqac(eqam eqam0, String s) {
        this.a = eqam0;
        this.b = s;
    }

    @Override
    public final void run() {
        this.a.c.r(this.b);
    }
}

