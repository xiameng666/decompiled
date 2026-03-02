import com.google.android.gms.personalsafety.storage.ScannedDeviceInfo;
import java.util.Comparator;

public final class eike implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Long.compare(((ScannedDeviceInfo)object1).a, ((ScannedDeviceInfo)object0).a);
    }
}

