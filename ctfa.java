import android.app.Application;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.multidevice.AppContextProvider;
import com.google.android.gms.multidevice.service.GcmChimeraIntentOperation;

public class ctfa extends IntentOperation implements eixj, ejbp {
    private volatile eizy a;
    private final Object b;
    private boolean c;

    public ctfa() {
        this.b = new Object();
        this.c = false;
    }

    public final eizy b() {
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

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        if(!this.c) {
            this.c = true;
            ((ctev)this.h()).g(((GcmChimeraIntentOperation)this));
        }
    }
}

