import com.google.android.gms.personalsafety.storage.ScannedDeviceInfo;
import com.google.android.gms.personalsafety.storage.TagDeviceData;
import java.util.Comparator;

public final class eikf implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        if(((ScannedDeviceInfo)object0) != null) {
            if(((ScannedDeviceInfo)object1) == null) {
                return -1;
            }
            long v = ((ScannedDeviceInfo)object1).a;
            long v1 = ((ScannedDeviceInfo)object0).a;
            if(v1 != v) {
                return -Long.compare(v1, v);
            }
            String s = eikg.b(((ScannedDeviceInfo)object0));
            String s1 = eikg.b(((ScannedDeviceInfo)object1));
            if(s != null && s1 != null && !gfqz.e(s, s1)) {
                return s.compareToIgnoreCase(s1);
            }
            TagDeviceData tagDeviceData0 = ((ScannedDeviceInfo)object0).c;
            TagDeviceData tagDeviceData1 = ((ScannedDeviceInfo)object1).c;
            Integer integer0 = tagDeviceData0.c;
            if(integer0 != null) {
                return tagDeviceData1.c == null || integer0.equals(tagDeviceData1.c) ? tagDeviceData0.b.compareToIgnoreCase(tagDeviceData1.b) : -Integer.compare(integer0.intValue(), tagDeviceData1.c.intValue());
            }
            return tagDeviceData0.b.compareToIgnoreCase(tagDeviceData1.b);
        }
        return -1;
    }
}

