import android.content.Context;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

public final class audv implements bavq {
    public final aueg a;
    public final Context b;

    public audv(aueg aueg0, Context context0) {
        this.a = aueg0;
        this.b = context0;
    }

    @Override  // bavq
    public final void a(ModuleInstallStatusUpdate moduleInstallStatusUpdate0) {
        ibuq.f(moduleInstallStatusUpdate0, "update");
        bboh bboh0 = aueg.b;
        ggtj ggtj0 = (ggtj)bboh0.h();
        int v = moduleInstallStatusUpdate0.e;
        ggtj0.X("Module install update sessionId: %s, installState: %s, errorCode: %s", Integer.valueOf(moduleInstallStatusUpdate0.a), Integer.valueOf(moduleInstallStatusUpdate0.b), Integer.valueOf(v));
        switch(moduleInstallStatusUpdate0.b) {
            case 4: {
                aueg.m(this.b);
                return;
            }
            case 5: {
                ((ggtj)bboh0.j()).z("Failed to install module: %s", v);
            }
        }
    }
}

