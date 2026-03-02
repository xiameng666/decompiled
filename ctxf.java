import android.app.Application;
import com.google.android.chimera.android.NotificationListenerService;
import com.google.android.gms.chimera.modules.multidevice.sync.AppContextProvider;
import com.google.android.gms.multidevice.sync.notification.service.NotificationListenerChimeraService;

public class ctxf extends NotificationListenerService implements eixj, ejbp {
    private volatile eizi a;
    private final Object b;
    private boolean c;

    public ctxf() {
        this.b = new Object();
        this.c = false;
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.l();
    }

    @Override  // ejbo
    public final Object h() {
        return this.l().h();
    }

    @Override  // eixj
    public final Application iP() {
        return hrui.c() ? eixi.a(this.getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }

    public final eizi l() {
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

    @Override  // com.google.android.chimera.android.NotificationListenerService
    public void onCreate() {
        if(!this.c) {
            this.c = true;
            ((ctwr)this.h()).d(((NotificationListenerChimeraService)this));
        }
        super.onCreate();
    }
}

