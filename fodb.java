import android.content.Context;

final class fodb implements fhyz {
    final Context a;

    public fodb(Context context0) {
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
        return gfsx.m(ayuj.a(0x4AB0021, hlqj.f));
    }

    @Override  // fhyz
    public final gmcd d(gmcd gmcd0) {
        return fhyy.a();
    }

    @Override  // fhyz
    public final gmcd e(fhur fhur0, gmcd gmcd0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhcf.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hhce.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hhce hhce0 = (hhce)hftp1.b_message;
        "com.google.android.gms".getClass();
        hhce0.b |= 0x40;
        hhce0.g = "com.google.android.gms";
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhcf hhcf0 = (hhcf)hftp0.b_message;
        hhce hhce1 = (hhce)hftp1.N_build();
        hhce1.getClass();
        hhcf0.c = hhce1;
        hhcf0.b |= 1;
        return gmbu.i(hftp0.N_build());
    }

    @Override  // fhyz
    public final gmcd f(fhur fhur0, gmcd gmcd0) {
        return fhyy.c();
    }

    @Override  // fhyz
    public final hlqe g(fhur fhur0) {
        return hlqe.c;
    }

    @Override  // fhyz
    public final String h(fhur fhur0) {
        return "ONEGOOGLE_MOBILE";
    }
}

