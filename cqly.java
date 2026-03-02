import com.google.android.gms.findmydevice.spot.ChangeFindMyDeviceSettingsRequest;

public final class cqly implements Runnable {
    public final cqne a;

    public cqly(cqne cqne0) {
        this.a = cqne0;
    }

    @Override
    public final void run() {
        ChangeFindMyDeviceSettingsRequest changeFindMyDeviceSettingsRequest0 = new ChangeFindMyDeviceSettingsRequest();
        changeFindMyDeviceSettingsRequest0.d = true;
        evql evql0 = this.a.M(changeFindMyDeviceSettingsRequest0).e(new cqmy(this.a));
        evql0.b(new cqmz());
        evql0.A(new cqna(this.a));
    }
}

