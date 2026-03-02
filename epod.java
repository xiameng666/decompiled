final class epod implements ibts {
    final gmcd a;

    public epod(gmcd gmcd0) {
        this.a = gmcd0;
        super();
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Throwable throwable0 = (Throwable)object0;
        this.a.cancel(true);
        return ibom.a;
    }
}

