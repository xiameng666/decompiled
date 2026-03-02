import android.accounts.Account;
import android.content.Context;
import android.telephony.TelephonyManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class akww {
    public final alvr a;
    public static final int b;
    private static final bboh c;
    private final Context d;

    static {
        akww.c = alis.a("FeatureSupportProvider");
    }

    public akww(Context context0) {
        this.a = new alvr(context0, hpzt.a.b().f());
        this.d = context0;
    }

    public final evql a() {
        return cpje.a().d(new bblp(1, 10), new akwv(this.d));
    }

    public static gged_interceptors b(Context context0, boolean z) {
        if(!akww.g(context0, false)) {
            return ggna.a;
        }
        ggdy ggdy0 = new ggdy();
        ggdy0.i(gqus.b);
        ggdy0.i(gqus.h);
        ggdy0.i(gqus.j);
        ggdy0.i(gqus.p);
        if(albt.b(context0) && hpzc.i()) {
            ggdy0.i(gqus.n);
        }
        if(hpue.d() && ajlq.b(context0)) {
            ggdy0.i(gqus.d);
        }
        if(hvbk.e() && cpde.a()) {
            ggdy0.i(gqus.f);
        }
        if(z) {
            ggdy0.i(gqus.l);
        }
        return ggdy0.h();
    }

    public final gged_interceptors c(Account account0, List list0) {
        List list1 = this.d(account0);
        ggdy ggdy0 = new ggdy();
        for(Object object0: list0) {
            gqus gqus0 = (gqus)object0;
            if(!list1.contains(gqus0)) {
                ggdy0.i(gqus0);
            }
        }
        for(Object object1: list1) {
            gqus gqus1 = (gqus)object1;
            if(!list0.contains(gqus1)) {
                ggdy0.i(gqus1);
            }
        }
        return ggdy0.h();
    }

    public final List d(Account account0) {
        List list0 = new ArrayList();
        try {
            String s = "feature_list_" + account0.name;
            HashSet hashSet0 = new HashSet();
            Set set0 = this.a.b.getStringSet(s, hashSet0);
        }
        catch(bakb bakb0) {
            throw new IOException(bakb0);
        }
        for(Object object0: set0) {
            String s1 = (String)object0;
            try {
                list0.add(gqus.b(s1));
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                a.e(alvr.a.j(), "Invalid feature: %s", s1, illegalArgumentException0);
            }
        }
        return list0;
    }

    public final List e(Account account0, List list0) {
        return this.a.b(account0, list0);
    }

    public final List f() {
        boolean z = hvcb.g();
        return akww.b(this.d, z);
    }

    public static boolean g(Context context0, boolean z) {
        aliu aliu0 = new aliu();
        if(!context0.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            ((ggtj)akww.c.h()).x("Not supported: BLE unavailable");
            if(z) {
                aliu0.f(2);
            }
            return false;
        }
        hpzt hpzt0 = hpzt.a;
        if(hpzt0.b().i() && context0.getPackageManager().hasSystemFeature("org.chromium.arc")) {
            ((ggtj)akww.c.h()).x("Not supported: ARC++");
            if(z) {
                aliu0.f(3);
            }
            return false;
        }
        if(hpzt0.b().j() && bbpj.a(context0).h()) {
            ((ggtj)akww.c.h()).x("Not supported: work profile");
            if(z) {
                aliu0.f(4);
            }
            return false;
        }
        TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("phone");
        if(telephonyManager0 == null) {
            ((ggtj)akww.c.h()).x("Not supported: TelephonyManager not available");
            if(z) {
                aliu0.f(5);
            }
            return false;
        }
        if(telephonyManager0.getPhoneType() == 0) {
            ((ggtj)akww.c.h()).x("Not supported: TelephonyManager.PHONE_TYPE_NONE");
            if(z) {
                aliu0.f(6);
            }
            return false;
        }
        if(z) {
            aliu0.f(0);
        }
        return true;
    }

    public final boolean h(Account account0, gqus gqus0, boolean z) {
        if(!bbmn.m(this.d, account0)) {
            return false;
        }
        try {
            if(this.a.d(account0, gqus0) == z) {
                return false;
            }
        }
        catch(IOException iOException0) {
            a.e(akww.c.j(), "Could not determine if %s was contained in prefs", gqus0.name(), iOException0);
            if(hpyw.h()) {
                return false;
            }
        }
        if(z) {
            this.a.e(account0, gqus0);
            return true;
        }
        this.a.h(account0, gqus0);
        return true;
    }
}

