import androidx.activity.result.ActivityResult;
import com.google.android.gms.findmydevice.spot.ChangeFindMyDeviceSettingsRequest;

public final class cqnb implements acn {
    public final cqne a;

    public cqnb(cqne cqne0) {
        this.a = cqne0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        cqne cqne0 = this.a;
        ChangeFindMyDeviceSettingsRequest changeFindMyDeviceSettingsRequest0 = null;
        if(hxwi.j() || hxvi.t()) {
            ChangeFindMyDeviceSettingsRequest changeFindMyDeviceSettingsRequest1 = cqne0.ah;
            cqne0.ah = null;
            changeFindMyDeviceSettingsRequest0 = changeFindMyDeviceSettingsRequest1;
        }
        if(((ActivityResult)object0).a != -1) {
            return;
        }
        if((hxwi.j() || hxvi.t()) && changeFindMyDeviceSettingsRequest0 != null) {
            bbqv.a(new cqmh(cqne0, changeFindMyDeviceSettingsRequest0));
            return;
        }
        cqne0.L(false);
    }
}

