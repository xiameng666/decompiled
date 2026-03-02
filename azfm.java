final class azfm implements azgc {
    public final azfl a;
    public final Throwable b;

    public azfm(azfl azfl0, Throwable throwable0) {
        this.a = azfl0;
        this.b = throwable0;
    }

    @Override  // azgc
    public final azbc a() {
        return this.a.p;
    }

    @Override
    public final String toString() {
        return azgj.a(this.a.o, this.b);
    }
}

