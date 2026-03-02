import android.app.Application;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.cobalt.AppContextProvider;
import com.google.android.gms.cobalt.service.CobaltHandleConsentChangeIntentOperation;

public class azny extends IntentOperation implements eixj, ejbp {
    private volatile eizy a;
    private final Object b;
    private boolean c;

    public azny() {
        this.b = new Object();
        this.c = false;
    }

    public final eizy a() {
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
        return this.a();
    }

    @Override  // ejbo
    public final Object h() {
        return this.a().h();
    }

    @Override  // eixj
    public final Application iP() {
        return hrui.c() ? eixi.a(this.getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        if(!this.c) {
            this.c = true;
            ((aznw)this.h()).a(((CobaltHandleConsentChangeIntentOperation)this));
        }
    }
}

