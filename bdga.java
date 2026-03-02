import android.view.View.OnClickListener;
import android.view.View;

public final class bdga implements View.OnClickListener {
    public final bdho a;

    public bdga(bdho bdho0) {
        this.a = bdho0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.A().a(gqsm.Nf);
        fyju fyju0 = new fyju(this.a.requireContext());
        fyju0.N(0x7F1526DB);  // string:pwm_export_passwords_title "Export passwords"
        fyju0.C(0x7F1526D7);  // string:pwm_export_passwords_confirmation_dialog_content "Your passwords will be 
                              // visible to anyone who can access the file, including apps."
        fyju0.x(true);
        fyju0.M(this.a.getResources().getText(0x7F1526D6), new bdfs(this.a));  // string:pwm_export_passwords_confirmation_dialog_button "Export"
        fyju0.G(this.a.getResources().getText(0x7F1507F2), null);  // string:common_cancel "Cancel"
        fyju0.create().show();
    }
}

