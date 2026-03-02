import android.content.Intent;
import com.google.android.gms.findmydevice.spot.ChangeFindMyDeviceSettingsRequest;

public final class cqli implements evqc {
    public final cqlu a;
    public final ChangeFindMyDeviceSettingsRequest b;

    public cqli(cqlu cqlu0, ChangeFindMyDeviceSettingsRequest changeFindMyDeviceSettingsRequest0) {
        this.a = cqlu0;
        this.b = changeFindMyDeviceSettingsRequest0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        cqlu cqlu0 = this.a;
        if((exception0 instanceof azuh)) {
            if(cqlu0.ag == null) {
                cqqt.b(exception0, "Failed to update FMD settings - unable to launch resolution activity.", new Object[0]);
                return;
            }
            acy acy0 = new acy(((azuh)exception0).c().getIntentSender());
            if(hxwi.j() || hxvi.t()) {
                acy0.a = new Intent().putExtra("caller_to_complete_self_provisioning_on_success", true);
                cqlu0.ah = this.b;
            }
            acp acp0 = cqlu0.ag;
            gftb.check(acp0);
            acp0.b(acy0.a());
            return;
        }
        cqqt.b(exception0, "Failed to update SPOT with the new FMD settings.", new Object[0]);
        cqpp.a(cqlu0);
    }
}

