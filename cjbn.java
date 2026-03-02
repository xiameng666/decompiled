import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

public class cjbn extends de {
    protected cjby ag;
    protected int ah;
    protected CharSequence ai;

    protected static fyju A(Context context0) {
        return sku.a(context0) ? new fyju(cjbn.y(context0)) : new fyju(cjbn.y(context0), 0x7F160DD5);  // style:ThemeOverlay.GoogleMaterial3.MaterialAlertDialog.Centered
    }

    public static String B(String s) {
        Resources resources0 = Resources.getSystem();
        try {
            return resources0.getString(resources0.getIdentifier(s, "string", "android"));
        }
        catch(Resources.NotFoundException unused_ex) {
            return null;
        }
    }

    protected final void C() {
        this.D(this.ah, this.ai);
    }

    protected void D(int v, CharSequence charSequence0) {
        this.dismiss();
        cjby cjby0 = this.ag;
        if(cjby0 != null) {
            cjby0.a(new cjbl(v, charSequence0));
        }
    }

    protected static void E(Context context0) {
        Intent intent0;
        try {
            String s = cjbn.B("identity_check_settings_action");
            String s1 = cjbn.B("identity_check_settings_package_name");
            if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
                intent0 = new Intent(s).setPackage(s1);
            }
            else {
                Log.w("GmsBiometricPrompt", "Could not get Identity Check intent from system resources, using default");
                intent0 = new Intent("com.google.android.gms.personalsafety.settings.IDENTITY_CHECK_SWITCH").setPackage("com.google.android.gms");
            }
            context0.startActivity(intent0);
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            Log.e("GmsBiometricPrompt", "Could not launch Identity Check settings activity: " + activityNotFoundException0.getMessage());
        }
    }

    @Override  // de
    public final void onCancel(DialogInterface dialogInterface0) {
        super.onDismiss(dialogInterface0);
        this.C();
    }

    @Override  // de
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        int v = this.requireArguments().getInt("errorCode", 0);
        this.ah = v;
        if(v == 0) {
            throw new IllegalStateException("Erro code must be set");
        }
        this.ai = this.requireArguments().getCharSequence("errorString", "");
        du du0 = this.getParentFragment();
        if(du0 == null) {
            throw new IllegalStateException("view model not found");
        }
        cjby cjby0 = cjbx.d(du0);
        this.ag = cjby0;
        cjby0.b.k(this);
        this.ag.b.g(this, new cjbm(this));
    }

    protected static Context y(Context context0) {
        return sku.a(context0) ? fyhn.a(new adv(context0, 0x7F160467)) : fyhn.a(new adv(context0, 0x7F160C6A));  // style:IdentityCheckErrorDialogWrapperTheme
    }

    protected static Bundle z(int v, CharSequence charSequence0) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("errorCode", v);
        bundle0.putCharSequence("errorString", charSequence0);
        return bundle0;
    }
}

