import android.app.Application;
import com.google.android.gms.chimera.modules.crisisalerts.AppContextProvider;
import com.google.android.gms.crisisalerts.manager.GcmReceiverChimeraService;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;

public abstract class bgtr extends TracingIntentService implements eixj, ejbp {
    private volatile eizi a;
    private final Object b;
    private boolean c;

    public bgtr(String s) {
        super(s);
        this.b = new Object();
        this.c = false;
    }

    public final eizi b() {
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
        return this.b();
    }

    @Override  // ejbo
    public final Object h() {
        return this.b().h();
    }

    @Override  // eixj
    public final Application iP() {
        return hrui.c() ? eixi.a(this.getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }

    @Override  // com.google.android.chimera.IntentService
    public final void onCreate() {
        if(!this.c) {
            this.c = true;
            ((bgtj)this.h()).e(((GcmReceiverChimeraService)this));
        }
        super.onCreate();
    }
}

