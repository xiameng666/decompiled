public final class cymp implements kar {
    public final cyna a;
    public final Runnable b;

    public cymp(cyna cyna0, Runnable runnable0) {
        this.a = cyna0;
        this.b = runnable0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        ((ggtj)this.a.o.d().ar(0x1ECF)).R("SassDevice: cleanCustomData for device %s result %s", this.a.j(), ((cyql)object0).a.name());
        this.b.run();
    }
}

