public final class kbt implements jqv {
    public final kbu a;
    public final Runnable b;
    public final String c;

    public kbt(kbu kbu0, Runnable runnable0, String s) {
        this.a = kbu0;
        this.b = runnable0;
        this.c = s;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        this.a.b = jqt0;
        this.b.run();
        return "Async " + this.c;
    }
}

