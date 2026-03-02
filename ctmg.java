import android.app.Application;
import com.google.android.chimera.Service;
import com.google.android.gms.chimera.modules.multidevice.sync.AppContextProvider;
import com.google.android.gms.multidevice.sync.appcast.service.AppCastChimeraService;

public abstract class ctmg extends Service implements eixj, ejbp {
    private volatile eizi a;
    private final Object b;
    private boolean c;

    public ctmg() {
        this.b = new Object();
        this.c = false;
    }

    public final eizi d() {
        if(this.a == null) {
            Object object0 = this.b;
            synchronized(object0) {
                if(this.a == null) {
                    this.a = new eizi(this);
                }
            }
            return this.a;
        }
        return this.a;
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.d();
    }

    @Override  // ejbo
    public final Object h() {
        return this.d().h();
    }

    @Override  // eixj
    public final Application iP() {
        return hrui.c() ? eixi.a(this.getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }

    @Override  // com.google.android.chimera.Service
    public void onCreate() {
        if(!this.c) {
            this.c = true;
            ((ctlm)this.h()).a(((AppCastChimeraService)this));
        }
        super.onCreate();
    }
}

