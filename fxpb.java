import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.telephony.TelephonyManager;
import com.google.android.gms.chimera.modules.location.base.AppContextProvider;
import com.google.android.location.quake.stages.SettingsChangeListener.1;
import java.util.List;
import java.util.Locale;

public abstract class fxpb extends fxov {
    protected final Context a;
    private final boolean b;
    private final ggfp c;
    private BroadcastReceiver d;

    public fxpb(Context context0, fxnw fxnw0, boolean z, ggfp ggfp0) {
        super(fxnw0);
        this.a = context0;
        this.b = z;
        this.c = ggfp0;
    }

    public int a() {
        if(!bbmn.s(AppContextProvider.a()) && !this.b) {
            return 4;
        }
        ggfp ggfp0 = this.c;
        if(!ggfp0.isEmpty()) {
            TelephonyManager telephonyManager0 = (TelephonyManager)this.a.getSystemService("phone");
            if(telephonyManager0 != null) {
                String s = telephonyManager0.getNetworkCountryIso();
                return gfta.c(s) || !ggfp0.contains(s.toLowerCase(Locale.US)) ? 0 : 19;
            }
        }
        return 0;
    }

    @Override  // fxov
    public final fxou b() {
        int v = this.a();
        if(v != 0) {
            return new fxou(1, v);
        }
        int v1 = this.c();
        return v1 == 0 ? fxou.b : new fxou(2, v1);
    }

    protected int c() {
        Context context0 = this.a;
        if(!cjer_LocationSettings.p(context0)) {
            return 5;
        }
        return bbpr.c(context0) ? 0 : 8;
    }

    public abstract boolean d(String arg1);

    @Override  // fxov
    public final void f() {
        SettingsChangeListener.1 settingsChangeListener$10 = new SettingsChangeListener.1(this);
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.location.MODE_CHANGED");
        intentFilter0.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter0.addAction("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE");
        intentFilter0.addAction("android.intent.action.AIRPLANE_MODE");
        jwe.b(this.a, settingsChangeListener$10, intentFilter0, 2);
        this.d = settingsChangeListener$10;
    }

    @Override  // fxov
    public final void g() {
        BroadcastReceiver broadcastReceiver0 = this.d;
        if(broadcastReceiver0 != null) {
            this.a.unregisterReceiver(broadcastReceiver0);
        }
    }

    public static ggfp h(boolean z, String s) {
        if(z && !gfta.c(s)) {
            ggfn ggfn0 = new ggfn();
            for(Object object0: gfud.e(',').d().i().l(s)) {
                ggfn0.i(((String)object0).toLowerCase(Locale.US));
            }
            return ggfn0.h();
        }
        return ggnj.a;
    }

    protected static boolean i(Context context0) {
        List list0 = bbmn.h(context0, "com.google.android.gms");
        if(list0.isEmpty()) {
            return false;
        }
        for(Object object0: list0) {
            if(bbmn.w(context0, ((Account)object0).name)) {
                return true;
            }
        }
        return false;
    }

    protected static boolean j(Context context0) {
        return ffti.b(context0.getContentResolver(), "network_location_opt_in", -1) == 1;
    }
}

