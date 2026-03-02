import com.google.android.chimera.config.ModuleManager.ModuleInfo;
import com.google.android.chimera.config.ModuleManager;

public final class bwev {
    public static int a(ModuleManager moduleManager0) {
        try {
            ModuleManager.ModuleInfo moduleManager$ModuleInfo0 = moduleManager0.getCurrentModule();
            return moduleManager$ModuleInfo0 == null ? 0 : moduleManager$ModuleInfo0.moduleVersion;
        }
        catch(IllegalStateException | IndexOutOfBoundsException unused_ex) {
            return 0;
        }
    }
}

