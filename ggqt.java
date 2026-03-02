import j..util.Objects;

final class ggqt implements gful_cronetEngineProvider {
    final ggqu a;

    public ggqt(ggqu ggqu0) {
        Objects.requireNonNull(ggqu0);
        this.a = ggqu0;
        super();
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ggqu ggqu0 = this.a;
        glww glww0 = ggqu0.b;
        int v = glww0.c();
        if(v == 0) {
            return ggqn.a;
        }
        int v1 = ggqu0.c;
        if(v <= 0x20) {
            return new ggrg(glww0, v1);
        }
        return v <= 0x40 ? new ggrh(glww0, v1) : new ggrf(glww0, v1);
    }
}

