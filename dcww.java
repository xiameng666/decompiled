import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

public final class dcww {
    private static final cunf a;
    private static final gfvn b;
    private final dcwv c;

    static {
        dcww.a = new cunf("NearbySharing");
        gfvh gfvh0 = new gfvh();
        gfvh0.o();
        dcww.b = gfvh0.c(new dcwu());
    }

    public dcww(Context context0) {
        this.c = dcww.a(context0);
    }

    public static dcwv a(Context context0) {
        dcwv dcwv0 = null;
        if(!hvqz.D()) {
            return null;
        }
        if(hvqs.bh()) {
            for(Object object0: context0.getPackageManager().getInstalledPackages(0x80)) {
                PackageInfo packageInfo0 = (PackageInfo)object0;
                if(dcwv0 == null) {
                    dcwv0 = dcww.j(packageInfo0.applicationInfo);
                    if(dcwv0 == null) {
                        continue;
                    }
                    dcww.a.b().h("Found vendor metadata for %s", packageInfo0);
                }
                else {
                    if(dcww.j(packageInfo0.applicationInfo) == null) {
                        continue;
                    }
                    dcww.a.e().h("Already found package with vendor metadata, ignoring metadata in %s", packageInfo0);
                }
            }
            return dcwv0;
        }
        if(hvqf.r()) {
            ggqj ggqj0 = dcwi.a(context0).om();
            while(ggqj0.hasNext()) {
                Object object1 = ggqj0.next();
                String s = (String)object1;
                try {
                    dcwv dcwv1 = dcww.j(context0.getPackageManager().getApplicationInfo(s, 0x80));
                    if(dcwv1 != null) {
                        return dcwv1;
                    }
                    dcww.a.d().h("No vendor metadata found for %s", s);
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                }
            }
            return null;
        }
        for(Object object2: hvqs.aS().b) {
            String s1 = (String)object2;
            try {
                dcwv dcwv2 = dcww.j(context0.getPackageManager().getApplicationInfo(s1, 0x80));
                if(dcwv2 != null) {
                    return dcwv2;
                }
                dcww.a.d().h("No vendor metadata found for %s", s1);
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
        }
        return null;
    }

    public static dcww b(Context context0) {
        Context context1 = context0.getApplicationContext();
        return context1 == null ? ((dcww)dcww.b.i(context0)) : ((dcww)dcww.b.i(context1));
    }

    public static void c() {
        dcww.b.g();
    }

    public final boolean d() {
        return this.e() && hvqz.a.b().J() && this.f();
    }

    public final boolean e() {
        return hvrc.B() ? hvqz.D() : hvqz.D() && this.c != null;
    }

    public final boolean f() {
        return this.c != null && this.c.c;
    }

    public final boolean g() {
        return hvrc.B() ? this.e() && this.c != null && hvqz.ae() : this.e() && hvqz.ae();
    }

    public final boolean h() {
        return this.e() && hvqz.a.b().bs();
    }

    public final boolean i() {
        return hvrc.B() ? this.e() && this.c != null && hvqz.aj() : this.e() && hvqz.aj();
    }

    private static dcwv j(PackageItemInfo packageItemInfo0) {
        if(packageItemInfo0 != null) {
            Bundle bundle0 = packageItemInfo0.metaData;
            return bundle0 == null || !bundle0.containsKey("com.google.android.gms.nearby.sharing.UX_REPLACEMENT") && !bundle0.containsKey("com.google.android.gms.nearby.sharing.UX_VERSION") && !bundle0.containsKey("com.google.android.gms.nearby.sharing.VENDOR_ID") ? null : new dcwv(packageItemInfo0.packageName, bundle0.getInt("com.google.android.gms.nearby.sharing.VENDOR_ID", 0), bundle0.getInt("com.google.android.gms.nearby.sharing.UX_VERSION", -1), bundle0.getBoolean("com.google.android.gms.nearby.sharing.UX_REPLACEMENT", false));
        }
        return null;
    }
}

