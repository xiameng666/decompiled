import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

public final class eiuq {
    private final bbsq a;

    public eiuq(bbsq bbsq0) {
        this.a = bbsq0;
    }

    public final boolean a(String s) {
        try {
            PackageInfo packageInfo0 = this.a.e("com.android.vending", 0);
            long v = packageInfo0.getLongVersionCode();
            if(TextUtils.isEmpty(s.trim())) {
                return false;
            }
            Iterator iterator0 = gfud.h(",").i().l(s).iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    return false;
                }
                Object object0 = iterator0.next();
                List list0 = gfud.h(":").i().n(((String)object0));
                try {
                    if(list0.isEmpty()) {
                        continue;
                    }
                    if(list0.size() == 1) {
                        if(v != Long.parseLong(((String)list0.get(0)))) {
                            continue;
                        }
                        break;
                    }
                    if(v < Long.parseLong(((String)list0.get(0))) || v >= Long.parseLong(((String)list0.get(1)))) {
                        continue;
                    }
                    break;
                }
                catch(NumberFormatException numberFormatException0) {
                    eiup.b("NumberFormatException while parsing version list %s", new Object[]{numberFormatException0.getMessage()});
                }
            }
            ApplicationInfo applicationInfo0 = packageInfo0.applicationInfo;
            gftb.check(applicationInfo0);
            return (applicationInfo0.flags & 0x80) != 0;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            eiup.b("Invalid package name %s", new Object[]{packageManager$NameNotFoundException0.getMessage()});
            return false;
        }
    }
}

