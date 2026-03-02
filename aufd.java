import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.config.ModuleManager.FeatureCheck;
import com.google.android.chimera.config.ModuleManager;
import java.util.List;

public final class aufd {
    public static final bboh a;

    static {
        aufd.a = bboh.b("device_suggestions", bbcu.gU);
    }

    public static final boolean a() {
        hfuo hfuo0 = avij.e().f().b;
        ibuq.e(hfuo0, "getElementList(...)");
        boolean z = hfuo0.size() == 1 && ibzk.k(((String)hfuo0.get(0)), "ALL", true);
        if(!z) {
            ((ggtj)aufd.a.h()).B("Only %s are allowed for device suggestions.", hfuo0);
        }
        return z;
    }

    public static final String b(String s) {
        return s == null || s.length() == 0 || ibuq.m(s, "<unknown ssid>") ? "" : s;
    }

    public static final boolean c(Context context0) {
        ibuq.f(context0, "context");
        if(!bbqa.d()) {
            ((ggtj)aufd.a.h()).x("Device suggestions is not supported on current Android SDK.");
            return false;
        }
        if(!avij.e().v()) {
            ((ggtj)aufd.a.h()).x("Device suggestions is_enabled flag is false.");
            return false;
        }
        if(cjmf.b(context0, "android.permission.MEDIA_CONTENT_CONTROL") != 0) {
            ((ggtj)aufd.a.h()).B("Permission %s is not granted.", "android.permission.MEDIA_CONTENT_CONTROL");
            return false;
        }
        if((bbnp.k(context0) || bbnp.n(context0)) && !bbnp.j(context0)) {
            if(avij.e().f().b.isEmpty()) {
                ((ggtj)aufd.a.h()).x("Partner app allowlist is empty for device suggestions.");
                return false;
            }
            return true;
        }
        ((ggtj)aufd.a.h()).x("Device form factor is not supported for device suggestions.");
        return false;
    }

    public static final boolean d(String s) {
        ibuq.f(s, "clientAppName");
        hfuo hfuo0 = ((hgfj)avij.e().m.mr()).b;
        ibuq.e(hfuo0, "getElementList(...)");
        boolean z = hfuo0.contains(s);
        if(z) {
            ((ggtj)aufd.a.h()).B("GMS Suggestion provider disabled for %s", s);
        }
        return z;
    }

    public static final boolean e(ModuleManager moduleManager0) {
        ModuleManager.FeatureCheck moduleManager$FeatureCheck0 = new ModuleManager.FeatureCheck();
        moduleManager$FeatureCheck0.checkFeatureAtAnyVersion(aaxe.b.a);
        return moduleManager0.checkFeaturesAreAvailable(moduleManager$FeatureCheck0) == 0;
    }

    public static final boolean f(Context context0, String s) {
        ibuq.f(context0, "context");
        ibuq.f(s, "clientAppName");
        Intent intent0 = new Intent();
        intent0.setComponent(new ComponentName(s, "androidx.mediarouter.media.MediaTransferReceiver"));
        List list0 = context0.getPackageManager().queryBroadcastReceivers(intent0, 0);
        ibuq.e(list0, "queryBroadcastReceivers(...)");
        int v = list0.isEmpty();
        if(v != 0) {
            ((ggtj)aufd.a.h()).B("OSw integration unsupported by %s.", s);
        }
        return v ^ 1;
    }
}

