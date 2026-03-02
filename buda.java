import android.app.Application;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.googleone.AppContextProvider;
import com.google.android.gms.googleone.escalation.account.service.EscalationAccountsChangedIntentOperation;

public class buda extends IntentOperation implements eixj, ejbp {
    private volatile eizy a;
    private final Object b;
    private boolean c;

    public buda() {
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
            ((bucz)this.h()).a(((EscalationAccountsChangedIntentOperation)this));
        }
    }
}

