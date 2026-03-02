import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;

public final class dcwi {
    public static final ggfp a(Context context0) {
        ibuq.f(context0, "context");
        ibra ibra0 = new ibra();
        hfuo hfuo0 = hvqs.aS().b;
        ibuq.e(hfuo0, "getElementList(...)");
        ibra0.addAll(hfuo0);
        for(Object object0: ibzk.T(hvqf.p(), new String[]{","}, 0, 6)) {
            String s = (String)object0;
            String s1 = ibzk.z(s, ":", s);
            if(hvqf.r()) {
                String s2 = ibzk.w(s, ":", s);
                try {
                    if(!ibuq.m(bbmq.s(context0, s1, "SHA1"), s2)) {
                        continue;
                    }
                    ibra0.add(s1);
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    dcvz.a.d().h("Package %s not present on device.", s1);
                }
            }
            else {
                ibra0.add(s1);
            }
        }
        return ggdx.d(ibqg.a(ibra0));
    }
}

