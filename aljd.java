import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public final class aljd extends de {
    public static final baun ag;

    static {
        aljd.ag = new baun("ProximityAuth", new String[]{"DisableBetterTogether"});
    }

    @Override  // de
    public final Dialog onCreateDialog(Bundle bundle0) {
        aliu aliu0 = new aliu();
        aliu0.b("better_together_settings_open_disable_dialog_count");
        aliu0.c();
        xob xob0 = (xob)this.requireContext();
        Bundle bundle1 = this.requireArguments();
        String s = bundle1.getString("accountName");
        boolean z = bundle1.getBoolean("isFromPhoneHubNotification");
        int v = bundle1.getBoolean("isFromMaterialNext") ? 0x7F0E02E8 : 0x7F0E02E7;  // layout:disable_better_together_material_next_dialog
        View view0 = xob0.getLayoutInflater().inflate(v, null);
        ((TextView)view0.findViewById(0x7F0B115C)).setText(s);  // id:disable_dialog_acount_name
        AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(xob0);
        alertDialog$Builder0.setTitle(0x7F150DC5);  // string:disable_better_together_dialog_title "Forget Chromebook?"
        alertDialog$Builder0.setView(view0);
        alertDialog$Builder0.setPositiveButton(0x7F15082E, new aljc(this, aliu0, z, s));  // string:common_forget "Forget"
        alertDialog$Builder0.setNegativeButton(0x7F1507F2, null);  // string:common_cancel "Cancel"
        return alertDialog$Builder0.create();
    }

    public static aljd y(String s, boolean z, boolean z1) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("accountName", s);
        bundle0.putBoolean("isFromPhoneHubNotification", z);
        bundle0.putBoolean("isFromMaterialNext", z1);
        aljd aljd0 = new aljd();
        aljd0.setArguments(bundle0);
        return aljd0;
    }
}

