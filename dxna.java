import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.pass.closedloop.view.shared.ProcessingTemplate;
import com.google.android.gms.pay.pass.common.template.detail.DetailTemplate;
import com.google.android.gms.pay.secard.view.template.SePrepaidCardLoadingScreenTemplate;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

public final class dxna extends dokz implements dskk, dskn, ednc, fshb, fshe, fshg, fshi {
    public static final bboh a;
    public fhwk ag;
    public fhvw ah;
    public dxnc ai;
    public dmgi aj;
    public fhwb ak;
    public fuok al;
    public domj am;
    public boolean an;
    public boolean ao;
    public AndroidInjector ap;
    public dxmi aq;
    public ftem ar;
    public final acp as;
    public dxnj at;
    private final dspu au;
    private final dspx av;
    private final fshj aw;
    private fhvs ax;
    public Account b;
    public frzk c;
    public dspp d;

    static {
        dxna.a = bboh.b("Pay", bbcu.cZ);
    }

    public dxna() {
        this.au = new dspu();
        this.av = new dspx();
        this.aw = fshj.a;
        this.as = this.registerForActivityResult(new fbgr(), new dxmz(this));
    }

    @Override  // dskn
    public final void B() {
        this.av.B();
    }

    @Override  // dskn
    public final void D() {
        this.av.D();
    }

    public final domj E() {
        domj domj0 = this.am;
        if(domj0 != null) {
            return domj0;
        }
        ibuq.j("loggingSessionIdManager");
        return null;
    }

    @Override  // ednc
    public final boolean F() {
        return hwue.d();
    }

    public final ProcessingTemplate G() {
        return (ProcessingTemplate)this.requireView().requireViewById(0x7F0B0540);  // id:LoadingScreen
    }

    public final DetailTemplate H() {
        View view0 = this.requireView().requireViewById(0x7F0B0210);  // id:ConfirmPaymentDetail
        ibuq.e(view0, "requireViewById(...)");
        return (DetailTemplate)view0;
    }

    @Override  // dskk
    public final void I() {
    }

    @Override  // dskk
    public final void J(View view0, gtzk gtzk0) {
        dskj.n(this);
    }

    @Override  // dskk
    public final void K() {
    }

    public final SePrepaidCardLoadingScreenTemplate L() {
        return (SePrepaidCardLoadingScreenTemplate)this.requireView().requireViewById(0x7F0B0540);  // id:LoadingScreen
    }

    @Override  // dskk
    public final void M() {
    }

    public final fhvw N() {
        fhvw fhvw0 = this.ah;
        if(fhvw0 != null) {
            return fhvw0;
        }
        ibuq.j("interactionLogger");
        return null;
    }

    public final fhwk O() {
        fhwk fhwk0 = this.ag;
        if(fhwk0 != null) {
            return fhwk0;
        }
        ibuq.j("viewVisualElements");
        return null;
    }

    @Override  // dskk
    public final void P(View view0, int v) {
    }

    @Override  // dskk
    public final void Q() {
    }

    public final frzk R() {
        frzk frzk0 = this.c;
        if(frzk0 != null) {
            return frzk0;
        }
        ibuq.j("authManager");
        return null;
    }

    public final fuok S() {
        fuok fuok0 = this.al;
        if(fuok0 != null) {
            return fuok0;
        }
        ibuq.j("edgeToEdgeStyler");
        return null;
    }

    public final boolean T() {
        return this.ao && this.an && hwev.c();
    }

    static void U(dxna dxna0, String s, String s1, String s2, String s3, hagu hagu0, boolean z, View.OnClickListener view$OnClickListener0, View.OnClickListener view$OnClickListener1, int v) {
        if((v & 1) != 0) {
            s = dxna0.getString(0x7F15239B);  // string:pay_wallet_card_purchase_error_title "Purchase not complete"
        }
        if((v & 2) != 0) {
            s1 = dxna0.getString(0x7F15239A);  // string:pay_wallet_card_purchase_error_content "Try adding money or buying a pass 
                                               // later"
        }
        if((v & 4) != 0) {
            s2 = dxna0.getString(0x7F1508A8);  // string:common_ok "OK"
        }
        ftem ftem0 = null;
        String s4 = (v & 8) == 0 ? s3 : null;
        hagu hagu1 = (v & 16) == 0 ? hagu0 : hagu.a;
        View.OnClickListener view$OnClickListener2 = (v & 0x40) == 0 ? view$OnClickListener0 : null;
        View.OnClickListener view$OnClickListener3 = (v & 0x80) == 0 ? view$OnClickListener1 : null;
        dxmi dxmi0 = dxna0.aq;
        if(dxmi0 == null) {
            ibuq.j("viewModel");
            dxmi0 = null;
        }
        dxmi0.f();
        eflw eflw0 = new eflw();
        eflw0.b = s;
        eflw0.c = s1;
        eflw0.d = s2;
        eflw0.n = false;
        if(view$OnClickListener2 != null) {
            eflw0.y = view$OnClickListener2;
        }
        if(s4 != null) {
            eflw0.e = s4;
        }
        if(view$OnClickListener3 != null) {
            eflw0.z = view$OnClickListener3;
        }
        eflz eflz0 = eflw0.a();
        ftem ftem1 = dxna0.ar;
        if(ftem1 == null) {
            ibuq.j("config");
            ftem1 = null;
        }
        if((ftem1.b & 0x1000000) != 0) {
            if((((v & 0x20) == 0 ? 1 : 0) & ((int)z)) == 0) {
                fhwk fhwk1 = dxna0.O();
                fhvw fhvw1 = dxna0.N();
                fhvs fhvs1 = dxna0.ax;
                if(fhvs1 == null) {
                    ibuq.j("parentCve");
                    fhvs1 = null;
                }
                eflz0.C(fhwk1, fhvw1, fhvs1, 0x3DDA1, 0x3DDA2);
            }
            else {
                fhwk fhwk0 = dxna0.O();
                fhvw fhvw0 = dxna0.N();
                fhvs fhvs0 = dxna0.ax;
                if(fhvs0 == null) {
                    ibuq.j("parentCve");
                    fhvs0 = null;
                }
                eflz0.C(fhwk0, fhvw0, fhvs0, 0x3DD9F, 0x3DDA0);
            }
        }
        eflz0.I(dxna0.getParentFragmentManager(), "pay_se_prepaid_card_detail_error_dialog");
        dmgi dmgi0 = dxna0.y();
        hagt hagt0 = hagt.be;
        ftem ftem2 = dxna0.ar;
        if(ftem2 == null) {
            ibuq.j("config");
            ftem2 = null;
        }
        gtlq gtlq0 = gtlq.b(ftem2.B) == null ? gtlq.a : gtlq.b(ftem2.B);
        ibuq.e(gtlq0, "getImplementationType(...)");
        ftem ftem3 = dxna0.ar;
        if(ftem3 == null) {
            ibuq.j("config");
        }
        else {
            ftem0 = ftem3;
        }
        dmgi0.b(dxsy.a(hagt0, gtlq0, (ftem0.r == null ? hkug.a : ftem0.r).d, dxsy.m(false, false, hagu1, 3)));
    }

    private final void V() {
        ftem ftem0 = this.ar;
        ftem ftem1 = null;
        if(ftem0 == null) {
            ibuq.j("config");
            ftem0 = null;
        }
        dyna dyna0 = dzdt.f(ftem0.c);
        ftem ftem2 = this.ar;
        if(ftem2 == null) {
            ibuq.j("config");
        }
        else {
            ftem1 = ftem2;
        }
        ftfu ftfu0 = ftem1.A == null ? ftfu.a : ftem1.A;
        hahc hahc0 = dzdt.l(dyna0, (ftfu0.d == null ? dyjr.a : ftfu0.d));
        dmgi dmgi0 = this.y();
        ibuq.c(dyna0);
        dmgi0.c(dxsy.d(dyna0, hanv.s, hahc0), this.E().a());
    }

    @Override  // dskk
    public final void Y() {
    }

    @Override  // dskk
    public final void aC(View view0) {
        if(!hwue.k()) {
            ftem ftem0 = this.ar;
            dxmi dxmi0 = null;
            if(ftem0 == null) {
                ibuq.j("config");
                ftem0 = null;
            }
            if((ftem0.b & 0x1000000) != 0) {
                this.V();
            }
            dxmi dxmi1 = this.aq;
            if(dxmi1 == null) {
                ibuq.j("viewModel");
            }
            else {
                dxmi0 = dxmi1;
            }
            dxmi0.g();
        }
    }

    @Override  // dskk
    public final void aE() {
    }

    @Override  // dskk
    public final void aF() {
    }

    @Override  // fshi
    public final boolean aI() {
        return false;
    }

    @Override  // fshi
    public final boolean aJ() {
        return false;
    }

    @Override  // fshi
    public final boolean aK() {
        this.au.aK();
        return false;
    }

    @Override  // fshi
    public final boolean aL() {
        this.au.aL();
        return false;
    }

    @Override  // dskk
    public final void aM() {
    }

    @Override  // dskk
    public final void aN() {
    }

    @Override  // dskk
    public final void aO() {
    }

    @Override  // dskk
    public final void aP() {
    }

    @Override  // dskk
    public final void aQ() {
    }

    @Override  // dskk
    public final void aR() {
    }

    @Override  // dskk
    public final void aS() {
    }

    @Override  // dskk
    public final void aU() {
    }

    @Override  // dskk
    public final void aV(gtzk gtzk0) {
    }

    @Override  // dskk
    public final void aW() {
    }

    @Override  // dskk
    public final void aY(Parcelable parcelable0) {
    }

    @Override  // dskk
    public final void aZ() {
    }

    @Override  // dskk
    public final void aa(gtzk gtzk0) {
    }

    @Override  // dskk
    public final void ab() {
    }

    @Override  // dskk
    public final void ac(View view0, gtzk gtzk0) {
        dskj.o(this);
    }

    @Override  // dskk
    public final void ad(View view0, gtzk gtzk0) {
    }

    @Override  // fshi
    public final void af(boolean z, fshh fshh0) {
    }

    @Override  // dskk
    public final void ag() {
    }

    @Override  // fshi
    public final void ah(boolean z, fshh fshh0) {
        this.au.ah(z, fshh0);
    }

    @Override  // dskk
    public final void ai() {
    }

    @Override  // dskk
    public final void aj() {
    }

    @Override  // dskk
    public final void ax(gtzk gtzk0) {
    }

    @Override  // fshg
    public final gfsx bA() {
        return gfqx.a;
    }

    @Override  // fshi
    public final boolean bB() {
        this.au.bB();
        return false;
    }

    @Override  // fshi
    public final boolean bC() {
        this.au.bC();
        return false;
    }

    @Override  // fshi
    public final boolean bD() {
        this.au.bD();
        return false;
    }

    @Override  // fshi
    public final boolean bE() {
        this.au.bE();
        return false;
    }

    @Override  // fshi
    public final boolean bF() {
        this.au.bF();
        return false;
    }

    @Override  // fshg
    public final gfsx bG() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx bH() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gged_interceptors bI() {
        return ggna.a;
    }

    @Override  // fshg
    public final gged_interceptors bJ() {
        return ggna.a;
    }

    @Override  // fshg
    public final guut bK() {
        return guut.a;
    }

    @Override  // fshg
    public final String bL() {
        return "";
    }

    @Override  // fshg
    public final boolean bN() {
        return true;
    }

    @Override  // fshg
    public final boolean bO() {
        return false;
    }

    @Override  // fshg
    public final boolean bP() {
        return false;
    }

    @Override  // fshg
    public final boolean bQ() {
        return false;
    }

    @Override  // fshg
    public final boolean bR() {
        return false;
    }

    @Override  // fshg
    public final boolean bS() {
        return false;
    }

    @Override  // fshg
    public final boolean bT() {
        return false;
    }

    @Override  // dskk
    public final void ba() {
    }

    @Override  // dskk
    public final void bb() {
    }

    @Override  // dskk
    public final void bc() {
    }

    @Override  // dskk
    public final void bd() {
    }

    @Override  // dskk
    public final void be() {
    }

    @Override  // dskk
    public final void bf() {
        if(hwue.k()) {
            ftem ftem0 = this.ar;
            dxmi dxmi0 = null;
            if(ftem0 == null) {
                ibuq.j("config");
                ftem0 = null;
            }
            if((ftem0.b & 0x1000000) != 0) {
                this.V();
            }
            dxmi dxmi1 = this.aq;
            if(dxmi1 == null) {
                ibuq.j("viewModel");
            }
            else {
                dxmi0 = dxmi1;
            }
            dxmi0.g();
        }
    }

    @Override  // dskk
    public final void bg(gtzk gtzk0) {
        dskj.b(this);
    }

    @Override  // dskk
    public final void bh() {
        dskj.c(this);
    }

    @Override  // dskk
    public final void bi() {
        dskj.d(this);
    }

    @Override  // dskk
    public final void bj() {
        dskj.e(this);
    }

    @Override  // dskk
    public final void bk(gtzk gtzk0) {
        dskj.f(this, gtzk0);
    }

    @Override  // dskk
    public final void bl() {
        dskj.g(this);
    }

    @Override  // dskk
    public final void bm() {
        dskj.h(this);
    }

    @Override  // dskk
    public final void bn() {
        dskj.i(this);
    }

    @Override  // dskk
    public final void bo() {
        dskj.j(this);
    }

    @Override  // dskk
    public final void bp(gtzk gtzk0) {
        dskj.k(this, gtzk0);
    }

    @Override  // dskk
    public final void bq() {
    }

    @Override  // dskk
    public final void br() {
        dskj.l(this);
    }

    @Override  // dskk
    public final void bs() {
        dskj.m(this);
    }

    @Override  // fshg
    public final gfsx bt() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx bu() {
        return gfqx.a;
    }

    @Override  // fshi
    public final void bv(boolean z, fshh fshh0) {
        this.au.bv(z, fshh0);
    }

    @Override  // fshi
    public final void bw(boolean z, fshh fshh0) {
        this.au.bw(z, fshh0);
    }

    @Override  // fshi
    public final void bx(boolean z, fshh fshh0) {
        this.au.bx(z, fshh0);
    }

    @Override  // fshg
    public final gfsx by() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx bz() {
        return gfqx.a;
    }

    @Override  // fshe
    public final String jT(long v, String s) {
        ibuq.f(s, "externalTicketId");
        return this.aw.jT(v, s);
    }

    @Override  // fshe
    public final String jU(long v, String s, guno guno0, guno guno1) {
        ibuq.f(s, "externalDeviceTicketId");
        ibuq.f(guno0, "dateStyle");
        ibuq.f(guno1, "timeStyle");
        return this.aw.jU(v, s, guno0, guno1);
    }

    @Override  // fshe
    public final String jV(long v, String s) {
        ibuq.f(s, "externalTicketId");
        return this.aw.jV(v, s);
    }

    @Override  // dskn
    public final void kc() {
        this.av.kc();
    }

    @Override  // fshb
    public final int kd() {
        return 1;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        this.ar = dxsy.l(this.requireArguments());
        dolg dolg0 = this.ap();
        Preconditions.b(dolg0);
        done done0 = new done();
        edlf edlf0 = new edlf();
        AndroidInjector androidInjector0 = null;
        dmgr dmgr0 = new dmgr((this.getContext() == null ? null : "com.google.android.gms"));
        doma doma0 = new doma(this);
        edop edop0 = new edop();
        dzpy dzpy0 = new dzpy(this);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        ftem ftem0 = this.ar;
        if(ftem0 == null) {
            ibuq.j("config");
            ftem0 = null;
        }
        dxnv dxnv0 = new dxnv(dmgr0, doma0, dzpy0, eefy.b((ftem0.z == null ? fton.a : ftem0.z)), dolg0, done0, edlf0, edop0, domv0);
        if(this.ap == null) {
            this.ap = dxnv0;
        }
        AndroidInjector androidInjector1 = this.ap;
        if(androidInjector1 == null) {
            ibuq.j("injector");
        }
        else {
            androidInjector0 = androidInjector1;
        }
        androidInjector0.inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        int v;
        ibuq.f(layoutInflater0, "inflater");
        if(!hwue.f()) {
            v = 0x7F0E0CB6;  // layout:wallet_confirm_payment_scrollable_fragment
        }
        else if(this.T()) {
            v = 0x7F0E0CB5;  // layout:wallet_confirm_payment_fragment_in_wear_oobe
        }
        else {
            v = 0x7F0E0CB4;  // layout:wallet_confirm_payment_fragment_generic_loading_screen
        }
        View view0 = layoutInflater0.inflate(v, viewGroup0, false);
        this.ax = this.O().f(view0, this.O().a.a(0x3A160));
        if(hwue.d()) {
            fuok fuok0 = this.S();
            View view1 = view0.findViewById(0x7F0B0211);  // id:ConfirmPaymentRootView
            ibuq.e(view1, "findViewById(...)");
            fuop.g(fuok0, view1);
        }
        if(this.T()) {
            fuok fuok1 = this.S();
            ibuq.c(view0);
            fuop.g(fuok1, view0);
        }
        return view0;
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        this.H().i(this, gfqx.a);
        xob xob0 = this.ao();
        dxnj dxnj0 = this.at;
        if(dxnj0 == null) {
            ibuq.j("viewModelFactory");
            dxnj0 = null;
        }
        ftem ftem0 = this.ar;
        if(ftem0 == null) {
            ibuq.j("config");
            ftem0 = null;
        }
        ibuq.f(dxnj0, "factory");
        ibuq.f(ftem0, "purchasePreviewConfig");
        dxmi dxmi0 = (dxmi)new lso(xob0, new dxnh(dxnj0.a.a, dxnj0.a.b, ftem0)).a(dxmi.class);
        this.aq = dxmi0;
        if(dxmi0 == null) {
            ibuq.j("viewModel");
            dxmi0 = null;
        }
        lps lps0 = this.getViewLifecycleOwner();
        icbb.b(lpt.a(lps0), null, null, new dxms(lps0, dxmi0.c.a, null, this), 3);
        dxmi dxmi1 = this.aq;
        if(dxmi1 == null) {
            ibuq.j("viewModel");
            dxmi1 = null;
        }
        lps lps1 = this.getViewLifecycleOwner();
        icbb.b(lpt.a(lps1), null, null, new dxmv(lps1, dxmi1.b.c, null, this), 3);
        lpg lpg0 = this.getLifecycle();
        dxmi dxmi2 = this.aq;
        if(dxmi2 == null) {
            ibuq.j("viewModel");
            dxmi2 = null;
        }
        lpg0.c(dxmi2);
        icig icig0 = this.R().b();
        lps lps2 = this.getViewLifecycleOwner();
        icbb.b(lpt.a(lps2), null, null, new dxmy(lps2, icig0, null, this), 3);
    }

    public final dmgi y() {
        dmgi dmgi0 = this.aj;
        if(dmgi0 != null) {
            return dmgi0;
        }
        ibuq.j("clearcutEventLogger");
        return null;
    }

    @Override  // dskn
    public final void z() {
        this.av.z();
    }
}

