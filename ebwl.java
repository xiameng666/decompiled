import com.google.android.gms.common.api.Status;
import j..util.Optional;

public final class ebwl {
    private final dmgi a;
    private final gfug b;

    public ebwl(dmgi dmgi0, gfug gfug0) {
        this.a = dmgi0;
        this.b = gfug0;
    }

    public final ebwg a(gtni gtni0, int v, gged_interceptors gged0) {
        if(gtni0 == null) {
            gtni0 = gtni.a;
        }
        return new ebwg(gtni0, v, gged0, Optional.of(this.b));
    }

    public final void b(gtni gtni0, int v, Status status0) {
        this.d(gtni0, v, ggna.a, status0);
    }

    public final void c(gtni gtni0, int v, int v1) {
        this.e(gtni0, v, ggna.a, v1);
    }

    public final void d(gtni gtni0, int v, gged_interceptors gged0, Status status0) {
        this.k(((gful_cronetEngineProvider)new ebwk(this, gtni0, v, gged0, status0)));
    }

    public final void e(gtni gtni0, int v, gged_interceptors gged0, int v1) {
        this.k(((gful_cronetEngineProvider)new ebwj(this, gtni0, v, gged0, v1)));
    }

    public static void f(gtni gtni0, int v, int v1) {
        gged_interceptors gged0 = ggna.a;
        dmgi dmgi0 = dmgi.a();
        if(gtni0 == null) {
            gtni0 = gtni.a;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        hali hali0 = new ebwg(gtni0, v, gged0, Optional.empty()).a(v1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        hali0.getClass();
        hapr0.bs = hali0;
        hapr0.f |= 0x20000;
        dmgi0.b(((hapr)hftp0.N_build()));
    }

    public final void g(gtni gtni0, int v) {
        this.h(gtni0, v, ggna.a, 2);
    }

    public final void h(gtni gtni0, int v, gged_interceptors gged0, int v1) {
        this.l(((gful_cronetEngineProvider)new ebwi(this, gtni0, v, gged0)), v1);
    }

    public final void i(gtni gtni0, int v, Optional optional0) {
        this.j(gtni0, v, ggna.a, optional0);
    }

    public final void j(gtni gtni0, int v, gged_interceptors gged0, Optional optional0) {
        this.k(((gful_cronetEngineProvider)new ebwh(this, gtni0, v, gged0, optional0)));
    }

    private final void k(gful_cronetEngineProvider gful0) {
        this.l(gful0, 2);
    }

    private final void l(gful_cronetEngineProvider gful0, int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        hali hali0 = (hali)gful0.mr();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hali0.getClass();
        ((hapr)hftv0).bs = hali0;
        ((hapr)hftv0).f |= 0x20000;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hapr)hftp0.b_message).ba = v - 2;
        hapr hapr0 = (hapr)hftp0.N_build();
        this.a.b(hapr0);
    }
}

