import android.content.Context;

final class dotp implements fhyz {
    final Context a;

    public dotp(Context context0) {
        this.a = context0;
        super();
    }

    @Override  // fhyz
    public final gfsx a(fhur fhur0) {
        return gfqx.a;
    }

    @Override  // fhyz
    public final gfsx b(fhur fhur0) {
        return gfqx.a;
    }

    @Override  // fhyz
    public final gfsx c(fhur fhur0) {
        return gfqx.a;
    }

    @Override  // fhyz
    public final gmcd d(gmcd gmcd0) {
        return fhyy.a();
    }

    @Override  // fhyz
    public final gmcd e(fhur fhur0, gmcd gmcd0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)haci.a).v_newBuilder();
        String s = dmkq.a(this.a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        haci haci0 = (haci)hftp0.b_message;
        s.getClass();
        haci0.b |= 1;
        haci0.c = s;
        return gmbu.i(hftp0.N_build());
    }

    @Override  // fhyz
    public final gmcd f(fhur fhur0, gmcd gmcd0) {
        return fhyy.c();
    }

    @Override  // fhyz
    public final hlqe g(fhur fhur0) {
        return hlqe.a;
    }

    @Override  // fhyz
    public final String h(fhur fhur0) {
        return "PAYMENTS_CONSUMER_CORE";
    }
}

