public final class czta implements Runnable {
    public final czte a;
    public final gelz b;

    public czta(czte czte0, gelz gelz0) {
        this.a = czte0;
        this.b = gelz0;
    }

    @Override
    public final void run() {
        String s = this.b.f();
        this.a.b.b.remove(s);
    }
}

