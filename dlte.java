import android.accounts.Account;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.libraries.tapandpay.ui.actionbar.ActionBar;
import com.google.android.libraries.tapandpay.ui.rowsecondary.icon.RowSecondaryIcon;
import com.google.android.libraries.tapandpay.ui.viewheader.ViewHeader;
import com.google.android.material.appbar.MaterialToolbar;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

public final class dlte extends dokz implements ednc {
    public Account a;
    public fhvw ag;
    public fuok ah;
    public fhxi ai;
    public ActionBar aj;
    private AndroidInjector ak;
    private final ibnn al;
    private NestedScrollView am;
    public dmgi b;
    public ibnf c;
    public fhwk d;

    public dlte() {
        dlsz dlsz0 = new dlsz(this);
        dltb dltb0 = new dltb(new dlta(this));
        ibnn ibnn0 = ibno.a(ibnp.c, dltb0);
        this.al = new lsd(new ibuk(dlti.class), new dltc(ibnn0), dlsz0, new dltd(ibnn0));
    }

    public final fhwk A() {
        fhwk fhwk0 = this.d;
        if(fhwk0 != null) {
            return fhwk0;
        }
        ibuq.j("viewVisualElements");
        return null;
    }

    public final void B(goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(0x24294FC4);
        if((((v & 6) == 0 ? (goz1.Z(this) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            gep gep0 = fiuq.c(fiqk.c(goz1), goz1);
            doz doz0 = dpc.a(0, goz1, 3);
            goz2 = goz1;
            fits.a(dls.v(hfc.e), gzf.e(0x5224A088, new dlsl(gep0, this), goz1), gzf.e(0x2843DD89, new dlsn(this, doz0), goz1), null, null, 0, 0L, 0L, null, gzf.e(0x17358453, new dlsq(gep0, doz0, this), goz1), goz2, 0x300001B6, 504);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new dlsf(this, v);
        }
    }

    @Override  // ednc
    public final boolean F() {
        return true;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        if(this.ak == null) {
            dolg dolg0 = this.ap();
            Preconditions.b(dolg0);
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            this.ak = new dlsb(dolg0, domv0);
        }
        AndroidInjector androidInjector0 = this.ak;
        if(androidInjector0 == null) {
            throw new IllegalStateException("component was null after injection");
        }
        androidInjector0.inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        if(hwev.c()) {
            View view0 = new ComposeView(this.requireContext(), null, 0, 6, null);
            if(viewGroup0 == null) {
                throw new IllegalStateException("root container is not available");
            }
            ((ComposeView)view0).a(new gze(0xB2ADE13E, true, new dlsu(this)));
            return view0;
        }
        View view1 = layoutInflater0.inflate(0x7F0E07CF, viewGroup0, false);  // layout:pix_education_fragment
        View view2 = view1.findViewById(0x7F0B08D8);  // id:Toolbar
        ibuq.e(view2, "findViewById(...)");
        this.am = (NestedScrollView)view1.findViewById(0x7F0B022A);  // id:ContentScrollView
        ActionBar actionBar0 = (ActionBar)view1.findViewById(0x7F0B0012);  // id:ActionBar
        this.aj = actionBar0;
        NestedScrollView nestedScrollView0 = null;
        if(actionBar0 == null) {
            ibuq.j("actionBar");
            actionBar0 = null;
        }
        Button button0 = (Button)actionBar0.findViewById(0x7F0B06B2);  // id:PrimaryActionButton
        RowSecondaryIcon rowSecondaryIcon0 = (RowSecondaryIcon)view1.findViewById(0x7F0B073A);  // id:RowSecondary1
        RowSecondaryIcon rowSecondaryIcon1 = (RowSecondaryIcon)view1.findViewById(0x7F0B073B);  // id:RowSecondary2
        RowSecondaryIcon rowSecondaryIcon2 = (RowSecondaryIcon)view1.findViewById(0x7F0B073C);  // id:RowSecondary3
        ((MaterialToolbar)view2).t(0x7F151C03);  // string:pay_back "Back"
        ((MaterialToolbar)view2).x(new dlsd(this));
        this.A().f(view1, this.A().a.a(0x2EC80));
        this.A().g(button0, this.A().a.a(0x2EC6A));
        int v = this.getResources().getDimensionPixelSize(0x7F070DED);  // dimen:pay_large_spacing
        fuok fuok0 = this.ah;
        if(fuok0 == null) {
            ibuq.j("edgeToEdgeStyler");
            fuok0 = null;
        }
        ActionBar actionBar1 = this.aj;
        if(actionBar1 == null) {
            ibuq.j("actionBar");
            actionBar1 = null;
        }
        fuop.c(fuok0, actionBar1, v);
        View view3 = view1.findViewById(0x7F0B00BA);  // id:BankRegulation
        ibuq.e(view3, "findViewById(...)");
        String s = this.getString(0x7F152044, new Object[]{"https://payments.google.com/payments/apis-secure/u/0/get_legal_document?ldo=0&ldt=buyertos&ldr=br", "https://payments.google.com/payments/apis-secure/u/0/get_legal_document?ldo=0&ldt=privacynotice&ldl=pt-BR"});  // string:pay_pix_education_bank_regulations "The <a href=%1$s>Google Payments Terms 
                                                                                                                                                                                                                                                                                // of Service</a> applies to your use of the service and the <a href=%2$s>Google Payments 
                                                                                                                                                                                                                                                                                // Privacy Notice</a> describes how your data is handled."
        ibuq.e(s, "getString(...)");
        funx.b(((TextView)view3), ftrm.f(s, true));
        if(!hwfk.a.b().cn()) {
            ((ViewHeader)view1.findViewById(0x7F0B047D)).setVisibility(8);  // id:HeaderView
            ((TextView)view1.findViewById(0x7F0B0689)).setVisibility(0);  // id:PixEducationTitle
            ((TextView)view1.findViewById(0x7F0B0273)).setVisibility(0);  // id:Description
        }
        ((LottieAnimationView)view1.findViewById(0x7F0B0556)).l(0x7F140232);  // id:LottieAnimationView
        ActionBar actionBar2 = this.aj;
        if(actionBar2 == null) {
            ibuq.j("actionBar");
            actionBar2 = null;
        }
        CharSequence charSequence0 = this.getText(0x7F151E3E);  // string:pay_fops_verify_now "Verify now"
        ibuq.e(charSequence0, "getText(...)");
        actionBar2.m(new ftrz(charSequence0, new dlse(this)));
        actionBar2.n(null);
        ColorStateList colorStateList0 = ColorStateList.valueOf(fipx.a(this.requireContext(), 0x7F04030C));  // attr:colorPrimary
        ibuq.e(colorStateList0, "valueOf(...)");
        rowSecondaryIcon0.g(new fumq(new fumm(new fryr(0x7F152041), null, null, 62), new fryh(0x7F080531), colorStateList0, null, null, 56));  // string:pay_pix_education_add_step_1 "Verify your identity"
        rowSecondaryIcon1.g(new fumq(new fumm(new fryr(0x7F152042), null, null, 62), new fryh(0x7F080532), colorStateList0, null, null, 56));  // string:pay_pix_education_add_step_2 "Redirect to financial institution"
        rowSecondaryIcon2.g(new fumq(new fumm(new fryr(0x7F152043), null, null, 62), new fryh(0x7F080533), colorStateList0, null, null, 56));  // string:pay_pix_education_add_step_3 "Sign into your financial account"
        dlsg dlsg0 = new dlsg(this);
        NestedScrollView nestedScrollView1 = this.am;
        if(nestedScrollView1 == null) {
            ibuq.j("mainContent");
            nestedScrollView1 = null;
        }
        nestedScrollView1.e = new dlsh(dlsg0);
        NestedScrollView nestedScrollView2 = this.am;
        if(nestedScrollView2 == null) {
            ibuq.j("mainContent");
        }
        else {
            nestedScrollView0 = nestedScrollView2;
        }
        nestedScrollView0.addOnLayoutChangeListener(new dlsi(dlsg0));
        return view1;
    }

    @Override  // du
    public final void onStart() {
        super.onStart();
        dmgi dmgi0 = this.b;
        if(dmgi0 == null) {
            ibuq.j("clearcutEventLogger");
            dmgi0 = null;
        }
        hafk hafk0 = hafj.a(((ProtoLiteMessage)hapr.a).v_newBuilder());
        hafa hafa0 = haez.a(((ProtoLiteMessage)hana.a).v_newBuilder());
        hafa0.b("PIX_EDUCATION_PAGE");
        hafk0.f(hafa0.a());
        dmgi0.b(hafk0.a());
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        icmq icmq0 = this.y().b.c;
        lps lps0 = this.getViewLifecycleOwner();
        icbb.b(lpt.a(lps0), null, null, new dlsx(lps0, icmq0, null, this), 3);
    }

    public final dlti y() {
        return (dlti)this.al.a();
    }

    public final fhvw z() {
        fhvw fhvw0 = this.ag;
        if(fhvw0 != null) {
            return fhvw0;
        }
        ibuq.j("interactionLogger");
        return null;
    }
}

