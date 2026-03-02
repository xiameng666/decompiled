import android.accounts.Account;
import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.chimera.modules.growth.AppContextProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class bvuv {
    public final actb a;
    public final CookieManager b;
    gggc c;
    gged_interceptors d;
    private static final Charset e;
    private static bvuv f;
    private final gmcg g;
    private final ghfz h;

    static {
        bvuv.e = Charset.forName("UTF-8");
    }

    public bvuv(actb actb0, gmcg gmcg0, CookieManager cookieManager0) {
        this.d = ggna.a;
        this.a = actb0;
        batl.s(cookieManager0);
        this.b = cookieManager0;
        this.g = gmcg0;
        this.h = new ghgz(-1514046234);
    }

    public static bvuv a() {
        synchronized(bvuv.class) {
            if(bvuv.f == null) {
                AppContextProvider appContextProvider0 = AppContextProvider.c;
                Context context0 = appContextProvider0 == null ? babh.a() : appContextProvider0.a;
                bvuv.f = new bvuv(new actb(context0), new bblp(0x7FFFFFFF, 9), CookieManager.getInstance());
            }
        }
        return bvuv.f;
    }

    public final evql b(Account account0, String s) {
        bvut bvut0 = new bvut(this, account0, s);
        return evrg.a(this.g, bvut0);
    }

    static String c(String s, String s1) {
        return a.r(s1, s, ":");
    }

    public static List d(String s, CookieManager cookieManager0) {
        List list0 = new ArrayList();
        if(!bbqr.d(s)) {
            String s1 = cookieManager0.getCookie(s);
            if(!bbqr.d(s1)) {
                for(Object object0: gfud.g(";").l(s1)) {
                    String s2 = (String)object0;
                    int v = s2.indexOf(61);
                    if(v > 0) {
                        String s3 = s2.substring(0, v).trim();
                        if(!s3.isEmpty()) {
                            list0.add(new bvuu(s3, s2.substring(v + 1)));
                        }
                    }
                }
            }
        }
        return list0;
    }

    public final void e(Account account0) {
        synchronized(this) {
            gggc gggc0 = this.c;
            StringBuilder stringBuilder0 = new StringBuilder();
            if(gggc0 != null) {
                boolean z = false;
                for(Object object0: gggc0) {
                    String s = (String)object0;
                    List list0 = bvuv.d(s, this.b);
                    if(!list0.isEmpty()) {
                        stringBuilder0.append(s);
                        Collections.sort(list0);
                        for(Object object1: list0) {
                            bvuu bvuu0 = (bvuu)object1;
                            String s1 = bvuu0.a;
                            if(this.d.contains(bvuv.c(s, s1))) {
                                stringBuilder0.append(s1);
                                stringBuilder0.append(bvuu0.b);
                            }
                        }
                        z = true;
                    }
                }
                if(z) {
                    stringBuilder0.append(account0.name);
                    this.h.c(stringBuilder0.toString(), bvuv.e);
                }
            }
        }
    }
}

