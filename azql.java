import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.RemoteException;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;
import java.util.Set;

public final class azql {
    private static azql a;
    private static volatile Set b;
    private static volatile Set c;
    private final Context d;
    private volatile String e;

    public azql(Context context0) {
        this.d = context0.getApplicationContext();
    }

    public final azqg a(String s, boolean z, boolean z1) {
        PackageInfo packageInfo0;
        azqg azqg0;
        if(s == null) {
            return new azqg(false, azpg.a, "null pkg", null, -1L);
        }
        if(!z1 && s.equals(this.e)) {
            return azqg.a;
        }
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
        try {
            azpy.c();
            boolean z2 = azpy.g.isPackageGoogleOrPlatformSignedAvailable();
        }
        catch(bjhw | RemoteException exception0) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", exception0);
            goto label_25;
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
        if(z2) {
            azqd azqd0 = new azqd();
            azqd0.a = s;
            azqd0.b(azqk.e(this.d));
            azqd0.b = z;
            azqd0.c = z1;
            azqd0.c(true);
            azqg0 = azpy.a(azqd0.a());
        }
        else {
            try {
            label_25:
                packageInfo0 = this.d.getPackageManager().getPackageInfo(s, 0x8000040);
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                return new azqg(false, azpg.a, "no pkg " + s, packageManager$NameNotFoundException0, -1L);
            }
            if(z1) {
                packageInfo0.packageName = "com.google.android.gms.chimera";
            }
            azqg0 = this.b(packageInfo0, z);
        }
        if(!z1 && azqg0.b) {
            this.e = s;
        }
        return azqg0;
    }

    @Deprecated
    public final azqg b(PackageInfo packageInfo0, boolean z) {
        boolean z1 = azqk.e(this.d);
        if(packageInfo0 == null) {
            return new azqg(false, azpg.a, "null pkg", null, -1L);
        }
        if(packageInfo0.signatures != null && packageInfo0.signatures.length == 1) {
            azpv azpv0 = new azpv(packageInfo0.signatures[0].toByteArray());
            String s = packageInfo0.packageName;
            azqg azqg0 = azpy.d(s, azpv0, z1, z);
            return !azqg0.b || packageInfo0.applicationInfo == null || (packageInfo0.applicationInfo.flags & 2) == 0 || !azpy.d(s, azpv0, false, true).b ? azqg0 : new azqg(false, azpg.a, "debuggable release cert app rejected", null, -1L);
        }
        return new azqg(false, azpg.a, "single cert required", null, -1L);
    }

    public static azql c(Context context0) {
        batl.s(context0);
        synchronized(azql.class) {
            if(azql.a == null) {
                azpy.b(context0);
                azql.a = new azql(context0);
            }
        }
        return azql.a;
    }

    public final void d(String s) {
        try {
            this.k(s).b();
        }
        catch(SecurityException securityException0) {
            this.k(s).b();
            Log.e("GoogleSignatureVerifier", "flaky result", securityException0);
        }
    }

    public final void e(int v) {
        try {
            this.m(v).b();
        }
        catch(SecurityException securityException0) {
            this.m(v).b();
            Log.e("GoogleSignatureVerifier", "flaky result", securityException0);
        }
    }

    public final boolean f(PackageInfo packageInfo0) {
        if(packageInfo0 == null) {
            return false;
        }
        if(azql.j(packageInfo0, false)) {
            return true;
        }
        if(azql.j(packageInfo0, true)) {
            if(azqk.e(this.d)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren\'t accepted on this build.");
        }
        return false;
    }

    public final boolean g(String s) {
        return this.k(s).b;
    }

    public final boolean h(String s) {
        azqg azqg0 = this.l(s, true);
        boolean z = azqg0.b;
        if(!z) {
            Throwable throwable0 = azqg0.e;
            if((throwable0 instanceof PackageManager.NameNotFoundException)) {
                batl.s(throwable0);
                throw (PackageManager.NameNotFoundException)throwable0;
            }
        }
        return z;
    }

    public final boolean i(int v) {
        return this.m(v).b;
    }

    @Deprecated
    static final boolean j(PackageInfo packageInfo0, boolean z) {
        if(z && ("com.android.vending".equals(packageInfo0.packageName) || "com.google.android.gms".equals(packageInfo0.packageName))) {
            ApplicationInfo applicationInfo0 = packageInfo0.applicationInfo;
            if(applicationInfo0 == null) {
                z = false;
            }
            else if((applicationInfo0.flags & 0x81) != 0) {
                z = true;
            }
            else {
                z = false;
            }
        }
        try {
            gged_interceptors gged0 = z ? azpx.b : azpx.a;
            gged_interceptors gged1 = bbms.f(packageInfo0);
            if(!gged1.isEmpty()) {
                return bbms.h(gged1, gged0);
            }
            throw new IllegalArgumentException("Unable to obtain package certificate history.");
        }
        catch(IllegalArgumentException unused_ex) {
            Log.i("GoogleSignatureVerifier", "package info is not set correctly");
            return (z ? azql.n(packageInfo0, azpx.c) : azql.n(packageInfo0, new basd[]{azpx.c[0]})) != null;
        }
    }

    private final azqg k(String s) {
        return this.l(s, false);
    }

    private final azqg l(String s, boolean z) {
        return this.a(s, z, false);
    }

    private final azqg m(int v) {
        String[] arr_s = this.d.getPackageManager().getPackagesForUid(v);
        if(arr_s != null && arr_s.length != 0) {
            azqg azqg0 = null;
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                azqg0 = this.k(arr_s[v1]);
                if(azqg0.b) {
                    return azqg0;
                }
            }
            batl.s(azqg0);
            return azqg0;
        }
        return new azqg(false, azpg.a, "no pkgs", null, -1L);
    }

    private static basd n(PackageInfo packageInfo0, basd[] arr_basd) {
        if(packageInfo0.signatures != null) {
            if(packageInfo0.signatures.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            azpv azpv0 = new azpv(packageInfo0.signatures[0].toByteArray());
            for(int v = 0; v < arr_basd.length; ++v) {
                if(arr_basd[v].equals(azpv0)) {
                    return arr_basd[v];
                }
            }
        }
        return null;
    }
}

