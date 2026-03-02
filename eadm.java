import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.secard.view.template.SePrepaidCardLoadingScreenTemplate;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;
import com.google.android.material.button.MaterialButton;
import dagger.internal.Preconditions;
import j..util.Optional;
import java.util.ArrayList;
import java.util.List;

public final class eadm extends dokz implements ednc, fshb {
    public eapz a;
    public fhxi ag;
    public eaca ah;
    public fuok ai;
    public boolean aj;
    public boolean ak;
    public eapy al;
    public eagu am;
    public List an;
    public static final int ao;
    public fhwk b;
    public fhvw c;
    public domj d;

    static {
        bboh.b("ProvisionNotifyUploadingCardsFragment", bbcu.cZ);
    }

    public final String A() {
        List list0 = this.an;
        if(list0 == null) {
            ibuq.j("cardsToBeDownloaded");
            list0 = null;
        }
        hkjk hkjk0 = ((hkjm)ibpo.R(list0)).f;
        if(hkjk0 == null) {
            hkjk0 = hkjk.a;
        }
        String s = hkjk0.b;
        ibuq.e(s, "getDeviceName(...)");
        return s;
    }

    public final void B(View view0) {
        ComposeActionBar composeActionBar0 = (ComposeActionBar)view0.findViewById(0x7F0B022E);  // id:ContinueActionBar
        ftuw ftuw0 = composeActionBar0.b();
        ftts ftts0 = composeActionBar0.b().a;
        composeActionBar0.d(ftuw.a(ftuw0, (ftts0 == null ? null : ftts.b(ftts0, null, false, new eadf(this), 0x1FF)), null, false, null, null, false, 0xFE));
    }

    public final void D(View view0) {
        ((MaterialButton)view0.findViewById(0x7F0B091D)).setOnClickListener(new eadd(this));  // id:TransferHelper
    }

    public final void E() {
        View view0 = this.requireView();
        View view1 = view0.findViewById(0x7F0B0540);  // id:LoadingScreen
        ibuq.e(view1, "findViewById(...)");
        view1.setVisibility(8);
        View view2 = view0.findViewById(0x7F0B0609);  // id:NotifyUploadingScreen
        ibuq.e(view2, "findViewById(...)");
        view2.setVisibility(0);
        View view3 = view0.findViewById(0x7F0B08B9);  // id:TimeoutMessageScreen
        ibuq.e(view3, "findViewById(...)");
        view3.setVisibility(8);
    }

    @Override  // ednc
    public final boolean F() {
        return true;
    }

    public final boolean G() {
        return this.ak && this.aj && hwev.c();
    }

    public final boolean H() {
        List list0 = this.an;
        if(list0 == null) {
            ibuq.j("cardsToBeDownloaded");
            list0 = null;
        }
        hkjk hkjk0 = ((hkjm)ibpo.R(list0)).f;
        if(hkjk0 == null) {
            hkjk0 = hkjk.a;
        }
        return hkjl.a(hkjk0.c) == 3;
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
        dmgr dmgr0 = new dmgr("com.google.android.gms");
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        done done0 = new done();
        doly doly0 = dolz.a(this);
        new dzuu(dmgr0, new dzpy(this), eefy.a(this.getArguments()), dolg0, done0, domv0, doly0).inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "layoutInflater");
        View view0 = layoutInflater0.inflate((this.G() ? 0x7F0E0829 : 0x7F0E0828), viewGroup0, false);  // layout:provision_notify_uploading_cards_fragment_wear_oobe
        eagu eagu0 = dzpw.c(this.getArguments());
        this.am = eagu0;
        if(eagu0 == null) {
            ibuq.j("provisionData");
            eagu0 = null;
        }
        this.an = eagu0.e;
        ibuq.c(view0);
        domj domj0 = this.d;
        if(domj0 == null) {
            ibuq.j("loggingSessionIdManager");
            domj0 = null;
        }
        String s = domj0.a();
        ibuq.e(s, "get(...)");
        List list0 = this.an;
        if(list0 == null) {
            ibuq.j("cardsToBeDownloaded");
            list0 = null;
        }
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            eagu eagu1 = this.am;
            if(eagu1 == null) {
                ibuq.j("provisionData");
                eagu1 = null;
            }
            eagt eagt0 = eagt.b(eagu1.d) == null ? eagt.k : eagt.b(eagu1.d);
            ibuq.e(eagt0, "getPurpose(...)");
            arrayList0.add(dzau.g(((hkjm)object0), eagt0));
        }
        fhvp fhvp0 = dzaw.b(s, arrayList0);
        fhwk fhwk0 = this.y();
        fhvo fhvo0 = this.y().a.a(203414);
        fhvo0.d(fhvp0);
        fhwk0.f(view0, fhvo0);
        this.y().f(view0.findViewById(0x7F0B08B9), this.y().a.a(204124));  // id:TimeoutMessageScreen
        return view0;
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        if(this.G()) {
            view0.findViewById(0x7F0B09F2).setOnClickListener(new eadh(this));  // id:WearOobeBackButton
        }
        else {
            Toolbar toolbar0 = (Toolbar)view0.findViewById(0x7F0B08D8);  // id:Toolbar
            toolbar0.t(0x7F151C03);  // string:pay_back "Back"
            toolbar0.v(0x7F080AF0);  // drawable:quantum_gm_ic_arrow_back_vd_theme_24
            toolbar0.x(new eadi(this));
        }
        ComposeActionBar composeActionBar0 = (ComposeActionBar)view0.findViewById(0x7F0B022E);  // id:ContinueActionBar
        composeActionBar0.d(ftuw.a(composeActionBar0.b(), new ftts(new fryr(0x7F15089B), null, false, null, null, null, 203415, null, null, new eade(), 446), null, false, ftvd.a, null, false, 0xF6));  // string:common_next "Next"
        fhxi fhxi0 = this.ag;
        if(fhxi0 == null) {
            ibuq.j("composeVisualElements");
            fhxi0 = null;
        }
        fhvw fhvw0 = this.c;
        if(fhvw0 == null) {
            ibuq.j("interactionLogger");
            fhvw0 = null;
        }
        composeActionBar0.e(new fufz(fhxi0, fhvw0));
        List list0 = this.an;
        if(list0 == null) {
            ibuq.j("cardsToBeDownloaded");
            list0 = null;
        }
        if(list0.isEmpty()) {
            throw new IllegalStateException(gfuk.a("No cards to be transferred in NotifyUploadingFragment", new Object[0]));
        }
        if(this.G()) {
            fuok fuok0 = this.ai;
            if(fuok0 == null) {
                ibuq.j("edgeToEdgeStyler");
                fuok0 = null;
            }
            fuop.g(fuok0, view0);
            SePrepaidCardLoadingScreenTemplate sePrepaidCardLoadingScreenTemplate0 = (SePrepaidCardLoadingScreenTemplate)view0.findViewById(0x7F0B0540);  // id:LoadingScreen
            sePrepaidCardLoadingScreenTemplate0.a();
            sePrepaidCardLoadingScreenTemplate0.e(eaou.b);
        }
        else if(hwev.c()) {
            SePrepaidCardLoadingScreenTemplate sePrepaidCardLoadingScreenTemplate1 = (SePrepaidCardLoadingScreenTemplate)view0.findViewById(0x7F0B0540);  // id:LoadingScreen
            eagu eagu0 = this.am;
            if(eagu0 == null) {
                ibuq.j("provisionData");
                eagu0 = null;
            }
            dyna dyna0 = dyna.b(eagu0.c) == null ? dyna.k : dyna.b(eagu0.c);
            ibuq.e(dyna0, "getServiceProvider(...)");
            sePrepaidCardLoadingScreenTemplate1.c(dyna0);
        }
        Optional optional0 = dzau.j(this.getArguments());
        eapz eapz0 = this.a;
        if(eapz0 == null) {
            ibuq.j("viewModelFactory");
            eapz0 = null;
        }
        List list1 = this.an;
        if(list1 == null) {
            ibuq.j("cardsToBeDownloaded");
            list1 = null;
        }
        eagu eagu1 = this.am;
        if(eagu1 == null) {
            ibuq.j("provisionData");
            eagu1 = null;
        }
        eapy eapy0 = (eapy)new lso(this, eapv.a(eapz0, list1, eagu1, optional0, 16)).a(eapy.class);
        this.al = eapy0;
        if(eapy0 == null) {
            ibuq.j("viewModel");
            eapy0 = null;
        }
        lps lps0 = this.getViewLifecycleOwner();
        icbb.b(lpt.a(lps0), null, null, new eadl(lps0, eapy0.b(), null, this), 3);
    }

    public final fhwk y() {
        fhwk fhwk0 = this.b;
        if(fhwk0 != null) {
            return fhwk0;
        }
        ibuq.j("viewVisualElements");
        return null;
    }
}

