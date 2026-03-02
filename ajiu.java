import android.content.Context;
import android.os.Binder;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager.ModuleInfo;
import com.google.android.chimera.config.ModuleManager;
import java.util.Collection;

final class ajiu {
    private static ModuleManager a;

    public static final int a(Context context0) {
        if(ajiu.a == null) {
            ajiu.a = ModuleManager.get(context0);
        }
        try {
            Collection collection0 = ajiu.a.getAllModules();
            if(collection0 != null && !collection0.isEmpty()) {
                for(Object object0: collection0) {
                    ModuleManager.ModuleInfo moduleManager$ModuleInfo0 = (ModuleManager.ModuleInfo)object0;
                    if(moduleManager$ModuleInfo0 != null && moduleManager$ModuleInfo0.moduleId.equals("com.google.android.gms.auth_cryptauth")) {
                        return moduleManager$ModuleInfo0.moduleVersion;
                    }
                }
            }
        }
        catch(InvalidConfigException unused_ex) {
        }
        return 0;
    }

    public static final void b(ghon ghon0) {
        long v = Binder.clearCallingIdentity();
        try {
            ceed.v().c(((ProtoLiteMessage)ghon0)).a();
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }
}

