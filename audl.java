import j..util.Objects;

final class audl implements ausb {
    final audm a;

    public audl(audm audm0) {
        Objects.requireNonNull(audm0);
        this.a = audm0;
        super();
    }

    @Override  // ausb
    public final void a(String s, long v, int v1, Object object0, long v2, long v3) {
        if(v1 != 0) {
            this.a.m.y = false;
            this.a.m.R = null;
            this.a.m.S = null;
            String s1 = this.a.m.y(v1);
            String s2 = atru.a(v1);
            this.a.m.k.n("listener.onApplicationStopFailed(%s)", s2);
            aubj aubj0 = this.a.m.O;
            if(aubj0 != null) {
                aubj0.e.hl(v1, s1);
            }
        }
    }

    @Override  // ausb
    public final void b(String s, long v, long v1, long v2) {
    }
}

