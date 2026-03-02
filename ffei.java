import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.SystemProperties;
import android.provider.Settings.Secure;
import android.util.Log;
import j..util.Map.-EL;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ffei implements ffmj {
    public static final AtomicReference a;
    public final boolean b;
    public final ggfp c;
    public final ggfp d;
    public final fdpl e;
    public final Map f;
    public final Map g;
    public final Set h;
    public final AtomicInteger i;
    public final AtomicInteger j;
    public final AtomicInteger k;
    private final PackageManager l;

    static {
        ffei.a = new AtomicReference(null);
    }

    public ffei(Context context0, boolean z) {
        fdpl fdpl0;
        this.f = new ConcurrentHashMap();
        this.g = new ConcurrentHashMap();
        this.i = new AtomicInteger(0);
        this.j = new AtomicInteger(0);
        this.k = new AtomicInteger(0);
        this.b = z;
        this.l = context0.getPackageManager();
        if(z) {
            try {
                if(hzxr.d() && !Build.TYPE.equals("user") && SystemProperties.get("persist.sys.enable_debug_companion", "false").equals("true")) {
                    fdpl0 = ffei.a();
                    if(fdpl0 != null) {
                        ffei.g("Debug companion is enabled. Loaded Debug companion app key");
                        goto label_15;
                    }
                }
            }
            catch(IllegalArgumentException unused_ex) {
            }
            fdpl0 = ffei.c(context0);
        label_15:
            this.e = fdpl0;
            ffei.g(("Companion AppKey: " + fdpl0));
            ggfn ggfn0 = new ggfn();
            ggfn0.i("com.google.android.wearable.app");
            ggfn0.k(ffed.a(context0, "ro.cw.home_package_names", "cw.home_package_names"));
            ggfp ggfp0 = ggfn0.h();
            this.c = ggfp0;
            ffei.g(("Home app package names: " + ggfp0));
            this.h = ggog.m(ggfp0);
            if(this.l()) {
                ggfp ggfp1 = ggfp.G(hzxr.b().b);
                ggqj ggqj0 = ggfp0.om();
                while(ggqj0.hasNext()) {
                    Object object0 = ggqj0.next();
                    this.n(((String)object0), ggfp1);
                }
                ffei.g(("Wear Home app prefix-filter map loaded: " + this.f.toString()));
            }
            ggfp ggfp2 = ffed.a(context0, "ro.oem.home_package_names", "cw.oem_home_package_names");
            this.d = ggfp2;
            ffei.g(("OEM Home app package names: " + ggfp2));
            ggqj ggqj1 = ggfp2.om();
            while(ggqj1.hasNext()) {
                Object object1 = ggqj1.next();
                this.m(((String)object1));
            }
            ffei.g(("OEM Home app prefix-filter map loaded: " + this.g.toString()));
            return;
        }
        this.c = ggnj.a;
        this.d = ggnj.a;
        this.h = ggnj.a;
        this.e = null;
    }

    public static fdpl a() {
        try {
            return fdpn.c(SystemProperties.get("ro.sys.debug_companion_package", ""), SystemProperties.get("ro.sys.debug_companion_digest", ""));
        }
        catch(IllegalArgumentException unused_ex) {
            return null;
        }
    }

    public final fdpl b(fdpl fdpl0) {
        if(this.b && (this.c.contains(fdpl0.b) || this.d.contains(fdpl0.b))) {
            fdpl fdpl1 = this.e;
            if(fdpl1 != null) {
                ffei.g(("AppKey should communicate with companion: " + fdpl0));
                return fdpl1;
            }
        }
        return fdpl0;
    }

    public static fdpl c(Context context0) {
        String s3;
        String s2;
        String s = Settings.Secure.getString(context0.getContentResolver(), "cw.oem_companion_package");
        String s1 = SystemProperties.get("ro.oem.companion_package", "");
        if(!bbqr.d(s1)) {
            s2 = SystemProperties.get("ro.oem.companion_digest", null);
            s3 = SystemProperties.get("ro.oem.companion_signature", null);
        }
        else if(bbqr.d(s)) {
            s2 = SystemProperties.get("ro.oem.companion_digest", null);
            s3 = SystemProperties.get("ro.oem.companion_signature", null);
            s1 = "com.google.android.wearable.app";
        }
        else {
            s3 = Settings.Secure.getString(context0.getContentResolver(), "cw.oem_companion_signature");
            s1 = s;
            s2 = Settings.Secure.getString(context0.getContentResolver(), "cw.oem_companion_digest");
        }
        if(!bbqr.d(s2)) {
            return fdpn.c(s1, s2);
        }
        if(!bbqr.d(s3)) {
            return fdpn.c(s1, fdpn.d(new Signature(s3)));
        }
        ffei.g("Companion App Signature not set, looking up package manager");
        try {
            return fdpn.a(context0, s1);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            throw new IllegalStateException(packageManager$NameNotFoundException0);
        }
    }

    public static ffei d() {
        return (ffei)ffei.a.get();
    }

    public final String f() {
        if(this.b) {
            return this.e == null ? null : this.e.b;
        }
        return null;
    }

    public static void g(String s) {
        if(!Log.isLoggable("MessageReroutingManager", 3)) {
            return;
        }
        Log.d("MessageReroutingManager", s);
    }

    public final void h(String s) {
        if(this.l() && this.c.contains(s)) {
            this.i(s, this.f);
            this.n(s, ggfp.G(hzxr.b().b));
            return;
        }
        if(this.d.contains(s)) {
            this.i(s, this.g);
            this.m(s);
        }
    }

    public final void i(String s, Map map0) {
        for(Object object0: map0.entrySet()) {
            ((Set)((Map.Entry)object0).getValue()).remove(s);
        }
    }

    public final boolean j(String s) {
        return this.b ? this.c.contains(s) || this.d.contains(s) : false;
    }

    public final boolean k(fdpl fdpl0) {
        return this.b && fdpl0.equals(this.e);
    }

    public final boolean l() {
        return bbqa.c() && hzxr.a.c().c();
    }

    private final void m(String s) {
        try {
            ApplicationInfo applicationInfo0 = this.l.getApplicationInfo(s, 0x80);
            if(applicationInfo0.metaData != null && applicationInfo0.metaData.containsKey("wear-oem-home-app-path-prefixes")) {
                ffei.o(s, applicationInfo0.metaData.getString("wear-oem-home-app-path-prefixes"), this.g);
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.println("MessageReroutingManager is " + (this.b ? "available" : "unavailable"));
        if(!this.b) {
            return;
        }
        bbpd0.println("Companion: " + this.e);
        bbpd0.println("Wear Home apps: " + this.c);
        if(this.l()) {
            bbpd0.println("Wear Home app allowlist for bypassing prefix filtering: " + this.h);
            bbpd0.println("Prefix-to-Packages map for Wear Home apps:");
            bbpd0.b();
            for(Object object0: this.f.entrySet()) {
                bbpd0.println(((Map.Entry)object0));
            }
            bbpd0.a();
        }
        bbpd0.println("OEM Home apps: " + this.d);
        bbpd0.println("Prefix-to-Packages map for OEM Home apps:");
        bbpd0.b();
        for(Object object1: this.g.entrySet()) {
            bbpd0.println(((Map.Entry)object1));
        }
        bbpd0.a();
        bbpd0.println("Total number of messages rerouted: " + this.i.get());
        bbpd0.println("Total number of home apps that all messages are rerouted to: " + this.j.get());
        bbpd0.println(String.format(Locale.US, "Average number of different home apps as receivers per message rerouted: %.2f", ((float)(this.i.get() == 0 ? 0.0f : this.j.floatValue() / ((float)this.i.get())))));
        bbpd0.println("Number of messages not rerouted to any home app and hence dropped: " + this.k.get());
    }

    private final void n(String s, Set set0) {
        if(set0.contains(s)) {
            Log.i("MessageReroutingManager", s + " explicitly disables prefix filtering and will stay in the allow list to receive all reroutable messages. Skip loading its declared prefixes.");
            this.h.add(s);
            return;
        }
        try {
            ApplicationInfo applicationInfo0 = this.l.getApplicationInfo(s, 0x80);
            if(applicationInfo0.metaData != null && applicationInfo0.metaData.containsKey("wear-home-app-path-prefixes")) {
                this.h.remove(s);
                ffei.o(s, applicationInfo0.metaData.getString("wear-home-app-path-prefixes"), this.f);
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
    }

    private static final void o(String s, String s1, Map map0) {
        if(s1 != null) {
            for(Object object0: gfud.g(";").i().l(s1)) {
                ((Set)Map.-EL.computeIfAbsent(map0, ((String)object0), new ffeh())).add(s);
            }
        }
    }
}

