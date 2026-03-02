import android.util.Log;
import java.util.List;

public final class bxcc {
    public static byte[] a(String s, List list0) {
        if(list0.size() % 2 == 0) {
            for(int v = 0; v < list0.size(); v += 2) {
                if(((String)list0.get(v)).equals(s)) {
                    String s1 = (String)list0.get(v + 1);
                    return ghjc.f.e().q(s1);
                }
            }
            Log.w("ShimCertificateManager", s + " package is not registered for Icing AppSearch Shim !!");
            return null;
        }
        Log.w("ShimCertificateManager", "Invalid value found for Shim package certificate allowlist !!");
        return null;
    }
}

