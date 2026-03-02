import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsResponse;

public final class cqlo implements evqf {
    public final cqlu a;

    public cqlo(cqlu cqlu0) {
        this.a = cqlu0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        int v = ((GetFindMyDeviceSettingsResponse)object0).j;
        if(v == 13) {
            cqqt.d("This device\'s enrollment in FMDN is still pending", new Object[0]);
        }
        else if(v == 15) {
            cqqt.d("This device\'s enrollment in FMDN still needs repair", new Object[0]);
        }
        this.a.N();
    }
}

