import j..util.Objects;

final class cyrb implements gmbg {
    final cyjq a;
    final cyrc b;

    public cyrb(cyrc cyrc0, cyjq cyjq0) {
        this.a = cyjq0;
        Objects.requireNonNull(cyrc0);
        this.b = cyrc0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        synchronized(this.b) {
            this.b.e = this.a;
            cyrc.d(this.b);
        }
        ((ggtj)cyjh.a.g().s(throwable0)).x("LiveSassDeviceSetting: failed to updateSettingsToStorage!");
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        if(hvpg.bJ()) {
            cyjh.a.d().x("LiveSassDeviceSetting: updateSettingsToStorage success!");
        }
        synchronized(this.b) {
            cyrc.d(this.b);
        }
        if(hvpg.a.aY().hA()) {
            this.b.d.run();
        }
    }
}

