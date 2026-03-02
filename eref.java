import j..util.Objects;

final class eref implements gmbg {
    public eref(ereg ereg0) {
        Objects.requireNonNull(ereg0);
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        ereg.a.n("Failed to write restoreInfo to dataStore", throwable0, new Object[0]);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        ereg.a.h("Successfully wrote restoreInfo to dataStore", new Object[0]);
    }
}

