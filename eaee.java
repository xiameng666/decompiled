import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.secard.view.template.SePrepaidCardLoadingScreenTemplate;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;
import com.google.android.libraries.tapandpay.ui.viewheader.ComposeViewHeader;
import dagger.internal.Preconditions;

public final class eaee extends dokz implements ednc, fshb {
    public ibnf a;
    public fhvw ag;
    public fhxi ah;
    public domj ai;
    public eaca aj;
    public fuok ak;
    public eagu al;
    public acp am;
    private final ibnn an;
    public boolean b;
    public boolean c;
    public fhwk d;

    public eaee() {
        eadz eadz0 = new eadz(this);
        eaeb eaeb0 = new eaeb(new eaea(this));
        ibnn ibnn0 = ibno.a(ibnp.c, eaeb0);
        this.an = new lsd(new ibuk(eaeh.class), new eaec(ibnn0), eadz0, new eaed(ibnn0));
    }

    public final void A(SpannableStringBuilder spannableStringBuilder0) {
        fhvw fhvw1;
        fugv fugv0;
        ggeo ggeo0 = dzdm.h;
        eagu eagu0 = this.al;
        if(eagu0 == null) {
            ibuq.j("provisionData");
            eagu0 = null;
        }
        Object object0 = ggeo0.get((dyna.b(eagu0.c) == null ? dyna.k : dyna.b(eagu0.c)));
        if(object0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String s = this.getString(((dzdm)object0).m);
        ibuq.e(s, "getString(...)");
        String s1 = this.getString((this.b ? 0x7F150907 : 0x7F1508BE));  // string:common_watch_lowercase "watch"
        ibuq.e(s1, "getString(...)");
        View view0 = this.requireView();
        View view1 = view0.findViewById(0x7F0B0540);  // id:LoadingScreen
        ibuq.e(view1, "findViewById(...)");
        view1.setVisibility(8);
        View view2 = view0.findViewById(0x7F0B08F3);  // id:TosScreen
        ibuq.e(view2, "findViewById(...)");
        view2.setVisibility(0);
        ComposeViewHeader composeViewHeader0 = (ComposeViewHeader)view0.findViewById(0x7F0B047D);  // id:HeaderView
        if(this.D()) {
            fugv0 = null;
        }
        else if(hwev.c()) {
            fugv0 = new fugr(new fujl(new fryh(((dzdm)object0).j), null, null, new frxq(hll.h), false, null, false, 0xF6));
        }
        else {
            fugv0 = dzpv.j();
        }
        composeViewHeader0.b(new fuhm(fugv0, new frys(0x7F151BC9, new Object[]{s}), new frys(0x7F151FEC, new Object[]{s1, s})));  // string:pay_add_sp_card_title "Add %1$s"
        if(ibuq.m(view0.getTag(0x7F0B04D8), "true") && hwev.c()) {  // id:IsSideBySide
            View view3 = view0.findViewById(0x7F0B08F4);  // id:TosScreenContent
            ibuq.e(view3, "findViewById(...)");
            View view4 = view0.findViewById(0x7F0B047D);  // id:HeaderView
            ibuq.e(view4, "findViewById(...)");
            dzpv.e(view3, ((ComposeViewHeader)view4));
        }
        if(hwev.c() && hwsd.L() && !this.b) {
            LottieAnimationView lottieAnimationView0 = (LottieAnimationView)view0.findViewById(0x7F0B07AC);  // id:SeCardOnboardAnimation
            eagu eagu1 = this.al;
            if(eagu1 == null) {
                ibuq.j("provisionData");
                eagu1 = null;
            }
            dyna dyna0 = dyna.b(eagu1.c) == null ? dyna.k : dyna.b(eagu1.c);
            ibuq.e(dyna0, "getServiceProvider(...)");
            lottieAnimationView0.l(dzau.m(dyna0));
            lottieAnimationView0.setVisibility(0);
        }
        else {
            ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B07AD);  // id:SeCardOnboardImage
            eagu eagu2 = this.al;
            if(eagu2 == null) {
                ibuq.j("provisionData");
                eagu2 = null;
            }
            dyna dyna1 = dyna.b(eagu2.c) == null ? dyna.k : dyna.b(eagu2.c);
            ibuq.e(dyna1, "getServiceProvider(...)");
            imageView0.setImageResource(dzau.a(dyna1, this.b));
            imageView0.setVisibility(0);
            if(hwev.c()) {
                int v = view0.getContext().getResources().getDimensionPixelSize(0x7F070DED);  // dimen:pay_large_spacing
                ibuq.c(imageView0);
                Integer integer0 = v;
                funy.f(imageView0, integer0, null, integer0, null, 10);
                imageView0.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
        }
        TextView textView0 = (TextView)view0.findViewById(0x7F0B0273);  // id:Description
        if(hwev.c()) {
            textView0.setTextColor(fipx.a(this.requireContext(), 0x7F0402FC));  // attr:colorOnSurfaceVariant
        }
        if(spannableStringBuilder0 == null) {
            ibuq.c(textView0);
            textView0.setVisibility(8);
        }
        else {
            textView0.setText(spannableStringBuilder0);
            ibuq.c(textView0);
            textView0.setVisibility(0);
            textView0.setMovementMethod(LinkMovementMethod.getInstance());
        }
        ComposeActionBar composeActionBar0 = (ComposeActionBar)this.requireView().findViewById(0x7F0B022E);  // id:ContinueActionBar
        ibuq.c(composeActionBar0);
        composeActionBar0.setVisibility(0);
        eagu eagu3 = this.al;
        if(eagu3 == null) {
            ibuq.j("provisionData");
            eagu3 = null;
        }
        dyna dyna2 = dyna.b(eagu3.c) == null ? dyna.k : dyna.b(eagu3.c);
        ibuq.e(dyna2, "getServiceProvider(...)");
        composeActionBar0.d(new ftuw((!dzau.k(dyna2) || dzar.k(this.requireContext()) == 2 ? new ftts(new fryr(0x7F150815), null, false, null, null, null, 0x318F1, null, null, new eadp(this), 446) : new ftts(new fryr(0x7F15219D), null, false, null, new fryh(0x7F080BAF), null, 0x32FBB, null, null, new eado(this), 430)), null, false, ftvd.a, null, ftvb.b, null, false, 0xD6));  // string:common_continue "Continue"
        fhxi fhxi0 = this.ah;
        if(fhxi0 == null) {
            ibuq.j("composeVisualElements");
            fhxi0 = null;
        }
        fhvw fhvw0 = this.ag;
        if(fhvw0 == null) {
            ibuq.j("interactionLogger");
            fhvw1 = null;
        }
        else {
            fhvw1 = fhvw0;
        }
        composeActionBar0.e(new fufz(fhxi0, fhvw1));
    }

    static void B(eaee eaee0) {
        eaee0.A(null);
    }

    private final boolean D() {
        return this.c && this.b && hwev.c();
    }

    @Override  // ednc
    public final boolean F() {
        return true;
    }

    @Override  // fshb
    public final int kd() {
        return hwle.e() ? 1 : 3;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        doly doly0 = dolz.a(this);
        dolg dolg0 = this.ap();
        Preconditions.b(dolg0);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new dzuy(eefy.a(this.getArguments()), new dzpy(this), dolg0, doly0, domv0).inject(this);
        this.am = this.registerForActivityResult(new adt(), new eads(this));
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "layoutInflater");
        View view0 = layoutInflater0.inflate((this.D() ? 0x7F0E082B : 0x7F0E082A), viewGroup0, false);  // layout:provision_onboard_tos_fragment_wear_oobe
        this.al = dzpw.c(this.getArguments());
        ibuq.c(view0);
        eagu eagu0 = this.al;
        domj domj0 = null;
        if(eagu0 == null) {
            ibuq.j("provisionData");
            eagu0 = null;
        }
        dyna dyna0 = dyna.b(eagu0.c) == null ? dyna.k : dyna.b(eagu0.c);
        ibuq.e(dyna0, "getServiceProvider(...)");
        fhwk fhwk0 = this.y();
        fhvo fhvo0 = this.y().a.a(0x318F0);
        domj domj1 = this.ai;
        if(domj1 == null) {
            ibuq.j("loggingSessionIdManager");
        }
        else {
            domj0 = domj1;
        }
        String s = domj0.a();
        ibuq.e(s, "get(...)");
        fhvo0.d(dzaw.g(dyna0, s));
        fhwk0.f(view0, fhvo0);
        return view0;
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        if(this.D()) {
            view0.findViewById(0x7F0B09F2).setOnClickListener(new eadt(this));  // id:WearOobeBackButton
        }
        else {
            Toolbar toolbar0 = (Toolbar)view0.findViewById(0x7F0B08D8);  // id:Toolbar
            toolbar0.t(0x7F151C03);  // string:pay_back "Back"
            toolbar0.x(new eadu(this));
        }
        if(this.D()) {
            SePrepaidCardLoadingScreenTemplate sePrepaidCardLoadingScreenTemplate0 = (SePrepaidCardLoadingScreenTemplate)view0.findViewById(0x7F0B0540);  // id:LoadingScreen
            sePrepaidCardLoadingScreenTemplate0.a();
            sePrepaidCardLoadingScreenTemplate0.e(eaou.b);
        }
        eagu eagu0 = this.al;
        fuok fuok0 = null;
        if(eagu0 == null) {
            ibuq.j("provisionData");
            eagu0 = null;
        }
        dyna dyna0 = dyna.b(eagu0.c) == null ? dyna.k : dyna.b(eagu0.c);
        ibuq.e(dyna0, "getServiceProvider(...)");
        if(dzau.k(dyna0)) {
            eaee.B(this);
        }
        else {
            icmq icmq0 = ((eaeh)this.an.a()).b.a;
            lps lps0 = this.getViewLifecycleOwner();
            icbb.b(lpt.a(lps0), null, null, new eadx(lps0, icmq0, null, this), 3);
        }
        if(this.D()) {
            fuok fuok1 = this.ak;
            if(fuok1 == null) {
                ibuq.j("edgeToEdgeStyler");
            }
            else {
                fuok0 = fuok1;
            }
            fuop.g(fuok0, view0);
        }
    }

    public final fhwk y() {
        fhwk fhwk0 = this.d;
        if(fhwk0 != null) {
            return fhwk0;
        }
        ibuq.j("viewVisualElements");
        return null;
    }
}

