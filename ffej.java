import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Map;

public final class ffej {
    public final ggla a;
    public final ggla b;
    public final Map c;
    private final Map d;

    public ffej(Context context0) {
        gftb.check(context0);
        Context context1 = context0.getApplicationContext();
        ggez ggez0 = new ggez();
        boolean z = ffgp.l();
        for(Object object0: hzzm.b().b) {
            hgih hgih0 = (hgih)object0;
            for(Object object1: hgih0.c) {
                ggez0.j(hgih0.b, ((String)object1));
            }
            if(z) {
                for(Object object2: hgih0.d) {
                    ggez0.j(hgih0.b, ((String)object2));
                }
            }
        }
        if(ffgp.l()) {
            for(Object object3: hzzm.a.c().d().b) {
                hgih hgih1 = (hgih)object3;
                Log.w("OemCompanionVerifier", "buildCompanionAllowList: Adding userdebug test companion [digest=" + hgih1.b + "] to the companion allow list");
                for(Object object4: hgih1.c) {
                    ggez0.j(hgih1.b, ((String)object4));
                }
            }
        }
        this.a = ggez0.e();
        ggez ggez1 = new ggez();
        boolean z1 = ffgp.l();
        for(Object object5: hzzm.a.c().c().b) {
            hgih hgih2 = (hgih)object5;
            for(Object object6: hgih2.c) {
                ggez1.j(hgih2.b, ((String)object6));
            }
            if(z1) {
                for(Object object7: hgih2.d) {
                    ggez1.j(hgih2.b, ((String)object7));
                }
            }
        }
        this.b = ggez1.e();
        this.d = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        PackageManager packageManager0 = context1.getPackageManager();
        for(Object object8: packageManager0.getInstalledPackages(0x80)) {
            this.a(packageManager0, ((PackageInfo)object8).packageName);
        }
    }

    public final void a(PackageManager packageManager0, String s) {
        PackageInfo packageInfo0;
        Signature signature0;
        if(hzzm.d()) {
            String s1 = ffmf.a(s);
            if(this.a.u(s1)) {
                try {
                    signature0 = null;
                    packageInfo0 = packageManager0.getPackageInfo(s, 0x40);
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    Log.w("OemCompanionVerifier", "package does not exist: ", packageManager$NameNotFoundException0);
                    packageInfo0 = null;
                }
                if(packageInfo0 != null) {
                    Signature[] arr_signature = packageInfo0.signatures;
                    if(arr_signature.length != 0) {
                        signature0 = arr_signature[0];
                    }
                    else if(Log.isLoggable("OemCompanionVerifier", 3)) {
                        Log.d("OemCompanionVerifier", "Signature is empty, package name: " + s);
                    }
                }
                if(signature0 == null) {
                    this.d.remove(s1);
                    this.c.remove(s1);
                    return;
                }
                String s2 = ffmf.b(signature0);
                this.d.put(s1, s2);
                this.c.put(s1, s);
            }
        }
    }

    public final boolean b(String s, ggla ggla0) {
        String s1 = ffmf.a(s);
        if(!ggla0.u(s1)) {
            return false;
        }
        String s2 = (String)this.d.get(s1);
        if(s2 == null) {
            Log.w("OemCompanionVerifier", "AllowListed OEM companion is not installed: " + s);
            return false;
        }
        for(Object object0: ggla0.c(s1)) {
            if(s2.equals(((String)object0))) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(String s) {
        return this.b(s, this.a);
    }
}

