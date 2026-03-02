import android.app.Application;
import com.google.android.chimera.BoundService;
import com.google.android.gms.chimera.modules.multidevice.AppContextProvider;
import com.google.android.gms.multidevice.service.MultideviceBackupAgentChimeraService;

public abstract class ctfb extends BoundService implements eixj, ejbp {
    private volatile eizh a;
    private final Object b;
    private boolean c;

    public ctfb() {
        this.b = new Object();
        this.c = false;
    }

    public final eizh a() {
        if(this.a == null) {
            Object object0 = this.b;
            synchronized(object0) {
                if(this.a == null) {
                    this.a = new eizh(this);
                }
            }
            return this.a;
        }
        return this.a;
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.a();
    }

    @Override  // ejbo
    public final Object h() {
        return this.a().h();
    }

    @Override  // eixj
    public final Application iP() {
        return hrui.c() ? eixi.a(this.getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onCreate() {
        if(!this.c) {
            this.c = true;
            ((ctex)this.h()).i(((MultideviceBackupAgentChimeraService)this));
        }
    }
}

