import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.secard.view.template.SePrepaidCardLoadingScreenTemplate;
import dagger.internal.Preconditions;
import j..util.Optional;

public final class eabn extends dokz implements ednc, eflx, fshb {
    public Account a;
    public fuok ag;
    public fhxi ah;
    public boolean ai;
    public boolean aj;
    public eagu ak;
    public static final int al;
    private static final bboh am;
    private eabb an;
    private fhvs ao;
    private final Optional ap;
    private final Optional aq;
    public fhwk b;
    public domj c;
    public fhvw d;

    static {
        eabn.am = bboh.b("Pay", bbcu.cZ);
    }

    public eabn() {
        Optional optional0 = Optional.empty();
        ibuq.e(optional0, "empty(...)");
        this.ap = optional0;
        Optional optional1 = Optional.empty();
        ibuq.e(optional1, "empty(...)");
        this.aq = optional1;
    }

    public final dzdm A() {
        ggeo ggeo0 = dzdm.h;
        eagu eagu0 = this.ak;
        if(eagu0 == null) {
            ibuq.j("provisionData");
            eagu0 = null;
        }
        Object object0 = ggeo0.get((dyna.b(eagu0.c) == null ? dyna.k : dyna.b(eagu0.c)));
        batl.s(object0);
        return (dzdm)object0;
    }

    public final fhvw B() {
        fhvw fhvw0 = this.d;
        if(fhvw0 != null) {
            return fhvw0;
        }
        ibuq.j("interactionLogger");
        return null;
    }

    public final fhwk D() {
        fhwk fhwk0 = this.b;
        if(fhwk0 != null) {
            return fhwk0;
        }
        ibuq.j("viewVisualElements");
        return null;
    }

    public final fhxi E() {
        fhxi fhxi0 = this.ah;
        if(fhxi0 != null) {
            return fhxi0;
        }
        ibuq.j("composeVisualElements");
        return null;
    }

    @Override  // ednc
    public final boolean F() {
        return true;
    }

    public final String G() {
        eagu eagu0 = this.ak;
        if(eagu0 == null) {
            ibuq.j("provisionData");
            eagu0 = null;
        }
        String s = (eagt.b(eagu0.d) == null ? eagt.k : eagt.b(eagu0.d)).equals(eagt.e) ? this.getString(0x7F1520E3) : this.getString((this.ai ? 0x7F151C31 : 0x7F151C30));  // string:pay_se_card_being_transferred_to_wallet "Your card is now being transferred"
        ibuq.c(s);
        return s;
    }

    public final void H() {
        eagu eagu0 = this.ak;
        if(eagu0 == null) {
            ibuq.j("provisionData");
            eagu0 = null;
        }
        this.at(-1, dzpw.a(eagu0));
        this.ar();
    }

    public final void I(int v, int[] arr_v) {
        View view0 = this.requireView();
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            View view1 = view0.findViewById(arr_v[v1]);
            if(view1 != null) {
                view1.setVisibility(v);
            }
        }
    }

    public final void J(String s, String s1, String s2) {
        if(this.aw()) {
            return;
        }
        eflw eflw0 = new eflw();
        eflw0.b = s;
        eflw0.c = s1;
        eflw0.d = s2;
        eflw0.a = 1;
        eflz eflz0 = eflw0.a();
        eflz0.setTargetFragment(this, 1);
        eflz0.C(this.D(), this.B(), this.ao, 0x3C380, 0x3C381);
        eflz0.I(this.getParentFragmentManager(), "pay_se_prepaid_card_detail_error_dialog");
    }

    public final boolean K() {
        return hwev.c() && this.aj && this.ai;
    }

    static void L(eabn eabn0, View view0, int v) {
        eabn0.M(view0, v, null);
    }

    private final fhvs M(View view0, int v, fhvp fhvp0) {
        fhvo fhvo0 = this.D().a.a(v);
        if(fhvp0 != null) {
            fhvo0.d(fhvp0);
        }
        fhvs fhvs0 = this.D().f(view0, fhvo0);
        ibuq.e(fhvs0, "bind(...)");
        return fhvs0;
    }

    @Override  // eflx
    public final void g(int v, int v1, Parcelable parcelable0) {
        if(v1 == 1) {
            this.at(0, null);
            this.ar();
        }
    }

    @Override  // fshb
    public final int kd() {
        return hwle.e() ? 1 : 3;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        dolg dolg0 = this.ap();
        Preconditions.b(dolg0);
        dzpy dzpy0 = new dzpy(this);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        dzuc dzuc0 = new dzuc(dzpy0, eefy.a(this.am()), dolg0, domv0);
        ((dzuc)ibvp.a(this.ap, dzuc0)).inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        fhvp fhvp0;
        int v;
        ibuq.f(layoutInflater0, "inflater");
        super.onCreateView(layoutInflater0, viewGroup0, bundle0);
        ((ggtj)eabn.am.h()).x("ProvisionCommitViewModelFragment#onCreateView");
        this.ak = dzpw.c(this.getArguments());
        if(this.K()) {
            v = 0x7F0E0821;  // layout:provision_commit_fragment_wear_oobe
        }
        else {
            v = hwev.c() ? 0x7F0E081F : 0x7F0E0820;  // layout:provision_commit_fragment
        }
        View view0 = layoutInflater0.inflate(v, viewGroup0, false);
        ibuq.c(view0);
        eagu eagu0 = this.ak;
        eagu eagu1 = null;
        if(eagu0 == null) {
            ibuq.j("provisionData");
            eagu0 = null;
        }
        hfuo hfuo0 = eagu0.e;
        ibuq.e(hfuo0, "getCardsToBeTransferredList(...)");
        if(hfuo0.isEmpty()) {
            eagu eagu2 = this.ak;
            if(eagu2 == null) {
                ibuq.j("provisionData");
            }
            else {
                eagu1 = eagu2;
            }
            dyna dyna0 = dyna.b(eagu1.c) == null ? dyna.k : dyna.b(eagu1.c);
            ibuq.e(dyna0, "getServiceProvider(...)");
            String s = this.y().a();
            ibuq.e(s, "get(...)");
            fhvp0 = dzaw.h(dyna0, s, this.aj);
        }
        else {
            String s1 = this.y().a();
            ibuq.e(s1, "get(...)");
            fhvp0 = dzaw.d(s1, ggia.h(hfuo0, new eabh(new eabg(this))), this.aj);
        }
        this.ao = this.M(view0, 168404, fhvp0);
        View view1 = view0.findViewById(0x7F0B0859);  // id:SuccessScreen
        ibuq.e(view1, "findViewById(...)");
        eabn.L(this, view1, 0x2A863);
        View view2 = view0.findViewById(0x7F0B006F);  // id:AlmostDoneScreen
        ibuq.e(view2, "findViewById(...)");
        eabn.L(this, view2, 0x3331F);
        View view3 = view0.findViewById(0x7F0B04C6);  // id:InstallWalletPrompt
        ibuq.e(view3, "findViewById(...)");
        eabn.L(this, view3, 0x33320);
        return view0;
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        gurm gurm0;
        ibuq.f(view0, "view");
        this.an = (eabb)new lso(this).a(eabb.class);
        eabb eabb0 = this.an;
        eabb eabb1 = null;
        if(eabb0 == null) {
            ibuq.j("model");
            eabb0 = null;
        }
        dolg dolg0 = this.ap();
        eagu eagu0 = this.ak;
        if(eagu0 == null) {
            ibuq.j("provisionData");
            eagu0 = null;
        }
        Bundle bundle1 = this.am();
        boolean z = this.aj;
        batl.g();
        if(!eabb0.a) {
            eabb0.a = true;
            Preconditions.b(dolg0);
            dxen dxen0 = new dxen();
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            dzud dzud0 = new dzud(eefy.a(bundle1), dolg0, dxen0, domv0);
            ((dzud)eabb0.n.orElse(dzud0)).inject(eabb0);
            eabb0.m = eagu0;
            if(!dzau.k((dyna.b(eagu0.c) == null ? dyna.k : dyna.b(eagu0.c)))) {
                if(z && eabb0.g) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ftko.a).v_newBuilder();
                    if(eabb0.k()) {
                        ByteString hfsf0 = eabb0.m.p;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ftko ftko0 = (ftko)hftp1.b_message;
                        hfsf0.getClass();
                        ftko0.e = hfsf0;
                    }
                    int v = (eagt.b(eabb0.m.d) == null ? eagt.k : eagt.b(eabb0.m.d)).ordinal();
                    switch(v) {
                        case 1: {
                            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)dymu.a).v_newBuilder();
                            dyna dyna0 = dyna.b(eabb0.m.c) == null ? dyna.k : dyna.b(eabb0.m.c);
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            dymu dymu0 = (dymu)hftp2.b_message;
                            dymu0.c = dyna0.a();
                            dyem dyem0 = eabb0.m.g == null ? dyem.a : eabb0.m.g;
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            dymu dymu1 = (dymu)hftp2.b_message;
                            dyem0.getClass();
                            dymu1.d = dyem0;
                            dymu1.b |= 1;
                            dylg dylg0 = eabb0.m.h == null ? dylg.a : eabb0.m.h;
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            dymu dymu2 = (dymu)hftp2.b_message;
                            dylg0.getClass();
                            dymu2.e = dylg0;
                            dymu2.b |= 2;
                            dymu dymu3 = (dymu)hftp2.N_build();
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp1.b_message;
                            dymu3.getClass();
                            ((ftko)hftv0).c = dymu3;
                            ((ftko)hftv0).b = 1;
                            gurm gurm1 = gurm.g;
                            if(!hftv0.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ftko ftko3 = (ftko)hftp1.b_message;
                            ftko3.d = gurm1.a();
                            goto label_136;
                        }
                        case 2: {
                            dymt dymt0 = eabb0.m.m == null ? dymt.a : eabb0.m.m;
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ProtoLiteMessage hftv1 = hftp1.b_message;
                            dymt0.getClass();
                            ((ftko)hftv1).c = dymt0;
                            ((ftko)hftv1).b = 2;
                            gurm gurm2 = gurm.g;
                            if(!hftv1.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ftko ftko4 = (ftko)hftp1.b_message;
                            ftko4.d = gurm2.a();
                        label_136:
                            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)evlj.a).v_newBuilder();
                            String s2 = eabb0.e.name;
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            evlj evlj0 = (evlj)hftp3.b_message;
                            s2.getClass();
                            evlj0.e = s2;
                            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)evkr.a).v_newBuilder();
                            if(!hftp4.b_message.isImmutable()) {
                                hftp4.ensureMutable();
                            }
                            evkr evkr0 = (evkr)hftp4.b_message;
                            ftko ftko5 = (ftko)hftp1.N_build();
                            ftko5.getClass();
                            evkr0.c = ftko5;
                            evkr0.b |= 1;
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            evlj evlj1 = (evlj)hftp3.b_message;
                            evkr evkr1 = (evkr)hftp4.N_build();
                            evkr1.getClass();
                            evlj1.c = evkr1;
                            evlj1.b = 51;
                            evlj evlj2 = (evlj)hftp3.N_build();
                            evql evql0 = eabb0.j.a(eekn.e(eabb0.e.name, evlj2));
                            evql0.b(new eaba(eabb0));
                            evql0.A(new eaah(eabb0));
                            break;
                        }
                        default: {
                            if(v != 5 && v != 6 && v != 7) {
                                ((ggtj)((ggtj)eabb.b.i()).ar(0x2E8A)).B("Not supported provision purpose for SUW flow %s", (eagt.b(eabb0.m.d) == null ? eagt.k : eagt.b(eabb0.m.d)).name());
                                dzdk dzdk0 = new dzdk(dzzz.a);
                                eabb0.p.l(dzdk0);
                            }
                            else {
                                dylx dylx0 = (dylx)((ProtoLiteMessage)dyly.a).v_newBuilder();
                                dylx0.a(eabb0.m.e);
                                eagu eagu1 = eabb0.m;
                                if((eagu1.b & 8) != 0) {
                                    String s1 = eagu1.o;
                                    if(!dylx0.b_message.isImmutable()) {
                                        ((ProtoLiteBuilder)dylx0).ensureMutable();
                                    }
                                    dyly dyly0 = (dyly)dylx0.b_message;
                                    s1.getClass();
                                    dyly0.c = s1;
                                }
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ftko ftko1 = (ftko)hftp1.b_message;
                                dyly dyly1 = (dyly)((ProtoLiteBuilder)dylx0).N_build();
                                dyly1.getClass();
                                ftko1.c = dyly1;
                                ftko1.b = 3;
                                switch((eagt.b(eabb0.m.d) == null ? eagt.k : eagt.b(eabb0.m.d)).ordinal()) {
                                    case 5: {
                                        gurm0 = gurm.i;
                                        break;
                                    }
                                    case 6: {
                                        gurm0 = gurm.j;
                                        break;
                                    }
                                    case 7: {
                                        gurm0 = gurm.h;
                                        break;
                                    }
                                    default: {
                                        gurm0 = gurm.a;
                                    }
                                }
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ftko ftko2 = (ftko)hftp1.b_message;
                                ftko2.d = gurm0.a();
                                goto label_136;
                            }
                        }
                    }
                }
                else {
                alab1:
                    switch((eagt.b(eabb0.m.d) == null ? eagt.k : eagt.b(eabb0.m.d)).ordinal()) {
                        case 1: 
                        case 2: 
                        case 4: {
                            eabb0.o.l(eaad.a);
                            switch(dzau.b(eabb0.m)) {
                                case 1: 
                                case 3: {
                                    eagu eagu2 = eabb0.m;
                                    if((eagu2.b & 1) == 0) {
                                        eabb0.i();
                                    }
                                    else {
                                        dypv dypv0 = eabb0.d;
                                        dyem dyem1 = eagu2.g == null ? dyem.a : eagu2.g;
                                        evqp evqp0 = new evqp();
                                        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gurr.a).v_newBuilder();
                                        String s3 = dyem1.e + " " + dyem1.f;
                                        if(!hftp5.b_message.isImmutable()) {
                                            hftp5.ensureMutable();
                                        }
                                        ((gurr)hftp5.b_message).c = s3;
                                        gtkw gtkw0 = (gtkw)((ProtoLiteMessage)gtkx.a).v_newBuilder();
                                        String s4 = dyem1.o;
                                        if(!gtkw0.b_message.isImmutable()) {
                                            ((ProtoLiteBuilder)gtkw0).ensureMutable();
                                        }
                                        gtkx gtkx0 = (gtkx)gtkw0.b_message;
                                        s4.getClass();
                                        gtkx0.e = s4;
                                        if(!gtkw0.b_message.isImmutable()) {
                                            ((ProtoLiteBuilder)gtkw0).ensureMutable();
                                        }
                                        gtkx.b(((gtkx)gtkw0.b_message));
                                        String s5 = dyem1.l;
                                        if(!gtkw0.b_message.isImmutable()) {
                                            ((ProtoLiteBuilder)gtkw0).ensureMutable();
                                        }
                                        gtkx gtkx1 = (gtkx)gtkw0.b_message;
                                        s5.getClass();
                                        gtkx1.d = s5;
                                        String s6 = dyem1.m;
                                        if(!gtkw0.b_message.isImmutable()) {
                                            ((ProtoLiteBuilder)gtkw0).ensureMutable();
                                        }
                                        gtkx gtkx2 = (gtkx)gtkw0.b_message;
                                        s6.getClass();
                                        gtkx2.c = s6;
                                        gtkw0.a(dyem1.n);
                                        gtkx gtkx3 = (gtkx)((ProtoLiteBuilder)gtkw0).N_build();
                                        if(!hftp5.b_message.isImmutable()) {
                                            hftp5.ensureMutable();
                                        }
                                        gurr gurr0 = (gurr)hftp5.b_message;
                                        gtkx3.getClass();
                                        gurr0.d = gtkx3;
                                        gurr0.b |= 1;
                                        gurr gurr1 = (gurr)hftp5.N_build();
                                        dypu dypu0 = new dypu(dypv0, evqp0);
                                        dptv.l(dypv0.a, dpuj.bM, ((MessageLite)gurr1), ((MessageLite)gurs.a), dypu0);
                                        eaag eaag0 = new eaag(eabb0);
                                        evqp0.a.e(eaag0).b(new eaas(eabb0));
                                    }
                                    break alab1;
                                }
                                default: {
                                    eabb0.i();
                                    break alab1;
                                }
                            }
                        }
                        case 3: 
                        case 5: 
                        case 6: 
                        case 7: 
                        case 8: {
                            dyna dyna1 = dyna.b(eabb0.m.c) == null ? dyna.k : dyna.b(eabb0.m.c);
                            eagt eagt0 = eagt.b(eabb0.m.d) == null ? eagt.k : eagt.b(eabb0.m.d);
                            if(!eagt0.equals(eagt.d) || eabb0.m.l.size() != 1) {
                                ibuq.f(eagt0, "<this>");
                                if((eagt0 == eagt.h || eagt0 == eagt.g || eagt0 == eagt.f) && eabb0.m.e.size() == 1) {
                                    hkjm hkjm0 = (hkjm)eabb0.m.e.get(0);
                                    if(eabb0.g) {
                                        eabb0.j((hkjm0.c == null ? hjwx.a : hkjm0.c).d);
                                    }
                                    else {
                                        eabb0.o.l(new eaae(dzau.e(dyna1, (hkjm0.c == null ? hjwx.a : hkjm0.c).d, eabb0.e)));
                                    }
                                }
                                else {
                                    eaae eaae1 = new eaae();
                                    eabb0.o.l(eaae1);
                                }
                            }
                            else if(eabb0.g) {
                                dyih dyih0 = ((dylc)eabb0.m.l.get(0)).i;
                                if(dyih0 == null) {
                                    dyih0 = dyih.a;
                                }
                                eabb0.j(dyih0.c);
                            }
                            else {
                                eaae eaae0 = new eaae(dzau.c(((dylc)eabb0.m.l.get(0)), eabb0.e));
                                eabb0.o.l(eaae0);
                            }
                            break;
                        }
                        default: {
                            ((ggtj)((ggtj)eabb.b.i()).ar(0x2E89)).B("Not supported provision purpose %s", (eagt.b(eabb0.m.d) == null ? eagt.k : eagt.b(eabb0.m.d)).name());
                            dzdk dzdk1 = new dzdk(dzzz.a);
                            eabb0.p.l(dzdk1);
                        }
                    }
                }
            }
            else if(!(eagt.b(eabb0.m.d) == null ? eagt.k : eagt.b(eabb0.m.d)).equals(eagt.j)) {
                eabb0.g();
            }
            else {
                azts azts0 = eabb0.q;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dyfv.a).v_newBuilder();
                String s = eabb0.e.name;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dyfv dyfv0 = (dyfv)hftp0.b_message;
                s.getClass();
                dyfv0.d = s;
                dyew dyew0 = dyew.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dyfv dyfv1 = (dyfv)hftp0.b_message;
                dyew0.getClass();
                dyfv1.c = dyew0;
                dyfv1.b = 13;
                azts0.ba(((dyfv)hftp0.N_build()).toBytesArray()).c(new eaar(eabb0)).A(new eaat(eabb0));
            }
        }
        eabb eabb2 = this.an;
        if(eabb2 == null) {
            ibuq.j("model");
            eabb2 = null;
        }
        eabm eabm0 = new eabm(new eabk(this));
        eabb2.o.g(this, eabm0);
        eabb eabb3 = this.an;
        if(eabb3 == null) {
            ibuq.j("model");
        }
        else {
            eabb1 = eabb3;
        }
        eabm eabm1 = new eabm(new eabl(this));
        eabb1.p.g(this, eabm1);
        if(this.K()) {
            view0.findViewById(0x7F0B09F2).setOnClickListener(new eabe(this));  // id:WearOobeBackButton
            SePrepaidCardLoadingScreenTemplate sePrepaidCardLoadingScreenTemplate0 = (SePrepaidCardLoadingScreenTemplate)view0.findViewById(0x7F0B0540);  // id:LoadingScreen
            sePrepaidCardLoadingScreenTemplate0.e(eaou.b);
            sePrepaidCardLoadingScreenTemplate0.a();
        }
    }

    public final domj y() {
        domj domj0 = this.c;
        if(domj0 != null) {
            return domj0;
        }
        ibuq.j("loggingSessionIdManager");
        return null;
    }
}

