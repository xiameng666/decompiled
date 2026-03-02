public final class cjjp implements fjhh {
    public final fjhh a;
    public final cjjd b;
    private final ibrt c;

    public cjjp(fjhh fjhh0, cjjd cjjd0, ibrt ibrt0) {
        ibuq.f(ibrt0, "coroutineContext");
        super();
        this.a = fjhh0;
        this.b = cjjd0;
        this.c = ibrt0;
    }

    @Override  // fjhh
    public final gmcd a(fjhg fjhg0) {
        ibuq.f(fjhg0, "downloadRequest");
        return icpu.e(iccl.b(this.c), new cjjg(this, fjhg0, null));
    }
}

