import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

public final class cajc extends de {
    private cjbx ag;

    @Override  // de
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.ag = cjbx.b(this, new cajb(this));
    }

    @Override  // de
    public final void onStart() {
        Drawable drawable0;
        cjbx cjbx0;
        all all0;
        super.onStart();
        if(cjbx.h(this.requireContext())) {
            all0 = cjbx.a(this.requireContext());
        }
        else {
            all0 = new all();
            all0.i = 0x80FF;
            all0.h = true;
            all0.d = this.getString(0x7F1515E0);  // string:intrusiondetection_biometric_auth_dialog_title "Verify it\'s you"
        }
        try {
            all0.c = "Settings";
            cjbx0 = null;
            drawable0 = null;
            drawable0 = this.requireContext().getPackageManager().getApplicationIcon("com.android.settings");
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        if(drawable0 == null) {
            all0.a = 0x7F0804CA;  // drawable:gs_android_security_privacy_vd_theme_48
        }
        else {
            all0.b = jxv.b(drawable0, 0, 0, 7);
        }
        cjbx cjbx1 = this.ag;
        if(cjbx1 == null) {
            ibuq.j("biometricPrompt");
        }
        else {
            cjbx0 = cjbx1;
        }
        cjbx0.e(all0.a());
    }

    public final void y(boolean z) {
        String s;
        Bundle bundle0 = this.getArguments();
        if(bundle0 == null) {
            s = "REQUEST_KEY";
        }
        else {
            s = bundle0.getString("ArgRequestKey");
            if(s == null) {
                s = "REQUEST_KEY";
            }
        }
        llh.a(this, s, jyu.a(new ibns[]{new ibns("AUTH_RESULT_BUNDLE_KEY", Boolean.valueOf(z))}));
        this.dismiss();
    }
}

