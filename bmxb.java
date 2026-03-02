import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.fido.fido2.ui.hybrid.LinkedDevicesSettingsChimeraActivity;

public final class bmxb implements View.OnClickListener {
    public final LinkedDevicesSettingsChimeraActivity a;

    public bmxb(LinkedDevicesSettingsChimeraActivity linkedDevicesSettingsChimeraActivity0) {
        this.a = linkedDevicesSettingsChimeraActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        LinkedDevicesSettingsChimeraActivity linkedDevicesSettingsChimeraActivity0 = this.a;
        if(linkedDevicesSettingsChimeraActivity0.j) {
            fyju fyju0 = new fyju(linkedDevicesSettingsChimeraActivity0);
            fyju0.O("Delete connections with other devices?");
            fyju0.D("You\'ll have to scan a QR code to use passkeys on this device that come from other devices");
            fyju0.L(0x7F15114E, new bmwv(linkedDevicesSettingsChimeraActivity0));  // string:fido_delete_connections "Delete connections"
            fyju0.F(0x7F1507F2, new bmww());  // string:common_cancel "Cancel"
            fyju0.a();
            return;
        }
        iv iv0 = new iv(linkedDevicesSettingsChimeraActivity0);
        iv0.setTitle("Clear devices?");
        iv0.n("By continuing, you will clear all the links to devices where a QR code was scanned");
        iv0.setPositiveButton(0x7F150908, new bmwx(linkedDevicesSettingsChimeraActivity0));  // string:common_yes "Yes"
        iv0.setNegativeButton(0x7F15089C, new bmwy());  // string:common_no "No"
        iv0.a();
    }
}

