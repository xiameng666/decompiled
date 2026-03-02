import android.content.Context;
import com.google.android.chimera.config.ModuleManager;

public final class arej {
    private static final aqql a;

    static {
        arej.a = new aqql(new String[]{"GmsModuleUpdateHelper"});
    }

    public final void a(Context context0) {
        if(hqkj.c()) {
            arej.a.j("Pausing gms module updates", new Object[0]);
            ModuleManager.get(context0).pauseModuleUpdates("D2D_MIGRATION_SOURCE", ((int)hqkj.a.b().a()));
            return;
        }
        arej.a.j("Not pausing gms module updates because flag is off", new Object[0]);
    }

    public final void b(Context context0) {
        if(hqkj.c()) {
            arej.a.j("resuming gms module updates", new Object[0]);
            ModuleManager.get(context0).resumeModuleUpdates("D2D_MIGRATION_SOURCE");
            return;
        }
        arej.a.j("Not resuming gms module updates because flag is off", new Object[0]);
    }
}

