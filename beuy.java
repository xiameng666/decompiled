import android.app.Application;
import com.google.android.gms.chimera.modules.credential.manager.AppContextProvider;
import com.google.android.gms.credential.manager.operations.ModuleInitializer;

public class beuy extends avzf implements eixj, ejbp {
    private volatile eizy a;
    private final Object b;
    private boolean c;

    public beuy() {
        this.b = new Object();
        this.c = false;
    }

    public final eizy f() {
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
        return this.f();
    }

    @Override  // ejbo
    public final Object h() {
        return this.f().h();
    }

    @Override  // eixj
    public final Application iP() {
        return hrui.c() ? eixi.a(this.getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        if(!this.c) {
            this.c = true;
            ((beup)this.h()).e(((ModuleInitializer)this));
        }
    }
}

