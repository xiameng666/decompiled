import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.auth.managed.ui.EmmChimeraActivity;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.SetupWizardLayout;
import com.google.android.setupdesign.view.NavigationBar;

public final class akql extends du implements gajv {
    public akqo a;

    @Override  // gajv
    public final void gB() {
    }

    // Detected as a lambda impl.
    @Override  // gajv
    public final void ku() {
        Context context0 = this.getContext();
        if((context0 instanceof EmmChimeraActivity)) {
            ((EmmChimeraActivity)context0).l(0, null);
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        bagy bagy0 = bagy.f(this.getContext(), (bagv.i(this.getArguments().getString("theme")) ? 0x7F0E0ECC : 0x7F0E0ECB));  // layout:work_profile_will_fail_glif
        bagv.e(bagy0.a());
        if(gaec.B(this.getContext())) {
            gaja.a(((TextView)bagy0.a().findViewById(0x7F0B0C08)));  // id:auth_managed_work_profile_will_fail_description
        }
        bagy0.b(true);
        gaga.f(((xnz)this.getContext()).getWindow(), true);
        bagy0.d(true);
        bagy0.c(this.getText(0x7F153682));  // string:work_profile_will_fail_title "Can\'t add account"
        if((bagy0.a() instanceof SetupWizardLayout)) {
            NavigationBar navigationBar0 = ((SetupWizardLayout)bagy0.a()).p();
            navigationBar0.a(this);
            navigationBar0.b.setCompoundDrawables(null, null, null, null);
            return bagy0.a();
        }
        GlifLayout glifLayout0 = (GlifLayout)bagy0.a().findViewById(0x7F0B2009);  // id:setup_wizard_layout
        if(gaec.B(this.getContext())) {
            gaji.b(glifLayout0.findViewById(0x7F0B11FF));  // id:emm_activity_body
        }
        gaff gaff0 = (gaff)glifLayout0.t(gaff.class);
        gafg gafg0 = new gafg(this.getContext());
        gafg0.b(0x7F1508A8);  // string:common_ok "OK"
        gafg0.b = (/* MISSING LAMBDA PARAMETER */) -> {
            Context context0 = this.getContext();
            if((context0 instanceof EmmChimeraActivity)) {
                ((EmmChimeraActivity)context0).l(0, null);
            }
        };
        gafg0.c = 5;
        gafg0.d = 0x7F1608FE;  // style:SudGlifButton.Primary
        gaff0.c(gafg0.a());
        return bagy0.a();
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        akqo akqo0 = (akqo)new lso(((xnz)this.requireContext()), new akqn(((xnz)this.requireContext()).getApplication())).a(akqo.class);
        this.a = akqo0;
        Account account0 = (Account)this.getArguments().getParcelable("account");
        akqo0.a.l(account0);
        this.a.a.g(this, new akqi(this, view0));
        this.a.b.g(this, new akqj(view0));
    }
}

