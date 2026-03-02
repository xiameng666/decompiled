import com.google.android.gms.auth.api.credentials.nextgen.database.VerifiableCredentialDatabase;
import com.google.android.gms.chimera.modules.auth.credentials.base.AppContextProvider;
import j..util.Collection.-EL;
import java.util.List;

public final class aheo implements glzm {
    public static final bxrs a;
    public final ahbs b;
    public final actv c;
    public final bxos d;
    public final bxmu e;
    public bxod f;
    public gged_interceptors g;
    public gged_interceptors h;
    public boolean i;
    public gged_interceptors j;
    public gged_interceptors k;
    public gged_interceptors l;
    public gged_interceptors m;
    public gged_interceptors n;
    public gged_interceptors o;
    private final String p;
    private final VerifiableCredentialDatabase q;

    static {
        aheo.a = new bxrs(((gful_cronetEngineProvider)new ahem()));
    }

    public aheo(String s) {
        this.p = s;
        VerifiableCredentialDatabase verifiableCredentialDatabase0 = VerifiableCredentialDatabase.u(AppContextProvider.a());
        this.q = verifiableCredentialDatabase0;
        this.b = verifiableCredentialDatabase0.v();
        this.c = (actv)aenv.a.b();
        this.d = (bxos)bxos.a.b();
        this.f = bxoc.a(AppContextProvider.a(), null);
        bxmt bxmt0 = new bxmt();
        bxmt0.a = bxre.b;
        ahds ahds0 = new ahds(this);
        bxmt0.c(bxre.b, ahds0);
        ahdt ahdt0 = new ahdt(this);
        bxmt0.c(bxre.c, ahdt0);
        ahdu ahdu0 = new ahdu(this);
        bxmt0.c(bxre.h, ahdu0);
        ahdv ahdv0 = new ahdv(this);
        bxmt0.c(bxre.d, ahdv0);
        ahdx ahdx0 = new ahdx(this);
        bxmt0.c(bxre.e, ahdx0);
        ahdy ahdy0 = new ahdy(this);
        bxmt0.c(bxre.g, ahdy0);
        ahdz ahdz0 = new ahdz(this);
        bxmt0.c(bxre.f, ahdz0);
        bxmt0.b(new bxmh(aggi.a("MaintainVerifiableCredentials_flowRunner")));
        bxmt0.b(new bxmx(this.f, s, new ahea()));
        bxmt0.b = bxrz.C();
        this.e = bxmt0.a();
        this.j = ggna.a;
        this.k = ggna.a;
        this.m = ggna.a;
        this.l = ggna.a;
        this.n = ggna.a;
    }

    @Override  // glzm
    public final gmcd a() {
        this.e.i();
        bxsy bxsy0 = bxsy.h(this.e.a).k(new ahdp(this));
        bxlj bxlj0 = new bxlj();
        List list0 = glwy.j(new int[]{0x6F35, 7});
        return bxsy0.e(bxlx.c(bxma.class, bxlj0, list0).a(new ahdq(this))).e(new bxlw(Exception.class).a(new ahdr(this)));
    }

    public final void b(int v) {
        bxod bxod0 = this.f;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gixr)hftp0.b_message).d = 39;
        ((gixr)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giwz.a).v_newBuilder();
        long v1 = (long)this.j.size();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giwz giwz0 = (giwz)hftp1.b_message;
        giwz0.b |= 2;
        giwz0.d = v1;
        long v2 = (long)this.m.size();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giwz giwz1 = (giwz)hftp1.b_message;
        giwz1.b |= 4;
        giwz1.e = v2;
        long v3 = (long)this.k.size();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giwz giwz2 = (giwz)hftp1.b_message;
        giwz2.b |= 8;
        giwz2.f = v3;
        double f = Collection.-EL.stream(this.m).mapToLong(new ahdo()).average().orElse(0.0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((giwz)hftv0).b |= 16;
        ((giwz)hftv0).g = f;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((giwz)hftp1.b_message).c = v - 1;
        ((giwz)hftp1.b_message).b |= 1;
        giwz giwz3 = (giwz)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        giwz3.getClass();
        ((gixr)hftv1).N = giwz3;
        ((gixr)hftv1).c |= 0x40;
        String s = this.p;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gixr gixr0 = (gixr)hftp0.b_message;
        s.getClass();
        gixr0.b |= 2;
        gixr0.e = s;
        bxod0.a(((gixr)hftp0.N_build()));
    }
}

