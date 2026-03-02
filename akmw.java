import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.auth.managed.ui.EmmChimeraActivity;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.SetupWizardLayout;
import com.google.android.setupdesign.view.NavigationBar;

public final class akmw extends du implements gajv, luo {
    private gaff a;

    @Override  // luo
    public final lvb a(int v, Bundle bundle0) {
        return new akne(this.getContext(), this.getArguments().getString("package_icon_url"));
    }

    @Override  // luo
    public final void b(lvb lvb0, Object object0) {
        ImageView imageView0 = (ImageView)((xnz)this.getContext()).findViewById(0x7F0B0C02);  // id:auth_device_management_download_app_icon
        if(imageView0 != null) {
            imageView0.setImageBitmap(((Bitmap)object0));
        }
    }

    @Override  // luo
    public final void c(lvb lvb0) {
    }

    // Detected as a lambda impl.
    @Override  // gajv
    public final void gB() {
        EmmChimeraActivity emmChimeraActivity0 = (EmmChimeraActivity)this.getContext();
        if(emmChimeraActivity0 != null) {
            emmChimeraActivity0.u();
        }
    }

    // Detected as a lambda impl.
    @Override  // gajv
    public final void ku() {
        EmmChimeraActivity emmChimeraActivity0 = (EmmChimeraActivity)this.getContext();
        if(emmChimeraActivity0 != null) {
            emmChimeraActivity0.q();
        }
    }

    @Override  // du
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        lup.a(this).c(0, null, this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        String s;
        int v = 0x7F0E0114;  // layout:auth_device_management_download_glif_v2
        Context context0 = this.getContext();
        if(!bagv.i(this.getArguments().getString("theme"))) {
            v = 0x7F0E0111;  // layout:auth_device_management_download
        }
        else if(jys.d() && gaec.t(this.getContext())) {
            v = 0x7F0E0113;  // layout:auth_device_management_download_glif_expressive
        }
        bagy bagy0 = bagy.f(context0, v);
        bagv.e(bagy0.a());
        bagy0.b(true);
        gaga.f(((xnz)this.getContext()).getWindow(), true);
        bagy0.d(true);
        ((xnz)this.getContext()).setTitle(this.getArguments().getString("account_name"));
        bagy0.c(((xnz)this.getContext()).getTitle());
        if((bagy0.a() instanceof SetupWizardLayout)) {
            NavigationBar navigationBar0 = ((SetupWizardLayout)bagy0.a()).p();
            navigationBar0.a(this);
            navigationBar0.b.setCompoundDrawables(null, null, null, null);
            ((TextView)bagy0.a().findViewById(0x7F0B0C04)).setText(this.z());  // id:auth_device_management_download_description
        }
        else {
            GlifLayout glifLayout0 = (GlifLayout)bagy0.a().findViewById(0x7F0B2009);  // id:setup_wizard_layout
            if(gaec.B(this.getContext()) && (!jys.d() || !gaec.t(this.getContext()))) {
                gaji.b(glifLayout0.findViewById(0x7F0B11FF));  // id:emm_activity_body
            }
            this.a = (gaff)glifLayout0.t(gaff.class);
            int v1 = this.getArguments().getInt("package_install_state");
            if(v1 == 1) {
                s = this.getString(0x7F150874);  // string:common_install "Install"
            }
            else {
                s = v1 == 2 ? this.getString(0x7F1508FE) : this.getString(0x7F15089B);  // string:common_update "Update"
            }
            gafg gafg0 = new gafg(this.getContext());
            gafg0.b = (/* MISSING LAMBDA PARAMETER */) -> {
                EmmChimeraActivity emmChimeraActivity0 = (EmmChimeraActivity)this.getContext();
                if(emmChimeraActivity0 != null) {
                    emmChimeraActivity0.q();
                }
            };
            gafg0.c = 5;
            gafg0.d = 0x7F1608FE;  // style:SudGlifButton.Primary
            gafh gafh0 = gafg0.a();
            this.a.c(gafh0);
            gafh0.d(s);
            gafg gafg1 = new gafg(this.getContext());
            gafg1.b(0x7F1508E0);  // string:common_skip "Skip"
            gafg1.b = (/* MISSING LAMBDA PARAMETER */) -> {
                EmmChimeraActivity emmChimeraActivity0 = (EmmChimeraActivity)this.getContext();
                if(emmChimeraActivity0 != null) {
                    emmChimeraActivity0.u();
                }
            };
            gafg1.c = 7;
            gafg1.d = 0x7F1608FF;  // style:SudGlifButton.Secondary
            gafh gafh1 = gafg1.a();
            this.a.d(gafh1);
            glifLayout0.K(this.z());
            if(hpwu.c()) {
                akrh.b(glifLayout0);
            }
        }
        TextView textView0 = (TextView)bagy0.a().findViewById(0x7F0B0C03);  // id:auth_device_management_download_app_name
        textView0.setText(this.getArguments().getString("package_display_name"));
        if(hpwu.d()) {
            gaja.a(textView0);
        }
        return bagy0.a();
    }

    final CharSequence y(int v, CharSequence[] arr_charSequence) {
        return TextUtils.expandTemplate(this.getResources().getTextArray(v)[this.getArguments().getInt("variant_index")], arr_charSequence);
    }

    private final CharSequence z() {
        int v = this.getArguments().getInt("package_install_state");
        if(v == 1) {
            return this.y(0x7F030005, new CharSequence[]{this.getArguments().getString("package_display_name")});  // array:auth_device_management_download_description
        }
        return v == 2 ? this.y(0x7F03000C, new CharSequence[]{this.getArguments().getString("package_display_name")}) : this.y(0x7F03000B, new CharSequence[]{this.getArguments().getString("package_display_name")});  // array:auth_device_management_update_description
    }
}

