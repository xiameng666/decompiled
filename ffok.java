import android.app.Application;
import com.google.android.gms.chimera.modules.westworld.AppContextProvider;
import com.google.android.gms.westworld.InitOperation;

public class ffok extends avzf implements eixj, ejbp {
    private volatile eizy a;
    private final Object b;
    private boolean c;

    public ffok() {
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
            ((ffnt)this.h()).g(((InitOperation)this));
        }
    }
}

