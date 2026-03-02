import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import j..util.Optional;

final class ebdy {
    public static final bboh a;
    public final dqib b;

    static {
        ebdy.a = bboh.b("Pay", bbcu.cZ);
    }

    public ebdy(dqib dqib0) {
        this.b = dqib0;
    }

    static ebdy a(Context context0, String s, String s1) {
        String s2 = dlmj.b(context0, s);
        if(TextUtils.isEmpty(s) || TextUtils.isEmpty(s2)) {
            throw new cjuh(5, null);
        }
        dola dola0 = dlmg.a(AppContextProvider.a(), s, s2);
        dmgr dmgr0 = new dmgr(s1);
        return new ebdy(new dqib(dmhh.b(dlnj.a(), dolf.b(dola0), dole.b(dola0), dmgy.a(), dmgr0.a, Optional.empty()), new dmgo(dlnj.a(), new dmkl(dlnj.a()))));
    }
}

