import com.google.android.gms.findmydevice.spot.FindMyDeviceNetworkSettings;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsResponse;

public final class cqpy {
    public static int a(GetFindMyDeviceSettingsResponse getFindMyDeviceSettingsResponse0) {
        FindMyDeviceNetworkSettings findMyDeviceNetworkSettings0 = getFindMyDeviceSettingsResponse0.c;
        gftb.check(findMyDeviceNetworkSettings0);
        int v = findMyDeviceNetworkSettings0.a;
        switch(v) {
            case 3: {
                return 1;
            }
            case 4: {
                return 2;
            }
            default: {
                throw new IllegalArgumentException(String.format("Not a contributor-only state: %d", v));
            }
        }
    }

    public static boolean b(GetFindMyDeviceSettingsResponse getFindMyDeviceSettingsResponse0) {
        return getFindMyDeviceSettingsResponse0.c == null ? false : getFindMyDeviceSettingsResponse0.c.a == 3 || getFindMyDeviceSettingsResponse0.c.a == 4;
    }
}

