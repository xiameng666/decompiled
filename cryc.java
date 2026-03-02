import j..util.Objects;

final class cryc implements AutoCloseable {
    private final bbfe_BaseGrpcServer a;

    public cryc(cryd cryd0) {
        Objects.requireNonNull(cryd0);
        super();
        int v = cryd0.d.getApplicationInfo().uid;
        bbfe_BaseGrpcServer bbfe0 = new bbfe_BaseGrpcServer(cryd0.d, cryd0.a, cryd0.c, v, 0x6101);
        this.a = bbfe0;
        bbfe0.addHeader("X-Goog-Api-Key", cryd0.b);
    }

    public final crwn a() {
        return new crwn(this.a);
    }

    @Override
    public final void close() {
        this.a.shutdownChannel();
    }
}

