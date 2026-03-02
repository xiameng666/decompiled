import android.content.Intent;
import com.google.android.gms.findmydevice.spot.ChangeFindMyDeviceSettingsRequest;

public final class cqmf implements evqc {
    public final cqne a;
    public final ChangeFindMyDeviceSettingsRequest b;

    public cqmf(cqne cqne0, ChangeFindMyDeviceSettingsRequest changeFindMyDeviceSettingsRequest0) {
        this.a = cqne0;
        this.b = changeFindMyDeviceSettingsRequest0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        cqne cqne0 = this.a;
        if((exception0 instanceof azuh)) {
            acy acy0 = new acy(((azuh)exception0).c().getIntentSender());
            if(hxwi.j() || hxvi.t()) {
                acy0.a = new Intent().putExtra("caller_to_complete_self_provisioning_on_success", true);
                cqne0.ah = this.b;
            }
            cqne0.d.b(acy0.a());
            return;
        }
        cqqt.b(exception0, "Failed to update SPOT with the new FMD settings.", new Object[0]);
        cqpp.a(cqne0);
    }
}

