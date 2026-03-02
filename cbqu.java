import android.os.Bundle;
import android.view.View;

public final class cbqu extends cbqn {
    public static final bboh b;

    static {
        cbqu.b = bboh.b("CreateUserFragment", bbcu.ac);
    }

    public cbqu() {
        super(0x7F0E024C);  // layout:create_and_switch_user
    }

    public final void E() {
        fyju fyju0 = new fyju(xoc.b(this), 0x7F160DA6);  // style:ThemeOverlay.GoogleMaterial.MaterialAlertDialog.Centered
        fyju0.N(0x7F15016C);  // string:already_on_device_title "Account already on device"
        fyju0.C(0x7F15016B);  // string:already_on_device_message "This child account has already been added to this 
                              // device"
        fyju0.L(0x7F15016A, new cbqp(this));  // string:already_on_device_button "Select another account"
        fyju0.create().show();
    }

    public final void F() {
        this.setArguments(null);
        ca ca0 = new ca(this.getChildFragmentManager());
        ca0.z(0x7F0B101B, new cbqx(), "fragment");  // id:create_supervised_user
        ca0.b();
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.requireContext();
        if(this.getArguments() == null) {
            xoc.b(this).finish();
            return;
        }
        Bundle bundle1 = this.requireArguments();
        String s = bundle1.getString("authAccount", null);
        String s1 = bundle1.getString("obfuscated_gaia_id", null);
        Bundle bundle2 = bundle1.getBundle("accountSessionBundle");
        if(s != null && s1 != null && bundle2 != null) {
            icbb.b(lpt.a(this), null, null, new cbqt(this, s, s1, bundle2, null), 3);
            return;
        }
        ((ggtj)cbqu.b.i()).x("Invalid arguments");
        this.F();
    }

    @Override  // cbqn
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        super.onViewCreated(view0, bundle0);
        this.C();
    }
}

