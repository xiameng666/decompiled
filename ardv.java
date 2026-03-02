import android.app.Application;
import com.google.android.chimera.Service;
import com.google.android.gms.backup.d2d.component.D2dEarlySourceChimeraService;
import com.google.android.gms.chimera.modules.backup.d2d.AppContextProvider;

public abstract class ardv extends Service implements eixj, ejbp {
    private volatile eizi a;
    private final Object b;
    private boolean c;

    public ardv() {
        this.b = new Object();
        this.c = false;
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.m();
    }

    @Override  // ejbo
    public final Object h() {
        return this.m().h();
    }

    @Override  // eixj
    public final Application iP() {
        if(hrui.c()) {
            return eixi.a(this.getBaseContext().getApplicationContext());
        }
        return AppContextProvider.c == null ? null : AppContextProvider.c.b;
    }

    public final eizi m() {
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

    @Override  // com.google.android.chimera.Service
    public void onCreate() {
        if(!this.c) {
            this.c = true;
            ((arcb)this.h()).a(((D2dEarlySourceChimeraService)this));
        }
        super.onCreate();
    }
}

