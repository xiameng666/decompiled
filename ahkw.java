import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager.ModuleApkInfo;
import com.google.android.chimera.config.ModuleManager.ModuleInfo;
import com.google.android.chimera.config.ModuleManager;
import java.util.Collection;

public final class ahkw {
    private final ayud a;
    private final int b;

    public ahkw(Context context0) {
        Context context1 = context0.getApplicationContext();
        this.a = new aytt(context1, "ANDROID_AUTH").a();
        ConnectivityManager connectivityManager0 = (ConnectivityManager)context1.getSystemService("connectivity");
        TelephonyManager telephonyManager0 = (TelephonyManager)context1.getSystemService("phone");
        NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
        int v = -10000;
        if(networkInfo0 != null && networkInfo0.isConnected()) {
            int v1 = networkInfo0.getType();
            if(v1 == 0) {
                goto label_13;
            }
            else if(v1 >= 0) {
                v = -v1;
            }
        }
        else {
        label_13:
            int v2 = telephonyManager0.getNetworkType();
            if(v2 != 0) {
                v = v2;
            }
            else if(networkInfo0 != null && networkInfo0.isConnected()) {
                v = 0;
            }
        }
        this.b = v;
    }

    public final void a(Context context0, ghrs ghrs0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghon.a).v_newBuilder();
        ghom ghom0 = ghom.E;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ghon)hftv0).e = ghom0.av;
        ((ghon)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghon ghon0 = (ghon)hftp0.b_message;
        ghrs0.getClass();
        ghon0.E = ghrs0;
        ghon0.c |= 4;
        ghon ghon1 = (ghon)hftp0.N_build();
        hpoy hpoy0 = hpoy.a;
        if(!hpoy0.d().k()) {
            if(hpoy0.d().j()) {
                new bafq(context0, new aytt(context0, "ANDROID_AUTH").a(), null).d(((MessageLite)ghon1));
                return;
            }
            this.a.i(((MessageLite)ghon1)).d();
            return;
        }
        new bafs(context0, 2).a(ghon1);
    }

    public final ghrs b(int v, int v1, ProtoLiteBuilder hftp0, Context context0) {
        ModuleManager.ModuleInfo moduleManager$ModuleInfo0;
        ModuleManager moduleManager0 = ModuleManager.get(context0);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghrs.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        int v2 = -1;
        ((ghrs)hftp1.b_message).c = v - 1;
        ((ghrs)hftp1.b_message).b |= 1;
        String s = hpoy.e();
        PackageInfo packageInfo0 = null;
        try {
            Collection collection0 = null;
            collection0 = moduleManager0.getAllModules();
        }
        catch(InvalidConfigException unused_ex) {
        }
        if(collection0 == null) {
            Log.w("AuthEarlyUpdate", String.format("[ModuleHelper]Was not able to fetch list of modules or list is emptry!"));
        }
        else {
            for(Object object0: collection0) {
                moduleManager$ModuleInfo0 = (ModuleManager.ModuleInfo)object0;
                if(!s.equals(moduleManager$ModuleInfo0.moduleId)) {
                    continue;
                }
                goto label_22;
            }
            Log.w("AuthEarlyUpdate", String.format(a.a(s, "[ModuleHelper]ModuleId: ", " is not found in the list of modules.")));
        }
        moduleManager$ModuleInfo0 = null;
    label_22:
        if(moduleManager$ModuleInfo0 != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((ghrs)hftv0).b |= 4;
            ((ghrs)hftv0).e = moduleManager$ModuleInfo0.moduleVersion;
            ModuleManager.ModuleApkInfo moduleManager$ModuleApkInfo0 = moduleManager$ModuleInfo0.moduleApk;
            if(moduleManager$ModuleApkInfo0 != null) {
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                ((ghrs)hftv1).b |= 16;
                ((ghrs)hftv1).g = moduleManager$ModuleApkInfo0.apkVersionCode;
                boolean z = moduleManager$ModuleInfo0.moduleApk.apkRequired;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ghrs ghrs0 = (ghrs)hftp1.b_message;
                ghrs0.b |= 0x40;
                ghrs0.i = z;
            }
        }
        try {
            packageInfo0 = context0.getPackageManager().getPackageInfo(hpoy.f(), 0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            Log.w("AuthEarlyUpdate", String.format("[ModuleHelper]No package with G.sidecarPackageName was found!"));
        }
        if(packageInfo0 == null) {
            Log.w("AuthEarlyUpdate", String.format("[ModuleHelper]G.sidecarPackageName is not found on device! Sidecar Aps is not updated!"));
        }
        else {
            v2 = packageInfo0.versionCode;
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghrs ghrs1 = (ghrs)hftp1.b_message;
        ghrs1.b |= 0x20;
        ghrs1.h = v2;
        String s1 = context0.getPackageManager().getNameForUid(v1);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghrs ghrs2 = (ghrs)hftp1.b_message;
        s1.getClass();
        ghrs2.b |= 2;
        ghrs2.d = s1;
        if(hftp0 != null) {
            int v3 = this.b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghrx ghrx0 = (ghrx)hftp0.b_message;
            ghrx0.b |= 4;
            ghrx0.e = v3;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ghrs ghrs3 = (ghrs)hftp1.b_message;
            ghrx ghrx1 = (ghrx)hftp0.N_build();
            ghrx1.getClass();
            ghrs3.f = ghrx1;
            ghrs3.b |= 8;
        }
        return (ghrs)hftp1.N_build();
    }
}

