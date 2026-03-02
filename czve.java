public final class czve implements cumo {
    public final czvg a;
    public final Thread b;

    public czve(czvg czvg0, Thread thread0) {
        this.a = czvg0;
        this.b = thread0;
    }

    @Override  // cumo
    public final void a() {
        this.a.o = true;
        this.b.interrupt();
    }
}

