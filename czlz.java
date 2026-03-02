import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.UserManager;

public final class czlz {
    public final UserManager a;
    private final WifiManager b;

    public czlz(Context context0) {
        UserManager userManager0 = (UserManager)context0.getSystemService("user");
        WifiManager wifiManager0 = (WifiManager)context0.getSystemService("wifi");
        super();
        this.a = userManager0;
        this.b = wifiManager0;
    }

    public final boolean a() {
        return this.b() || bbqa.c() && (this.a != null && this.a.getUserRestrictions().getBoolean("no_add_wifi_config", false)) ? this.b == null || !dagq.c(this.b) : false;
    }

    public final boolean b() {
        UserManager userManager0 = this.a;
        if(userManager0 != null) {
            boolean z = userManager0.isUserOfType("android.os.usertype.full.GUEST");
            if(z) {
                czkq.a.b().p("The current user is GUEST with limit capabilities", new Object[0]);
            }
            return z;
        }
        return false;
    }

    public final boolean c() {
        if(bbqa.c()) {
            return this.a == null ? false : this.a.getUserRestrictions().getBoolean("no_wifi_direct", false);
        }
        return false;
    }
}

