import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;
import com.google.android.libraries.tapandpay.ui.viewheader.ComposeViewHeader;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;
import j..util.Optional;

public final class dmel extends dokz implements fshb {
    AndroidInjector a;
    edrk ag;
    public fuho ah;
    public Optional ai;
    public Optional aj;
    public Optional ak;
    String al;
    int am;
    private boolean an;
    private dxev ao;
    private View ap;
    private Toolbar aq;
    fhwk b;
    tyb c;
    dmdt d;

    static {
        bboh.b("Pay", bbcu.cZ);
    }

    public dmel() {
        this.ai = Optional.empty();
        this.aj = Optional.empty();
        this.ak = Optional.empty();
        this.al = "";
        this.am = 1;
    }

    private final void A(boolean z, int v) {
        ((ComposeActionBar)this.aj.get()).setBackgroundColor(v);
        ComposeActionBar composeActionBar0 = (ComposeActionBar)this.aj.get();
        ftuy ftuy0 = new ftuy(((ComposeActionBar)this.aj.get()).b());
        ftuy0.g(z);
        composeActionBar0.d(ftuy0.a());
    }

    private final void B() {
        fuhm fuhm0;
        if(this.ao != null) {
            int v = this.am - 1;
            if(this.am == 0) {
                throw null;
            }
            switch(v) {
                case 0: {
                    fryh fryh1 = new fryh(0x7F080A1B);  // drawable:pay_wallet_gpay_logo
                    frxp frxp1 = new frxp(0);
                    fugt fugt1 = new fugt(fryh1, null, null, fugw.b, frxp1);
                    fryu fryu1 = new fryu(this.al);
                    Resources resources1 = this.getResources();
                    dxev dxev1 = this.ao;
                    batl.s(dxev1);
                    fuhm0 = new fuhm(fugt1, fryu1, new fryt(ftrm.c(resources1.getString(0x7F151CBD, new Object[]{(dxev1.c == null ? hkhr.b : dxev1.c).i, hwnj.c()}), true)));  // string:pay_contextual_tokenization_prompt_body "If you verify your %1$s, you\'ll 
                                                                                                                                                                               // be able to use this device to make secure purchases online and in stores with tap 
                                                                                                                                                                               // to pay. <a href=%2$s>Learn more about tap to pay</a>"
                    break;
                }
                case 1: {
                    fryh fryh2 = new fryh(0x7F080A1B);  // drawable:pay_wallet_gpay_logo
                    frxp frxp2 = new frxp(0);
                    fugt fugt2 = new fugt(fryh2, null, null, fugw.b, frxp2);
                    fryu fryu2 = new fryu(this.al);
                    Resources resources2 = this.getResources();
                    dxev dxev2 = this.ao;
                    batl.s(dxev2);
                    fuhm0 = new fuhm(fugt2, fryu2, new fryt(ftrm.c(resources2.getString(0x7F151CBF, new Object[]{(dxev2.c == null ? hkhr.b : dxev2.c).i, hwnj.j()}), true)));  // string:pay_contextual_tokenization_prompt_body_non_nfc_qr "If you verify your %1$s, 
                                                                                                                                                                               // you\'ll be able to use this device to make secure purchases online and in stores 
                                                                                                                                                                               // using a QR code. <a href=%2$s>Learn how to pay with QR codes</a>"
                    break;
                }
                default: {
                    if(v != 2) {
                        throw new RuntimeException(null, null);
                    }
                    fryh fryh0 = new fryh(0x7F080A1B);  // drawable:pay_wallet_gpay_logo
                    frxp frxp0 = new frxp(0);
                    fugt fugt0 = new fugt(fryh0, null, null, fugw.b, frxp0);
                    fryu fryu0 = new fryu(this.al);
                    Resources resources0 = this.getResources();
                    dxev dxev0 = this.ao;
                    batl.s(dxev0);
                    fuhm0 = new fuhm(fugt0, fryu0, new fryu(resources0.getString(0x7F151CBE, new Object[]{(dxev0.c == null ? hkhr.b : dxev0.c).i})));  // string:pay_contextual_tokenization_prompt_body_non_nfc "If you verify your %1$s, 
                                                                                                                                                       // you\'ll be able to use this device to make secure purchases online"
                    break;
                }
            }
            this.ah = fuhm0;
            if(this.ai.isPresent()) {
                ((ComposeViewHeader)this.ai.get()).b(this.ah);
                ((ComposeViewHeader)this.ai.get()).setVisibility(0);
            }
        }
    }

    @Override  // fshb
    public final int kd() {
        return hwle.a.b().g() ? 1 : 3;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        if(this.a == null) {
            doly doly0 = dolz.a(this);
            dolg dolg0 = this.ap();
            Preconditions.b(dolg0);
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            this.a = new dmed(dolg0, doly0, domv0, new edop());
        }
        this.a.inject(this);
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.am();
        if(bundle1.containsKey("IS_NFC_DEVICE")) {
            this.an = bundle1.getBoolean("IS_NFC_DEVICE", false);
        }
        try {
            if(bundle1.containsKey("PAYMENT_METHOD_DATA")) {
                byte[] arr_b = bundle1.getByteArray("PAYMENT_METHOD_DATA");
                batl.s(arr_b);
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dxev.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                this.ao = (dxev)hftv0;
            }
        }
        catch(hfur unused_ex) {
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate((hwev.c() ? 0x7F0E074E : 0x7F0E074F), viewGroup0, false);  // layout:pay_tokenization_prompt_fragment_exp
        this.ap = view0;
        this.aq = (Toolbar)view0.findViewById(0x7F0B08D8);  // id:Toolbar
        xni xni0 = (xni)this.requireContext();
        xni0.hG(this.aq);
        im im0 = xni0.hL();
        batl.s(im0);
        im0.o(true);
        im0.s(false);
        im0.w(0x7F080B26);  // drawable:quantum_gm_ic_close_vd_theme_24
        ImageView imageView0 = (ImageView)this.ap.findViewById(0x7F0B065E);  // id:PayLogo
        if(hwev.c()) {
            this.ai = Optional.ofNullable(((ComposeViewHeader)this.ap.findViewById(0x7F0B08CF)));  // id:TokenizationPromptViewHeader
            this.aj = Optional.ofNullable(((ComposeActionBar)this.ap.findViewById(0x7F0B020A)));  // id:ComposeActionBar
            this.ak = Optional.ofNullable(((ScrollView)this.ap.findViewById(0x7F0B07A9)));  // id:ScrollView
            Optional.ofNullable(((ConstraintLayout)this.ap.findViewById(0x7F0B0016)));  // id:ActionBarContainer
            this.ak.ifPresent(new dmeg(this));
            if(this.ai.isPresent()) {
                ((ComposeViewHeader)this.ai.get()).setVisibility(8);
            }
            this.B();
        }
        else if(fsce.a(this.getContext())) {
            imageView0.setImageResource(0x7F0809D5);
        }
        else {
            imageView0.setImageResource(0x7F0809D7);
        }
        String s = fsce.a(this.getContext()) ? hwfz.a.b().b() : hwfz.a.b().a();
        if(this.ao != null) {
            if(hwnj.p() && this.an) {
                this.al = "Verify your card in a few simple steps";
                this.am = 1;
                s = fsce.a(this.getContext()) ? hwnj.e() : hwnj.d();
            }
            else if(hwnj.q() && !this.an && this.ag.a) {
                this.al = "Verify your card in a few simple steps";
                this.am = 2;
                s = fsce.a(this.getContext()) ? hwnj.i() : hwnj.h();
            }
            else if(hwnj.q() && !this.an) {
                this.al = "Verify your card in a few simple steps";
                this.am = 3;
                s = fsce.a(this.getContext()) ? hwnj.g() : hwnj.f();
            }
            if(hwev.c()) {
                this.B();
            }
            else {
                TextView textView0 = (TextView)this.ap.findViewById(0x7F0B08CE);  // id:TokenizationPromptTitle
                TextView textView1 = (TextView)this.ap.findViewById(0x7F0B08CB);  // id:TokenizationPromptBody
                textView0.setText(this.al);
                int v = this.am - 1;
                if(this.am == 0) {
                    throw null;
                }
                switch(v) {
                    case 0: {
                        Resources resources0 = this.getResources();
                        dxev dxev0 = this.ao;
                        batl.s(dxev0);
                        funx.d(textView1, ftrm.c(resources0.getString(0x7F151CBD, new Object[]{(dxev0.c == null ? hkhr.b : dxev0.c).i, hwnj.c()}), true));  // string:pay_contextual_tokenization_prompt_body "If you verify your %1$s, you\'ll 
                                                                                                                                                            // be able to use this device to make secure purchases online and in stores with tap 
                                                                                                                                                            // to pay. <a href=%2$s>Learn more about tap to pay</a>"
                        break;
                    }
                    case 1: {
                        Resources resources1 = this.getResources();
                        dxev dxev1 = this.ao;
                        batl.s(dxev1);
                        funx.d(textView1, ftrm.c(resources1.getString(0x7F151CBF, new Object[]{(dxev1.c == null ? hkhr.b : dxev1.c).i, hwnj.j()}), true));  // string:pay_contextual_tokenization_prompt_body_non_nfc_qr "If you verify your %1$s, 
                                                                                                                                                            // you\'ll be able to use this device to make secure purchases online and in stores 
                                                                                                                                                            // using a QR code. <a href=%2$s>Learn how to pay with QR codes</a>"
                        break;
                    }
                    case 2: {
                        Resources resources2 = this.getResources();
                        dxev dxev2 = this.ao;
                        batl.s(dxev2);
                        textView1.setText(resources2.getString(0x7F151CBE, new Object[]{(dxev2.c == null ? hkhr.b : dxev2.c).i}));  // string:pay_contextual_tokenization_prompt_body_non_nfc "If you verify your %1$s, 
                                                                                                                                    // you\'ll be able to use this device to make secure purchases online"
                        break;
                    }
                }
            }
        }
        this.c.h(s).k(((ImageView)this.ap.findViewById(0x7F0B0480)));  // id:HeroImage
        dmeh dmeh0 = new dmeh(this);
        dmei dmei0 = new dmei(this);
        if(hwev.c()) {
            ftts ftts0 = ftts.a(new fryu("Continue"), new dmee(this, dmeh0)).a();
            ftux ftux0 = ftts.a(new fryu("Not now"), new dmef(this, dmei0));
            ftux0.c(ftvc.a);
            ftux0.b(ftva.a);
            ftts ftts1 = ftux0.a();
            ComposeActionBar composeActionBar0 = (ComposeActionBar)this.aj.get();
            ftuy ftuy0 = new ftuy(((ComposeActionBar)this.aj.get()).b());
            ftuy0.h(ftts0);
            ftuy0.i(ftts1);
            ftuy0.f(ftvd.b);
            ftuy0.d(new frxp(0));
            ftuy0.e(ftvb.d);
            composeActionBar0.d(ftuy0.a());
        }
        else {
            ((Button)this.ap.findViewById(0x7F0B08CC)).setOnClickListener(dmeh0);  // id:TokenizationPromptContinueButton
            ((Button)this.ap.findViewById(0x7F0B08CD)).setOnClickListener(dmei0);  // id:TokenizationPromptNotNowButton
        }
        this.b.f(this.ap, this.b.a.a(0x1CDC6));
        return this.ap;
    }

    @Override  // du
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(menuItem0.getItemId() == 0x102002C) {
            this.d.a("CardAddedFlowTokenizationPromptClosed", "CARD_ADDED_PROMPT_PAGE");
            this.at(101, null);
            this.ar();
            return true;
        }
        return false;
    }

    @Override  // du
    public final void onStart() {
        super.onStart();
        dnqd.c(this.requireContext(), "Pay_CardAddedFlowTokenizationPrompt");
        this.d.d("CARD_ADDED_PROMPT_PAGE");
    }

    public final void y() {
        if(this.ak.isPresent()) {
            ScrollView scrollView0 = (ScrollView)this.ak.get();
            int v = fipx.a(this.requireContext(), 0x7F04033A);  // attr:colorSurfaceContainerHigh
            if(scrollView0.canScrollVertically(-1)) {
                this.aq.setBackgroundColor(v);
            }
            else {
                this.aq.setBackgroundColor(0);
            }
            if(scrollView0.canScrollVertically(1)) {
                this.A(true, v);
                return;
            }
            this.A(false, 0);
        }
    }
}

