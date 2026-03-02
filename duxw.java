import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

public final class duxw implements bavq {
    final duyb a;
    final evqp b;

    public duxw(duyb duyb0, evqp evqp0) {
        this.a = duyb0;
        this.b = evqp0;
        super();
    }

    @Override  // bavq
    public final void a(ModuleInstallStatusUpdate moduleInstallStatusUpdate0) {
        ibuq.f(moduleInstallStatusUpdate0, "update");
        switch(moduleInstallStatusUpdate0.b) {
            case 4: {
                this.a.c.f(this);
                this.b.c(null);
                return;
            }
            case 3: 
            case 5: {
                this.a.c.f(this);
                this.b.d(new RuntimeException("Module installation failed or cancelled with error code: " + moduleInstallStatusUpdate0.e));
            }
        }
    }
}

