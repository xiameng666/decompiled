import android.content.Context;
import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;

public final class dgao implements dgah {
    final Context a;
    final dfsk b;
    final dhtl c;
    final dhde d;
    final ExecutorService e;
    private dgan f;
    private dasx g;

    public dgao(Context context0, dfsk dfsk0, dhtl dhtl0) {
        dhde dhde0 = new dhde();
        gmcg gmcg0 = cuui.b();
        dasx dasx0 = cumi.e(context0);
        super();
        this.a = context0;
        this.b = dfsk0;
        this.d = dhde0;
        this.c = dhtl0;
        new SecureRandom();
        this.e = gmcg0;
        this.g = dasx0;
    }

    @Override  // dgah
    public final int a() {
        return this.n().f;
    }

    @Override  // dgah
    public final dbwu b(dcpv dcpv0) {
        return this.n().b(dcpv0);
    }

    @Override  // dgah
    public final dbwu c(dcpv dcpv0) {
        return this.n().c(dcpv0);
    }

    @Override  // dgah
    public final dgap d(byte[] arr_b, byte[] arr_b1) {
        return this.n().d(arr_b, arr_b1);
    }

    @Override  // dgah
    public final dgaq e(dcpv dcpv0) {
        return this.n().e(dcpv0);
    }

    @Override  // dgah
    public final void f(dcpv dcpv0) {
        this.n().f(dcpv0);
    }

    @Override  // dgah
    public final void g(int v) {
        this.n().f = v;
    }

    @Override  // dgah
    public final void h(int v) {
        this.n().h(v);
    }

    @Override  // dgah
    public final void i() {
        dgan dgan0 = this.n();
        dcvz.a.b().p("CertificateManager has been shutdown", new Object[0]);
        ((dbci)cumi.e(dgan0.a)).k(new dbbr(), 0x576);
        cuui.h(dgan0.d, "CertificateManagerExecutor");
    }

    @Override  // dgah
    public final void j(dcpv dcpv0) {
        synchronized(this) {
            this.n().j(dcpv0);
        }
    }

    @Override  // dgah
    public final boolean k(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) {
        return this.n().k(arr_b, arr_b1, arr_b2);
    }

    @Override  // dgah
    public final byte[] l(byte[] arr_b, dcpv dcpv0) {
        return this.n().l(arr_b, dcpv0);
    }

    @Override  // dgah
    public final byte[] m(byte[] arr_b, dcpv dcpv0) {
        return this.n().m(arr_b, dcpv0);
    }

    public final dgan n() {
        if(this.f == null) {
            if(this.g == null) {
                this.g = cumi.e(this.a);
            }
            Context context0 = this.a;
            dfsk dfsk0 = this.b;
            dgan dgan0 = new dgan(context0, dfsk0, this.d, this.c, this.e, this.g);
            if(this.g != null) {
                if(!hvqn.z()) {
                    this.g.h(new dgba(dgan0, dfsk0));
                }
                if(hvqn.z()) {
                    this.g.h(new dgat(context0, dfsk0, this.g));
                }
            }
            this.f = dgan0;
        }
        return this.f;
    }
}

