import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

public final class achv implements bavq {
    final evqp a;
    final bavt b;

    public achv(evqp evqp0, bavt bavt0) {
        this.a = evqp0;
        this.b = bavt0;
        super();
    }

    @Override  // bavq
    public final void a(ModuleInstallStatusUpdate moduleInstallStatusUpdate0) {
        switch(moduleInstallStatusUpdate0.b) {
            case 4: {
                this.a.c(Boolean.valueOf(true));
                this.b.f(this);
                return;
            }
            case 3: 
            case 5: {
                this.a.c(Boolean.valueOf(false));
                this.b.f(this);
            }
        }
    }
}

