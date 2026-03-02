import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import j..util.Objects;

final class auil implements bavq {
    final auim a;
    private final bavt b;
    private final aufo c;

    public auil(auim auim0, bavt bavt0, aufo aufo0) {
        Objects.requireNonNull(auim0);
        this.a = auim0;
        super();
        this.b = bavt0;
        this.c = aufo0;
    }

    @Override  // bavq
    public final void a(ModuleInstallStatusUpdate moduleInstallStatusUpdate0) {
        int v = moduleInstallStatusUpdate0.b;
        int v1 = moduleInstallStatusUpdate0.e;
        switch(v) {
            case 1: {
                auim.a.c("Usonia install pending", new Object[0]);
                return;
            }
            case 2: {
                auim.a.c("Downloading Usonia...", new Object[0]);
                return;
            }
            case 3: {
                auim.a.c("Usonia download cancelled. Error code: %d", new Object[]{v1});
                this.a.f(1);
                this.b.f(this);
                aufo aufo0 = this.c;
                if(aufo0 != null) {
                    aufo0.a.g.Y(v1);
                    return;
                }
                break;
            }
            case 4: {
                auim.a.c("Usonia install completed successfully", new Object[0]);
                this.b.f(this);
                this.a.f(4);
                aufo aufo1 = this.c;
                if(aufo1 != null) {
                    aufo1.a();
                    return;
                }
                break;
            }
            case 5: {
                auim.a.c("Usonia install failed. Error code: %d", new Object[]{v1});
                this.a.f(1);
                this.b.f(this);
                aufo aufo2 = this.c;
                if(aufo2 != null) {
                    aufo2.a.g.ab(v1);
                    return;
                }
                break;
            }
            case 6: {
                auim.a.c("Usonia download completed, installing.", new Object[0]);
                aufo aufo3 = this.c;
                if(aufo3 != null) {
                    aufo3.a.g.q.f();
                    return;
                }
                break;
            }
            default: {
                auim.a.c("Unknown Usonia install state: " + v, new Object[0]);
            }
        }
    }
}

