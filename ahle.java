import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager.ModuleInfo;
import com.google.android.chimera.config.ModuleManager.ModuleSetInfo;
import com.google.android.chimera.config.ModuleManager;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

final class ahle {
    public final ModuleManager a;
    public final ActivityManager b;
    private static WeakReference c;
    private final cchj d;
    private final PackageManager e;

    static {
        ahle.c = new WeakReference(null);
    }

    public ahle(Context context0) {
        ModuleManager moduleManager0 = ModuleManager.get(context0);
        PackageManager packageManager0 = context0.getPackageManager();
        cchj cchj0 = cchj.b(context0);
        ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
        super();
        batl.s(context0);
        this.a = moduleManager0;
        this.e = packageManager0;
        this.d = cchj0;
        this.b = activityManager0;
    }

    static ahle a(Context context0) {
        ahle ahle0;
        synchronized(ahle.class) {
            ahle0 = (ahle)ahle.c.get();
            if(ahle0 == null) {
                ahle ahle1 = new ahle(context0);
                ahle.c = new WeakReference(ahle1);
                return ahle1;
            }
        }
        return ahle0;
    }

    public final void b() {
        Log.i("AuthEarlyUpdate", "[EUActionHelper]Performing removeGoogleAccounts()");
        cchj cchj0 = this.d;
        ArrayList arrayList0 = new ArrayList(Arrays.asList(cchj0.p("com.google")));
        Collections.addAll(arrayList0, cchj0.p("com.google.work"));
        try {
            for(Object object0: arrayList0) {
                cchj0.m(((Account)object0));
            }
        }
        catch(OperationCanceledException | IOException | AuthenticatorException exception0) {
            Log.e("AuthEarlyUpdate", String.format("[EUActionHelper]Exception removing account."), exception0);
        }
    }

    public final boolean c() {
        return this.d() == 2;
    }

    public final int d() {
        ModuleManager.ModuleInfo moduleManager$ModuleInfo0;
        String s = hpoy.e();
        PackageInfo packageInfo0 = null;
        try {
            Collection collection0 = null;
            collection0 = this.a.getAllModules();
        }
        catch(InvalidConfigException unused_ex) {
        }
        if(collection0 == null) {
            Log.w("AuthEarlyUpdate", String.format("[EUActionHelper]Was not able to fetch list of modules or list is emptry!"));
        }
        else {
            for(Object object0: collection0) {
                moduleManager$ModuleInfo0 = (ModuleManager.ModuleInfo)object0;
                if(!s.equals(moduleManager$ModuleInfo0.moduleId)) {
                    continue;
                }
                goto label_15;
            }
            Log.w("AuthEarlyUpdate", String.format(a.a(s, "[EUActionHelper]ModuleId: ", " is not found in the list of modules.")));
        }
        moduleManager$ModuleInfo0 = null;
    label_15:
        if(moduleManager$ModuleInfo0 == null) {
            Log.w("AuthEarlyUpdate", String.format("[EUActionHelper]Critical G.moduleInSidecar is not found in list of modules!"));
            return 3;
        }
        if(!"com.google.android.gms".equals(moduleManager$ModuleInfo0.moduleApk.apkPackageName)) {
            try {
                String s1 = hpoy.f();
                packageInfo0 = this.e.getPackageInfo(s1, 0);
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            if(packageInfo0 != null && (packageInfo0.applicationInfo.flags & 0x80) != 0) {
                return 2;
            }
            try {
                boolean z = false;
                Iterator iterator1 = this.a.getCurrentConfig().moduleSets.iterator();
            alab1:
                while(true) {
                    if(!iterator1.hasNext()) {
                        return z ? 6 : 9;
                    }
                    Object object1 = iterator1.next();
                    ModuleManager.ModuleSetInfo moduleManager$ModuleSetInfo0 = (ModuleManager.ModuleSetInfo)object1;
                    try {
                        byte[] arr_b = moduleManager$ModuleSetInfo0.getProtoBytes();
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)giju.a), arr_b, 0, arr_b.length, hftc.a);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        Iterator iterator2 = ((giju)hftv0).g.iterator();
                        do {
                            if(!iterator2.hasNext()) {
                                continue alab1;
                            }
                            Object object2 = iterator2.next();
                        }
                        while(!"auth_suw".equals(((String)object2)));
                        break;
                    }
                    catch(hfur unused_ex) {
                        Log.w("AuthEarlyUpdate", String.format(("[EUActionHelper]Can\'t parse module set " + moduleManager$ModuleSetInfo0.moduleSetId + "; ignoring")));
                        z = true;
                    }
                }
            }
            catch(InvalidConfigException invalidConfigException0) {
                Log.w("AuthEarlyUpdate", String.format(("[EUActionHelper]Failed to get module config: " + invalidConfigException0.toString())));
                return 7;
            }
            return 2;
        }
        Log.w("AuthEarlyUpdate", String.format("[EUActionHelper]Critical G.moduleInSidecar is loaded from container."));
        return 8;
    }
}

