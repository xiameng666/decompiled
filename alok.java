import j..util.Objects;

final class alok implements gmbg {
    final boolean a;

    public alok(alol alol0, boolean z) {
        this.a = z;
        Objects.requireNonNull(alol0);
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        alol.a.g("Failed on updateAppStreamingAccessState", throwable0, new Object[0]);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        alol.a.d("updateAppStreamingAccessState: %s.", new Object[]{Boolean.valueOf(this.a)});
    }
}

