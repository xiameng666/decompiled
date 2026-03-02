import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import dagger.internal.Preconditions;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class dxwe extends dokz implements ednc {
    public static final dxvu a;
    public fhwk ag;
    public ficz ah;
    public fhvw ai;
    public ficx aj;
    public fhvs ak;
    public fhvs al;
    public final Map am;
    public final List an;
    private final ibnn ao;
    private String ap;
    private String aq;
    public static final bboh b;
    public final acp c;
    public final acp d;

    static {
        dxwe.a = new dxvu();
        dxwe.b = bboh.b("Pay", bbcu.cZ);
    }

    public dxwe() {
        dxwa dxwa0 = new dxwa(new dxvz(this));
        ibnn ibnn0 = ibno.a(ibnp.c, dxwa0);
        ibuk ibuk0 = new ibuk(dxxk.class);
        dxwb dxwb0 = new dxwb(ibnn0);
        dxwc dxwc0 = new dxwc(ibnn0);
        this.ao = new lsd(ibuk0, dxwb0, new dxwd(this, ibnn0), dxwc0);
        this.c = this.registerForActivityResult(new adt(), new dxvs(this));
        this.d = this.registerForActivityResult(new adt(), new dxvt(this));
        this.am = new LinkedHashMap();
        this.an = new ArrayList();
    }

    @Override  // ednc
    public final boolean F() {
        return true;
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        byte[] arr_b;
        super.onCreate(bundle0);
        if(!hwqv.d()) {
            this.ar();
            return;
        }
        dolg dolg0 = this.ap();
        String s = dolg0 == null ? null : dolg0.d();
        if(s == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.ap = s;
        dolg dolg1 = this.ap();
        String s1 = dolg1 == null ? null : dolg1.c();
        if(s1 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.aq = s1;
        domv domv0 = domu.a(this.requireContext());
        Preconditions.b(domv0);
        new dxvl(domv0).inject(this);
        ficz ficz0 = this.ah;
        if(ficz0 == null) {
            ibuq.j("syntheticHostFactory");
            ficz0 = null;
        }
        fhye fhye0 = new fhye();
        ggfn ggfn0 = new ggfn();
        ggfn0.k(ficz0.c);
        ggfn0.k(ggnj.a);
        ggfn0.i(new ficy(ficz0, fhye0));
        this.aj = new ficx(new fhxr(ggfn0.h(), ficz0.d), fhye0, ficz0.a, ficz0.e);
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            arr_b = new byte[0];
        }
        else {
            arr_b = bundle1.getByteArray("walletPageProposal");
            if(arr_b == null) {
                arr_b = new byte[0];
            }
        }
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fsvb.a), arr_b, 0, arr_b.length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        ibuq.e(((fsvb)hftv0), "parseFrom(...)");
        igxm igxm0 = new igxm(((fsvb)hftv0));
        dxxk dxxk0 = this.y();
        String s2 = this.ap;
        if(s2 == null) {
            ibuq.j("accountName");
            s2 = null;
        }
        String s3 = this.aq;
        if(s3 == null) {
            ibuq.j("accountId");
            s3 = null;
        }
        fsvb fsvb0 = igxm0.b();
        ibuq.f(s2, "accountName");
        ibuq.f(s3, "accountId");
        ibuq.f(fsvb0, "initialOperation");
        if(!dxxk0.p) {
            dxxk0.p = true;
            domv domv1 = domu.a(AppContextProvider.a());
            Preconditions.b(domv1);
            dmgr dmgr0 = new dmgr("com.google.android.gms");
            new dxvn(new dola(s2, s3), dmgr0, domv1).inject(dxxk0);
            dxxk.o(dxxk0, new dxwt(dxxk0, fsvb0, null));
        }
        icir.d(new iclv(this.y().c, new dxvv(this, null)), lpt.a(this));
        icir.d(new iclv(this.y().e, new dxvw(this, null)), lpt.a(this));
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        ficx ficx0 = null;
        if(!hwqv.d()) {
            return null;
        }
        View view0 = new ComposeView(this.requireContext(), null, 0, 6, null);
        ((ComposeView)view0).a(new gze(0x30B16F38, true, new dxvy(this)));
        ficx ficx1 = this.aj;
        if(ficx1 == null) {
            ibuq.j("syntheticHost");
            ficx1 = null;
        }
        fhvo fhvo0 = this.z().e(0x3BDDC);
        String s = this.ap;
        if(s == null) {
            ibuq.j("accountName");
            s = null;
        }
        fhvo0.e(fhwp.b(s));
        fhvs fhvs0 = fhvo0.a(ficx1.a);
        fida fida0 = new fida(fhvs0);
        fhvs0.e = fida0;
        fida0.l();
        this.ak = fhvs0;
        ficx ficx2 = this.aj;
        if(ficx2 == null) {
            ibuq.j("syntheticHost");
            ficx2 = null;
        }
        fhvs fhvs1 = this.ak;
        hftr hftr0 = fhvs1.g;
        long v = ficx2.d.a() * 1000L;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        fhwd fhwd0 = (fhwd)hftr0.b_message;
        fhwd0.b |= 4;
        fhwd0.f = v;
        fhxq fhxq0 = ficx2.a(fhvs1);
        ficx.c(fhxq0);
        fhxq0.h();
        ficx ficx3 = this.aj;
        if(ficx3 == null) {
            ibuq.j("syntheticHost");
        }
        else {
            ficx0 = ficx3;
        }
        ficx0.b();
        return view0;
    }

    @Override  // du
    public final void onDestroyView() {
        super.onDestroyView();
        ficx ficx0 = this.aj;
        if(ficx0 == null) {
            ibuq.j("syntheticHost");
            ficx0 = null;
        }
        fhxq fhxq0 = ficx0.a(this.ak);
        ficx.c(fhxq0);
        fhxq0.i();
        this.ak = null;
    }

    public final dxxk y() {
        return (dxxk)this.ao.a();
    }

    public final fhwk z() {
        fhwk fhwk0 = this.ag;
        if(fhwk0 != null) {
            return fhwk0;
        }
        ibuq.j("viewVisualElements");
        return null;
    }
}

