import android.app.Application;
import com.google.android.gms.chimera.modules.multidevice.AppContextProvider;
import com.google.android.gms.multidevice.service.features.cards.CrossDeviceServicesContextualCardIntentOperation;

public abstract class ctfr extends ccrr implements eixj, ejbp {
    private volatile eizy a;
    private final Object b;
    private boolean d;

    public ctfr(bbdi bbdi0) {
        super(bbdi0);
        this.b = new Object();
        this.d = false;
    }

    ctfr(bbdi bbdi0, ibrt ibrt0) {
        super(bbdi0, ibrt0);
        this.b = new Object();
        this.d = false;
    }

    public final eizy d() {
        if(this.a == null) {
            Object object0 = this.b;
            synchronized(object0) {
                if(this.a == null) {
                    this.a = new eizy(this);
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

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        if(!this.d) {
            this.d = true;
            ((ctfq)this.h()).c(((CrossDeviceServicesContextualCardIntentOperation)this));
        }
    }
}

