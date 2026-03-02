import j..util.Objects;

final class arom implements gmbg {
    final cuwu a;

    public arom(aroo aroo0, cuwu cuwu0) {
        this.a = cuwu0;
        Objects.requireNonNull(aroo0);
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        arot.a.f("callbackThread (%s): Task for onPayloadReceived (payload %s) failed. " + throwable0, new Object[]{Thread.currentThread().getName(), ((long)this.a.i)});
    }

    @Override  // gmbg
    public final void b(Object object0) {
        arot.a.d("callbackThread (%s): Task for onPayloadReceived (payload %s) succeeded.", new Object[]{Thread.currentThread().getName(), ((long)this.a.i)});
    }
}

