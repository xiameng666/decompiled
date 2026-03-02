import j..util.Objects;

final class argr implements gmbg {
    public argr(argt argt0) {
        Objects.requireNonNull(argt0);
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        if((throwable0 instanceof aqvu)) {
            argt.a.m("App updates resume failed because disabled", new Object[0]);
            return;
        }
        argt.a.g("App updates resume failed", throwable0, new Object[0]);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        argt.a.h("App updates successfully resumed", new Object[0]);
    }
}

