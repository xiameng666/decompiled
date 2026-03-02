import j..util.Objects;

final class audk implements ausb {
    final audm a;

    public audk(audm audm0) {
        Objects.requireNonNull(audm0);
        this.a = audm0;
        super();
    }

    @Override  // ausb
    public final void a(String s, long v, int v1, Object object0, long v2, long v3) {
        if(v1 != 0) {
            Object[] arr_object = {atru.a(v1)};
            this.a.n.d("onStatusRequestFailed: castStatusCode=%s", arr_object);
            aucd aucd0 = this.a.m;
            if(aucd0.B != null) {
                if(aucd0.Q.b()) {
                    aucd0.N(false);
                }
                else {
                    String s1 = aucd0.B;
                    batl.s(s1);
                    aucd0.M(v1, s1, aucd0.E);
                }
                aucd0.B = null;
                aucd0.E = null;
            }
        }
    }

    @Override  // ausb
    public final void b(String s, long v, long v1, long v2) {
    }
}

