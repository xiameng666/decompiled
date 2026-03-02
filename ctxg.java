import android.app.Application;
import com.google.android.chimera.Service;
import com.google.android.gms.chimera.modules.multidevice.sync.AppContextProvider;
import com.google.android.gms.multidevice.sync.notification.service.NotificationSyncChimeraService;

public abstract class ctxg extends Service implements eixj, ejbp {
    private volatile eizi a;
    private final Object b;
    private boolean c;

    public ctxg() {
        this.b = new Object();
        this.c = false;
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.o();
    }

    @Override  // ejbo
    public final Object h() {
        return this.o().h();
    }

    @Override  // eixj
    public final Application iP() {
        return hrui.c() ? eixi.a(this.getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }

    public final eizi o() {
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
            ((ctxb)this.h()).e(((NotificationSyncChimeraService)this));
        }
        super.onCreate();
    }
}

