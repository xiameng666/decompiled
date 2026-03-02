import android.app.Application;
import com.google.android.chimera.BoundService;
import com.google.android.gms.blindauth.services.BlindauthApiService;
import com.google.android.gms.chimera.modules.blindauth.AppContextProvider;

public abstract class atqc extends BoundService implements eixj, ejbp {
    private volatile eizh a;
    private final Object b;
    private boolean c;

    public atqc() {
        this.b = new Object();
        this.c = false;
    }

    public final eizh d() {
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

    protected final void f() {
        if(!this.c) {
            this.c = true;
            ((atpz)this.h()).a(((BlindauthApiService)this));
        }
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
        if(hrui.c()) {
            return eixi.a(this.getBaseContext().getApplicationContext());
        }
        return AppContextProvider.c == null ? null : AppContextProvider.c.b;
    }

    @Override  // com.google.android.chimera.BoundService
    public void onCreate() {
        this.f();
    }
}

