import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsResponse;

public final class cqmz implements evqf {
    @Override  // evqf
    public final void gw(Object object0) {
        switch(((GetFindMyDeviceSettingsResponse)object0).j) {
            case 13: {
                cqqt.d("This device\'s enrollment in FMDN is still pending", new Object[0]);
                return;
            }
            case 15: {
                cqqt.d("This device\'s enrollment in FMDN still needs repair", new Object[0]);
            }
        }
    }
}

