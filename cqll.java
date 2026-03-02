import com.google.android.gms.findmydevice.spot.ChangeFindMyDeviceSettingsRequest;

public final class cqll implements Runnable {
    public final cqlu a;

    public cqll(cqlu cqlu0) {
        this.a = cqlu0;
    }

    @Override
    public final void run() {
        ChangeFindMyDeviceSettingsRequest changeFindMyDeviceSettingsRequest0 = new ChangeFindMyDeviceSettingsRequest();
        changeFindMyDeviceSettingsRequest0.d = true;
        evql evql0 = this.a.M(changeFindMyDeviceSettingsRequest0);
        evql0.b(new cqlo(this.a));
        evql0.A(new cqlp(this.a));
    }
}

