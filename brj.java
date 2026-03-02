public final class brj implements Runnable {
    public final bsb a;
    public final bsa b;

    public brj(bsb bsb0, bsa bsa0) {
        this.a = bsb0;
        this.b = bsa0;
    }

    @Override
    public final void run() {
        this.a.i.add(this.b);
    }
}

