import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import dagger.android.HasAndroidInjector;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

public abstract class bvnd extends bvvt implements HasAndroidInjector {
    private static final hgnj E;
    private final ibnn F;
    private final ibnn G;
    public gfsx j;
    public bvnu k;
    public gmcg l;
    public bvmk m;
    public frli n;
    public static final int o;
    private static final bboh p;

    static {
        bvnd.p = bboh.b("FeatureDrops", bbcu.eN);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgnj.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgnj.b(((hgnj)hftp0.b_message));
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        bvnd.E = (hgnj)hftv0;
    }

    public bvnd() {
        ibuq.e(bvnd.p, "logger");
        super(bvnd.p);
        this.F = new ibnz(new bvmy(this));
        this.G = new ibnz(new bvmz(this));
    }

    @Override  // bvvt
    protected final fhvq a() {
        return this.m().length() <= 0 ? fhwp.c() : fhwp.b(this.m());
    }

    @Override  // bvvt
    protected final gmcd g() {
        frli frli0 = this.n;
        if(frli0 == null) {
            ibuq.j("settingsProtoDataStore");
            frli0 = null;
        }
        return glzd.f(frli0.a(), new bvna(bvnc.a), gmap.a);
    }

    @Override  // bvvt
    protected final hgnj l() {
        return bvnd.E;
    }

    protected final String m() {
        String s = this.A("account");
        bvmk bvmk0 = this.m;
        if(bvmk0 == null) {
            ibuq.j("accountManager");
            bvmk0 = null;
        }
        List list0 = bvmk0.b();
        if(s != null && s.length() != 0 && list0.contains(s)) {
            return s;
        }
        if(!list0.isEmpty()) {
            Object object0 = list0.get(0);
            ibuq.e(object0, "get(...)");
            return (String)object0;
        }
        ((ggtj)bvnd.p.j()).x("Empty account name from device.");
        return "";
    }

    protected final String n() {
        return (String)this.F.a();
    }

    protected final String o() {
        return (String)this.G.a();
    }

    @Override  // bvvt
    protected final void p(giuw giuw0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giod.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        String s = this.o();
        String s1 = null;
        if(ibzk.D(s)) {
            s = null;
        }
        if(s != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giod giod0 = (giod)hftp0.b_message;
            giod0.b |= 1;
            giod0.c = s;
        }
        String s2 = this.n();
        if(!ibzk.D(s2)) {
            s1 = s2;
        }
        if(s1 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giod giod1 = (giod)hftp0.b_message;
            giod1.b |= 2;
            giod1.d = s1;
        }
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((giod)hftv0), "value");
        ProtoLiteBuilder hftp1 = giuw0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giut giut0 = (giut)hftp1.b_message;
        ((giod)hftv0).getClass();
        giut0.d = (giod)hftv0;
        giut0.b |= 2;
    }

    @Override  // bvvt
    protected final void q(Bundle bundle0) {
        this.D();
        this.E();
        if(this.z().c()) {
            this.A = bwdq.a;
        }
        try {
            Object object0 = ((glyq)this.g()).u();
            ibuq.e(object0, "get(...)");
            if(((Boolean)object0).booleanValue()) {
                Locale locale0 = Locale.US;
                ibuq.e(locale0, "US");
                ibuq.f(locale0, "locale");
                Configuration configuration0 = this.getResources().getConfiguration();
                configuration0.setLocale(locale0);
                this.getResources().updateConfiguration(configuration0, this.getResources().getDisplayMetrics());
            }
        }
        catch(ExecutionException executionException0) {
            a.ae(this.q.j(), "failed getting is_locale_unsupported from protostore.", executionException0);
        }
        catch(InterruptedException interruptedException0) {
            a.ae(this.q.j(), "failed getting is_locale_unsupported from protostore.", interruptedException0);
        }
        bvzg bvzg0 = (bvzg)this.K().a(bvzg.class);
        bvvs bvvs0 = new bvvs(new bvvm(bvzg0, this));
        bvzg0.a.g(this, bvvs0);
        bvvs bvvs1 = new bvvs(new bvvn(this));
        bvzg0.b.g(this, bvvs1);
        if(bundle0 == null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hglz.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            hgnj hgnj0 = this.l();
            ibuq.f(hgnj0, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            hgnj0.getClass();
            ((hglz)hftv0).c = hgnj0;
            ((hglz)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hglz)hftp0.b_message).f = true;
            ProtoLiteMessage hftv1 = hftp0.N_build();
            ibuq.e(hftv1, "build(...)");
            bvzg0.a(((hglz)hftv1));
        }
    }

    @Override  // bvvt
    protected final boolean r(boolean z) {
        this.w = (ViewGroup)new bvnb(this).a();
        if(!jys.d()) {
            Window window0 = this.getWindow();
            kfv.a(window0, false);
            window0.setStatusBarColor(0);
            window0.setNavigationBarColor(0);
        }
        this.getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        ViewGroup viewGroup0 = this.w;
        fhwk fhwk0 = null;
        if(viewGroup0 == null) {
            ibuq.j("contentView");
            viewGroup0 = null;
        }
        kex.b(viewGroup0, new bvvk(this));
        if(z && this.z().c()) {
            fhwk fhwk1 = this.v;
            if(fhwk1 == null) {
                ibuq.j("viewVisualElements");
            }
            else {
                fhwk0 = fhwk1;
            }
            fhwk0.c(this.getContainerActivity());
        }
        fhvo fhvo0 = super.L(0x1E9EF, new bvvl());
        Activity activity0 = this.getContainerActivity();
        gftb.check(fhvo0.a);
        fhvo0.a.i(activity0, fhvo0);
        if(this.m().length() == 0) {
            ((ggtj)bvnd.p.i()).x("Empty account.");
            this.G(bwcj.b);
            return false;
        }
        bvze bvze0 = (bvze)this.K().a(bvze.class);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgmn.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        hgmm hgmm0 = hgmm.e;
        ibuq.f(hgmm0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgmn hgmn0 = (hgmn)hftp0.b_message;
        hgmn0.b = hgmm0.a();
        String s = this.n();
        if(s == null) {
            s = "";
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hgmn)hftp0.b_message).c = s;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        bvze0.b(((hgmn)hftv0));
        return true;
    }

    @Override  // bvvt
    protected final boolean s() {
        if(bbnp.j(this)) {
            this.finish();
            return false;
        }
        bvoc.a().androidInjector().inject(this);
        return true;
    }

    @Override  // bvvt
    protected boolean t() {
        return false;
    }

    @Override  // bvvt
    protected final void u() {
        this.G(bwcj.a);
    }
}

