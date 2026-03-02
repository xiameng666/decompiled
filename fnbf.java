import android.content.SharedPreferences;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class fnbf implements fnbe {
    private final SharedPreferences a;

    public fnbf(SharedPreferences sharedPreferences0) {
        this.a = sharedPreferences0;
    }

    @Override  // fnbe
    public final List a(String s) {
        HashSet hashSet0 = new HashSet();
        Set set0 = this.a.getStringSet(s, hashSet0);
        List list0 = new ArrayList(set0.size());
        for(Object object0: set0) {
            String s1 = (String)object0;
            try {
                ((ArrayList)list0).add(InetAddress.getByAddress(ghjc.f.q(s1)));
            }
            catch(UnknownHostException unused_ex) {
            }
        }
        return list0;
    }

    @Override  // fnbe
    public final void b(String s, List list0) {
        HashSet hashSet0 = new HashSet(list0.size());
        for(Object object0: list0) {
            byte[] arr_b = ((InetAddress)object0).getAddress();
            hashSet0.add(ghjc.f.o(arr_b));
        }
        this.a.edit().putStringSet(s, hashSet0).apply();
    }
}

