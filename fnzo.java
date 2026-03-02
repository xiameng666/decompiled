public final class fnzo implements Runnable {
    public final fnzq a;
    public final Object b;

    public fnzo(fnzq fnzq0, Object object0) {
        this.a = fnzq0;
        this.b = object0;
    }

    @Override
    public final void run() {
        gged_interceptors gged0 = this.a.a.f.b.f();
        this.a.a.o(gged0, this.b);
    }
}

