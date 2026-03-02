import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import j..util.Objects;

final class duqf implements bavq {
    final duqg a;

    public duqf(duqg duqg0) {
        Objects.requireNonNull(duqg0);
        this.a = duqg0;
        super();
    }

    @Override  // bavq
    public final void a(ModuleInstallStatusUpdate moduleInstallStatusUpdate0) {
        bavy bavy0 = moduleInstallStatusUpdate0.f;
        if(bavy0 != null) {
            this.a.av.setProgress(((int)(bavy0.a * 100L / bavy0.b)));
        }
        int v = moduleInstallStatusUpdate0.b;
        switch(v) {
            case 3: {
                break;
            }
            case 5: {
                v = 5;
                break;
            }
            default: {
                goto label_15;
            }
        }
        if(v == 3) {
            this.a.al.f(7);
            ((ggtj)((ggtj)duqg.a.j()).ar(0x2AEF)).z("Optional mdocstore module installation was cancelled [request listener]. Error code: %d", moduleInstallStatusUpdate0.e);
        }
        else {
            this.a.al.f(6);
            ((ggtj)((ggtj)duqg.a.j()).ar(10990)).z("Optional mdocstore module installation failed [request listener]. Error code: %d", moduleInstallStatusUpdate0.e);
        }
        this.a.ah.f(this);
        this.a.O(6);
    label_15:
        if(v == 4) {
            this.a.ah.f(this);
            this.a.al.f(5);
            this.a.K();
        }
    }
}

