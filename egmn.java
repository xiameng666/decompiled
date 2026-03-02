import j..util.Objects;

final class egmn implements gmbg {
    final ehci a;
    final egyc b;
    final int c;
    final egmq d;

    public egmn(egmq egmq0, ehci ehci0, egyc egyc0, int v) {
        this.a = ehci0;
        this.b = egyc0;
        this.c = v;
        Objects.requireNonNull(egmq0);
        this.d = egmq0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        egig.k("CleanupSyncedGoogleContactsOperation", "Observer registration failed");
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        egxz egxz0 = new egxz(this.c);
        gmbu.t(this.b.a.b(egxz0, gmap.a), new egmo(this.d, this.b, this.a), gmap.a);
    }
}

