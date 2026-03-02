import j..time.Instant;

public final class bgqv implements bgrl {
    private final bbng a;

    public bgqv(bbng bbng0) {
        this.a = bbng0;
    }

    @Override  // bgrl
    public final void a(hguc hguc0, ProtoLiteBuilder hftp0) {
        if(!hfyg.d((hguc0.f == null ? hfwn.a : hguc0.f)).isBefore(Instant.ofEpochMilli(this.a.a()))) {
            return;
        }
        throw new bgrk(2);
    }
}

