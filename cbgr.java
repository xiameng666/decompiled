import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager.ModuleInfo;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.modules.core.AppContextProvider;
import java.util.Collection;

public final class cbgr {
    public static final cbgs a() {
        try {
            Collection collection0 = ModuleManager.get(AppContextProvider.a()).getAllModules();
            ibuq.e(collection0, "getAllModules(...)");
            for(Object object0: collection0) {
                if(!ibuq.m(((ModuleManager.ModuleInfo)object0).moduleId, "com.google.android.gms.kids")) {
                    continue;
                }
                goto label_8;
            }
            object0 = null;
        label_8:
            if(((ModuleManager.ModuleInfo)object0) != null) {
                ibuq.e(((ModuleManager.ModuleInfo)object0).moduleApk.apkPackageName, "apkPackageName");
                return new cbgs(((ModuleManager.ModuleInfo)object0).moduleApk.apkPackageName, ((ModuleManager.ModuleInfo)object0).moduleApk.apkVersionCode, ((ModuleManager.ModuleInfo)object0).moduleVersion);
            }
        }
        catch(InvalidConfigException invalidConfigException0) {
            a.ae(cbgs.b.j(), "Failed to get current supervision app info", invalidConfigException0);
        }
        return cbgs.a;
    }
}

