import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;
import com.google.android.libraries.tapandpay.ui.rowprimary.RowPrimary;
import com.google.android.libraries.tapandpay.ui.viewheader.ComposeViewHeader;
import dagger.internal.Preconditions;

public final class eaeu extends dokz implements ednc, fshb {
    public static final bboh a;
    public fhvw ag;
    public fhxi ah;
    public domj ai;
    public eaca aj;
    public eagm ak;
    public eagu al;
    public eago am;
    private final ibnn an;
    public dzqp b;
    public ibnf c;
    public fhwk d;

    static {
        eaeu.a = bboh.b("ProvisionOptionsFragment", bbcu.cZ);
    }

    public eaeu() {
        this.an = new ibnz(new eaen(this));
    }

    public final dzqp A() {
        dzqp dzqp0 = this.b;
        if(dzqp0 != null) {
            return dzqp0;
        }
        ibuq.j("sePrepaidCardListAdapter");
        return null;
    }

    public final fhvw B() {
        fhvw fhvw0 = this.ag;
        if(fhvw0 != null) {
            return fhvw0;
        }
        ibuq.j("interactionLogger");
        return null;
    }

    public final fhwk D() {
        fhwk fhwk0 = this.d;
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

    public final void G() {
        View view0 = this.requireView();
        eagu eagu0 = this.al;
        if(eagu0 == null) {
            ibuq.j("provisionData");
            eagu0 = null;
        }
        dyna dyna0 = dyna.b(eagu0.c) == null ? dyna.k : dyna.b(eagu0.c);
        ibuq.e(dyna0, "getServiceProvider(...)");
        String s = this.y().a();
        ibuq.e(s, "get(...)");
        this.Q(view0, 168401, dzaw.h(dyna0, s, this.R()));
    }

    public final void H() {
        View view0 = this.requireView();
        eagu eagu0 = this.al;
        if(eagu0 == null) {
            ibuq.j("provisionData");
            eagu0 = null;
        }
        dyna dyna0 = dyna.b(eagu0.c) == null ? dyna.k : dyna.b(eagu0.c);
        ibuq.e(dyna0, "getServiceProvider(...)");
        String s = this.y().a();
        ibuq.e(s, "get(...)");
        this.Q(view0, 203072, dzaw.h(dyna0, s, this.R()));
    }

    public final void I(eagu eagu0) {
        eaca eaca0 = this.aj;
        if(eaca0 == null) {
            ibuq.j("provisionFlowHelper");
            eaca0 = null;
        }
        eaca0.f(new eabs(), eagu0);
    }

    public final void J(dzzl dzzl0, gurm gurm0) {
        ComposeActionBar composeActionBar0 = (ComposeActionBar)this.requireView().findViewById(0x7F0B022E);  // id:ContinueActionBar
        ftuw ftuw0 = composeActionBar0.b();
        fryr fryr0 = new fryr(dzzl0.a);
        eagu eagu0 = null;
        fryh fryh0 = dzzl0.c == 0 ? null : new fryh(dzzl0.c);
        ibth ibth0 = dzzl0.d;
        int v = dzzl0.b;
        eagu eagu1 = this.al;
        if(eagu1 == null) {
            ibuq.j("provisionData");
        }
        else {
            eagu0 = eagu1;
        }
        gged_interceptors gged0 = gged_interceptors.l(dzaw.i(gurm0, (dyna.b(eagu0.c) == null ? dyna.k : dyna.b(eagu0.c))));
        ibuq.e(gged0, "of(...)");
        composeActionBar0.d(ftuw.a(ftuw0, new ftts(fryr0, null, false, null, fryh0, null, v, gged0, null, ibth0, 302), null, false, ftvd.a, null, false, 0xF6));
        composeActionBar0.e(new fufz(this.E(), this.B()));
        ibuq.c(composeActionBar0);
        composeActionBar0.setVisibility(0);
    }

    public final void K(eagy eagy0) {
        fryv fryv0;
        eagy eagy1 = eagy0;
        String s = eagy1.d;
        if(s == null) {
            fryv0 = eagy1.c;
        }
        else {
            Context context0 = this.requireContext();
            String s1 = eagy1.c.a(context0).toString();
            long v = hln.c(fipx.a(this.requireContext(), 0x7F04030C));  // attr:colorPrimary
            ibth ibth0 = eagy1.e;
            ibuq.f(s1, "text");
            int v1 = ibzk.N(s1, s, 0, false, 6);
            int v2 = s.length() + v1;
            iwg iwg0 = new iwg(null);
            if(v1 > 0) {
                String s2 = s1.substring(0, v1);
                ibuq.e(s2, "substring(...)");
                iwg0.j(s2);
            }
            jbf jbf0 = new jbf(new jat(v, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 0xEFFE), 14);
            int v3 = iwg0.b(new iwy("clickableSubtitle", jbf0, new dzat(ibth0)));
            try {
                iwg0.j(s);
            }
            catch(Throwable throwable0) {
                iwg0.k(v3);
                throw throwable0;
            }
            iwg0.k(v3);
            if(v2 < ((String)jbf0).length()) {
                String s3 = ((String)jbf0).substring(v2, ((String)jbf0).length());
                ibuq.e(s3, "substring(...)");
                iwg0.j(s3);
            }
            eagy1 = eagy0;
            fryv0 = new fryq(iwg0.d());
        }
        super(eagy1.a, eagy1.b, fryv0);
        ((ComposeViewHeader)this.requireView().findViewById(0x7F0B047D)).b(null);  // id:HeaderView
    }

    public final void L(eadc eadc0, int v, boolean z) {
        RowPrimary rowPrimary0 = (RowPrimary)this.requireView().findViewById(v);
        ibuq.c(rowPrimary0);
        rowPrimary0.setVisibility(0);
        rowPrimary0.g(eadc0.a);
        rowPrimary0.setOnClickListener(new eaem(this, eadc0));
        if(z) {
            funy.e(rowPrimary0, null, Integer.valueOf(rowPrimary0.getResources().getDimensionPixelSize(0x7F070E1D)), 7);  // dimen:pay_spacing_between_rows
        }
    }

    public final void M() {
        View view0 = this.requireView();
        View view1 = view0.findViewById(0x7F0B0540);  // id:LoadingScreen
        ibuq.e(view1, "findViewById(...)");
        view1.setVisibility(8);
        View view2 = view0.findViewById(0x7F0B06EF);  // id:ProvisionOptionsScreen
        ibuq.e(view2, "findViewById(...)");
        view2.setVisibility(0);
        View view3 = view0.findViewById(0x7F0B016E);  // id:CardList
        ibuq.e(view3, "findViewById(...)");
        view3.setVisibility(8);
        View view4 = view0.findViewById(0x7F0B099C);  // id:WalletCard
        ibuq.e(view4, "findViewById(...)");
        view4.setVisibility(8);
        View view5 = view0.findViewById(0x7F0B05E1);  // id:NewCardRowPrimary
        ibuq.e(view5, "findViewById(...)");
        view5.setVisibility(8);
        View view6 = view0.findViewById(0x7F0B0234);  // id:ConvertPlasticCardRowPrimary
        ibuq.e(view6, "findViewById(...)");
        view6.setVisibility(8);
        View view7 = view0.findViewById(0x7F0B091E);  // id:TransferOrDownloadCardsRowPrimary
        ibuq.e(view7, "findViewById(...)");
        view7.setVisibility(8);
    }

    static void N(eaeu eaeu0, View view0, int v) {
        eaeu0.Q(view0, v, null);
    }

    static void O(eaeu eaeu0, dzzl dzzl0) {
        eaeu0.J(dzzl0, null);
    }

    static void P(eaeu eaeu0, eadc eadc0, int v) {
        eaeu0.L(eadc0, v, false);
    }

    private final void Q(View view0, int v, fhvp fhvp0) {
        fhvo fhvo0 = this.D().a.a(v);
        if(fhvp0 != null) {
            fhvo0.d(fhvp0);
        }
        this.D().h(view0, fhvo0);
    }

    private final boolean R() {
        return ((Boolean)this.an.a()).booleanValue();
    }

    @Override  // fshb
    public final int kd() {
        return hwle.e() ? 1 : 3;
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        if(v == 0x404) {
            this.at(v1, intent0);
            this.ar();
            return;
        }
        super.onActivityResult(v, v1, intent0);
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        dolg dolg0 = this.ap();
        Preconditions.b(dolg0);
        doly doly0 = dolz.a(this);
        dzpy dzpy0 = new dzpy(this);
        done done0 = new done();
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new dzvh(dzpy0, eefy.a(this.am()), dolg0, done0, doly0, domv0).inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "layoutInflater");
        return layoutInflater0.inflate(0x7F0E082D, viewGroup0, false);  // layout:provision_options_fragment
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        this.al = dzpw.c(this.getArguments());
        View view1 = view0.findViewById(0x7F0B08D8);  // id:Toolbar
        ibuq.e(view1, "findViewById(...)");
        ((Toolbar)view1).t(0x7F151C03);  // string:pay_back "Back"
        ((Toolbar)view1).v(0x7F080AF0);  // drawable:quantum_gm_ic_arrow_back_vd_theme_24
        ((Toolbar)view1).x(new eaek(this));
        RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(0x7F0B016E);  // id:CardList
        this.requireContext();
        recyclerView0.ap(new LinearLayoutManager(1, false));
        recyclerView0.an(this.A());
        eago eago0 = this.am;
        if(eago0 == null) {
            ibuq.j("viewModelFactory");
            eago0 = null;
        }
        eagu eagu0 = this.al;
        if(eagu0 == null) {
            ibuq.j("provisionData");
            eagu0 = null;
        }
        ibuq.f(eago0, "factory");
        ibuq.f(eagu0, "provisionData");
        eagm eagm0 = (eagm)new lso(this, new eagb(eago0, eagu0)).a(eagm.class);
        this.ak = eagm0;
        if(eagm0 == null) {
            ibuq.j("viewModel");
            eagm0 = null;
        }
        lps lps0 = this.getViewLifecycleOwner();
        icbb.b(lpt.a(lps0), null, null, new eaeq(lps0, eagm0.c.a, null, this), 3);
        eagm eagm1 = this.ak;
        if(eagm1 == null) {
            ibuq.j("viewModel");
            eagm1 = null;
        }
        lps lps1 = this.getViewLifecycleOwner();
        icbb.b(lpt.a(lps1), null, null, new eaet(lps1, eagm1.b.c, null, this), 3);
    }

    public final domj y() {
        domj domj0 = this.ai;
        if(domj0 != null) {
            return domj0;
        }
        ibuq.j("loggingSessionIdManager");
        return null;
    }
}

