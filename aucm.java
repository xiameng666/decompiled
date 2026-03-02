import j..util.Objects;

final class aucm implements aush {
    final aucp a;

    public aucm(aucp aucp0) {
        Objects.requireNonNull(aucp0);
        this.a = aucp0;
        super();
    }

    @Override  // aush
    public final void a(boolean z) {
        this.a.h.c("WiFi connectivity is changed to %s", new Object[]{(z ? "available" : "unavailable")});
        this.a.u = true;
    }
}

