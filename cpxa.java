import android.content.Context;
import com.google.android.chimera.config.ModuleManager.ModuleInfo;
import com.google.android.chimera.config.ModuleManager;
import java.util.Iterator;

public final class cpxa {
    public static int a(Context context0) {
        ModuleManager.ModuleInfo moduleManager$ModuleInfo0;
        try {
            Iterator iterator0 = ModuleManager.get(context0).getAllModules().iterator();
            do {
                if(!iterator0.hasNext()) {
                    return -1;
                }
                Object object0 = iterator0.next();
                moduleManager$ModuleInfo0 = (ModuleManager.ModuleInfo)object0;
            }
            while(!moduleManager$ModuleInfo0.moduleId.equals("com.google.android.gms.mdi_download"));
        }
        catch(Exception exception0) {
            fkbp.c("Failed to set mdi download module version: %s", exception0);
            return -1;
        }
        return moduleManager$ModuleInfo0.moduleVersion;
    }
}

