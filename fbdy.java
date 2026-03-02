import android.content.Context;
import com.google.android.chimera.config.ModuleManager.ModuleInfo;
import com.google.android.chimera.config.ModuleManager;

public final class fbdy {
    public static int a(Context context0) {
        ModuleManager.ModuleInfo moduleManager$ModuleInfo0 = ModuleManager.get(context0).getCurrentModule();
        return moduleManager$ModuleInfo0 == null ? 0 : moduleManager$ModuleInfo0.moduleVersion;
    }
}

