final class cseu implements csfe {
    Exception a;
    final csdj b;

    public cseu(csdj csdj0) {
        this.b = csdj0;
        super();
    }

    @Override  // csfe
    public final void a(Exception exception0) {
        this.a = exception0;
        crxn.c().Q(0x20, exception0.toString(), null, hhct.aW, System.currentTimeMillis(), csfi.a());
    }

    @Override
    public final void run() {
        this.b.o(this.a);
    }
}

