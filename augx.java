import j..util.Objects;

final class augx implements aush {
    final auha a;

    public augx(auha auha0) {
        Objects.requireNonNull(auha0);
        this.a = auha0;
        super();
    }

    @Override  // aush
    public final void a(boolean z) {
        auha auha0 = this.a;
        auha0.a.c("WiFi connectivity is changed to %s", new Object[]{(z ? "available" : "unavailable")});
        if(auha0.p != z) {
            augs augs0 = new augs(auha0);
            auha0.f.execute(augs0);
        }
        auha0.p = z;
        auha0.e(false);
    }
}

