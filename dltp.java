import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.libraries.tapandpay.ui.actionbar.ActionBar;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;
import com.google.android.libraries.tapandpay.ui.viewheader.ViewHeader;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

public final class dltp extends dokz implements ednc {
    public dmgi a;
    public fhvw ag;
    public fuok ah;
    public fhxi ai;
    private AndroidInjector aj;
    public Account b;
    public du c;
    public fhwk d;

    public final fhwk A() {
        fhwk fhwk0 = this.d;
        if(fhwk0 != null) {
            return fhwk0;
        }
        ibuq.j("viewVisualElements");
        return null;
    }

    public final void B() {
        Intent intent0 = dlng.a(this.y().requireContext());
        if(intent0 == null) {
            this.ao().finish();
            return;
        }
        intent0.setFlags(0x10008000);
        if(edno.b(this.y().requireContext(), intent0)) {
            this.ao().startActivity(intent0);
        }
    }

    public final void C() {
        InProductHelp inProductHelp0 = new InProductHelp(new GoogleHelp(ibzk.w("https://support.google.com/wallet?p=pix_fop", "p=", "https://support.google.com/wallet?p=pix_fop")), null, null, 0, null, 0, null);
        inProductHelp0.c = "https://support.google.com/wallet?p=pix_fop";
        new bthl(this.ao()).b(inProductHelp0);
    }

    @Override  // ednc
    public final boolean F() {
        return true;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        if(this.aj == null) {
            doly doly0 = dolz.a(this);
            dolg dolg0 = this.ap();
            Preconditions.b(dolg0);
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            this.aj = new dltk(dolg0, doly0, domv0);
        }
        AndroidInjector androidInjector0 = this.aj;
        if(androidInjector0 == null) {
            throw new IllegalStateException("component was null after injection");
        }
        androidInjector0.inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        View view0 = layoutInflater0.inflate(0x7F0E07AD, viewGroup0, false);  // layout:payment_profile_error_fragment
        this.A().f(view0, this.A().a.a(0x30A8D));
        if(hyxx.c()) {
            ((NestedScrollView)view0.findViewById(0x7F0B022A)).setVisibility(8);  // id:ContentScrollView
            ((NestedScrollView)view0.findViewById(0x7F0B0477)).setVisibility(0);  // id:HeaderScrollView
            View view1 = view0.findViewById(0x7F0B0995);  // id:ViewHeader
            ibuq.e(view1, "findViewById(...)");
            ((ViewHeader)view1).l(0x7F15201E);  // string:pay_payment_profile_error_title "You need a Brazilian payment profile to 
                                                // add your account"
            ((ViewHeader)view1).k(0x7F15201D);  // string:pay_payment_profile_error_description "Instructions on how to create a Brazilian 
                                                // payment profile are available in the next step"
            Context context0 = this.requireContext();
            Drawable drawable0 = context0.getDrawable(0x7F080B69);
            if(drawable0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            drawable0.setTint(fipx.a(context0, 0x7F0402C1));  // attr:colorError
            ((ViewHeader)view1).h(drawable0);
        }
        ActionBar actionBar0 = (ActionBar)view0.findViewById(0x7F0B0019);  // id:ActionBarLegacy
        fuok fuok0 = null;
        if(hyxx.c()) {
            actionBar0.setVisibility(8);
            ComposeActionBar composeActionBar0 = (ComposeActionBar)view0.findViewById(0x7F0B020A);  // id:ComposeActionBar
            composeActionBar0.setVisibility(0);
            ftts ftts0 = new ftts(new fryr(0x7F15220B), null, false, null, null, null, 0x30A8E, null, null, new dltl(this), 446);  // string:pay_show_instructions "Show instructions"
            fryr fryr0 = new fryr(0x7F1508A4);  // string:common_not_now "Not now"
            dltm dltm0 = new dltm(this);
            composeActionBar0.d(new ftuw(ftts0, new ftts(fryr0, null, false, ftvc.a, null, null, 0x2F180, null, null, dltm0, 438), false, null, null, null, null, false, 0xFC));
            fhxi fhxi0 = this.ai;
            if(fhxi0 == null) {
                ibuq.j("composeVisualElements");
                fhxi0 = null;
            }
            composeActionBar0.e(new fufz(fhxi0, this.z()));
        }
        else {
            CharSequence charSequence0 = this.getText(0x7F15220B);  // string:pay_show_instructions "Show instructions"
            ibuq.e(charSequence0, "getText(...)");
            ftrz ftrz0 = new ftrz(charSequence0, new dltn(this));
            CharSequence charSequence1 = this.getText(0x7F1508A4);  // string:common_not_now "Not now"
            ibuq.e(charSequence1, "getText(...)");
            actionBar0.l(ftrz0, new ftrz(charSequence1, new dlto(this)));
            actionBar0.k();
            actionBar0.p();
            actionBar0.o();
            ibuq.c(view0);
            ActionBar actionBar1 = (ActionBar)view0.findViewById(0x7F0B0019);  // id:ActionBarLegacy
            Button button0 = (Button)actionBar1.findViewById(0x7F0B06B2);  // id:PrimaryActionButton
            Button button1 = (Button)actionBar1.findViewById(0x7F0B07C8);  // id:SecondaryActionButton
            this.A().g(button0, this.A().a.a(0x30A8E));
            this.A().g(button1, this.A().a.a(0x2F180));
        }
        fuok fuok1 = this.ah;
        if(fuok1 == null) {
            ibuq.j("edgeToEdgeStyler");
        }
        else {
            fuok0 = fuok1;
        }
        ibuq.c(view0);
        fuop.g(fuok0, view0);
        return view0;
    }

    @Override  // du
    public final void onStart() {
        super.onStart();
        dmgi dmgi0 = this.a;
        if(dmgi0 == null) {
            ibuq.j("clearcutEventLogger");
            dmgi0 = null;
        }
        hafk hafk0 = hafj.a(((ProtoLiteMessage)hapr.a).v_newBuilder());
        hafa hafa0 = haez.a(((ProtoLiteMessage)hana.a).v_newBuilder());
        hafa0.b("PAYMENT_PROFILE_ERROR_PAGE");
        hafk0.f(hafa0.a());
        dmgi0.b(hafk0.a());
    }

    public final du y() {
        du du0 = this.c;
        if(du0 != null) {
            return du0;
        }
        ibuq.j("fragment");
        return null;
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

