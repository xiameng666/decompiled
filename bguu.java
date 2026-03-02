public final class bguu implements Runnable {
    public final bguv a;
    public final Boolean b;

    public bguu(bguv bguv0, Boolean boolean0) {
        this.a = bguv0;
        this.b = boolean0;
    }

    @Override
    public final void run() {
        this.a.a.m(this.b.booleanValue());
    }
}

