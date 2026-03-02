import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

public final class azsm {
    private static final bboh a;
    private static int b;
    private static List c;
    private static final Object d;

    static {
        azsm.a = bboh.b("AllowlistUrlChecker", bbcu.N);
        azsm.d = new Object();
    }

    public final boolean a(String s) {
        String s3;
        List list0;
        Uri uri0 = Uri.parse(s);
        if(!TextUtils.isEmpty(uri0.toString()) && !TextUtils.isEmpty(uri0.getHost())) {
            String s1 = hrzg.a.b().a();
            if(azsm.b == s1.hashCode()) {
                list0 = azsm.c;
            }
            else {
                synchronized(azsm.d) {
                    azsm.b = s1.hashCode();
                    ggdy ggdy0 = new ggdy();
                    for(Object object1: gfud.e(',').i().d().l(s1)) {
                        String s2 = (String)object1;
                        if(!s2.contains("://")) {
                            s3 = "https://" + s2;
                        }
                        else if(s2.startsWith("http://")) {
                            ((ggtj)azsm.a.j()).B("Plain-text traffic is disallowed for %s", s2);
                            continue;
                        }
                        else {
                            s3 = s2;
                        }
                        String s4 = Uri.parse(s3).getPath();
                        if(s4 != null && s4.contains("/")) {
                            ggdy0.i(s3);
                        }
                        else {
                            ((ggtj)azsm.a.j()).B("Ignoring invalid allowlist entry: %s", s2);
                        }
                    }
                    list0 = ggdy0.h();
                    azsm.c = list0;
                }
            }
            ggqk ggqk0 = ((gged_interceptors)list0).E();
            while(ggqk0.hasNext()) {
                Object object2 = ggqk0.next();
                if(s.startsWith(((String)object2))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}

