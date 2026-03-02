import android.content.Context;
import com.google.android.gms.personalsafety.detection.FinderTagInfo;
import com.google.android.gms.personalsafety.storage.ScannedDeviceInfo;

public final class eilr {
    public static String a(Context context0, ScannedDeviceInfo scannedDeviceInfo0) {
        switch(scannedDeviceInfo0.c.a) {
            case 0: {
                return "Apple AirTag";
            }
            case 2: {
                FinderTagInfo finderTagInfo0 = scannedDeviceInfo0.f;
                if(finderTagInfo0 != null) {
                    return gfta.c(finderTagInfo0.b) ? "tracker" : finderTagInfo0.b;
                }
                break;
            }
            case 4: {
                FinderTagInfo finderTagInfo1 = scannedDeviceInfo0.f;
                if(finderTagInfo1 != null) {
                    return gfta.c(finderTagInfo1.b) ? "tracker" : finderTagInfo1.b;
                }
                break;
            }
            default: {
                return "tracker";
            }
        }
        return "tracker";
    }
}

