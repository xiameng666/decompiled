import j..util.Objects;

final class dvhv implements gmbg {
    final gmcd a;

    public dvhv(dvhw dvhw0, gmcd gmcd0) {
        this.a = gmcd0;
        Objects.requireNonNull(dvhw0);
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        a.ae(dvhw.a.i(), "Failed to write issuer locations to AppSearch", throwable0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        adx adx0 = (adx)object0;
        try {
            ((aet)gmbu.r(this.a)).close();
        }
        catch(Exception exception0) {
            a.ae(dvhw.a.i(), "Unable to close AppSearch session", exception0);
        }
    }
}

