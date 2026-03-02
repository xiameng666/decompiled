import androidx.activity.result.ActivityResult;
import com.google.android.gms.findmydevice.spot.ChangeFindMyDeviceSettingsRequest;

public final class cqlj implements acn {
    public final cqlu a;

    public cqlj(cqlu cqlu0) {
        this.a = cqlu0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        cqlu cqlu0 = this.a;
        ChangeFindMyDeviceSettingsRequest changeFindMyDeviceSettingsRequest0 = null;
        if(hxwi.j() || hxvi.t()) {
            ChangeFindMyDeviceSettingsRequest changeFindMyDeviceSettingsRequest1 = cqlu0.ah;
            cqlu0.ah = null;
            changeFindMyDeviceSettingsRequest0 = changeFindMyDeviceSettingsRequest1;
        }
        if(((ActivityResult)object0).a != -1) {
            return;
        }
        if((hxwi.j() || hxvi.t()) && changeFindMyDeviceSettingsRequest0 != null) {
            bbqv.a(new cqlh(cqlu0, changeFindMyDeviceSettingsRequest0));
            return;
        }
        cqlu0.L();
    }
}

