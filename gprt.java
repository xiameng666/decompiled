public final class gprt implements Runnable {
    public final gprn a;
    public final gpsc b;

    public gprt(gpsc gpsc0, gprn gprn0) {
        this.b = gpsc0;
        this.a = gprn0;
    }

    @Override
    public final void run() {
        this.b.a.e(this.a, "Service record expired");
    }
}

